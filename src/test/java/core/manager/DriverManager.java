package core.manager;

import static core.constants.Constants.LOCAL_HOST;
import static core.constants.Constants.PORTS;
import static core.constants.Constants.URL_SUFFIX;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.management.RuntimeErrorException;

import org.apache.log4j.Level;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;

import api.android.Android;
import core.ADB;
import core.CapabilitiesDevice;
import core.MyLogger;
import core.constants.Args;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class DriverManager {

	private final static ADB adb = new ADB();
	private static CapabilitiesDevice capas = null;
	private static ArrayList<String> connectedDevices = new ArrayList<>();
	private static ArrayList<String> availableDevices = new ArrayList<>();
	private String appName = "";
	private static String urlString = "";
	private static AndroidDriver<WebElement> driver;
	private WebDriver remoteDriver;

	public final static String node_js = ServerManager.getNodeJSPath()+"//node.exe";// "D:/NonBKU/nodejs/node.exe";
	

	// appium.js used to be appium-server starter this function is assumed in
	// newer appium-versions with
	// /resources/app/node_modules/appium/build/lib/main.js
	private static String appiumjs = "C:\\Users\\Lenovo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
	//private static String appiumjs = ServerManager.getAppiumJSPath()+"//main.js";

	// "D:/Users/GouadaDopavogui2/AppData/Local/Programs/appium-desktop/resources/app/node_modules/appium/build/lib/main.js";
	// D:\NonBKU\Appium\node_modules\appium\bin\appium.js
	private static DriverService driverService;

	public DriverManager() {
		MyLogger.logger.setLevel(Level.DEBUG);
	};

	public DriverManager(String packageID, String activity, String appApkName) {
		try {
			capas = new CapabilitiesDevice();
			capas.setActivity(activity);
			capas.setAppPackage(packageID);
			capas.setAppApkPath(appApkName);
			// getCapabilities(deviceID, packageID, activity, null);
			MyLogger.logger.setLevel(Level.DEBUG);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// public DriverManager(String deviceID, String packageID, String activity)
	// {
	// try {
	// getCapabilities(deviceID, packageID, activity, null);
	// MyLogger.logger.setLevel(Level.DEBUG);
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

	public DriverManager(String deviceID, String packageID, String activity, String path, String appName) {
		try {
			getCapabilities(deviceID, packageID, activity, path);
			this.appName = appName;
			MyLogger.logger.setLevel(Level.DEBUG);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static DesiredCapabilities getCapabilities(String deviceID, String packageID, String activity, String path)
			throws Exception {
		// String deviceID = adb.get
		String plattformversion = adb.getPlattformVersion(deviceID).replace("\n", "");
		MyLogger.logger.info("getting device capabilities for " + deviceID);
		DriverManager.capas = new CapabilitiesDevice(plattformversion, deviceID, packageID, activity, path);

		MyLogger.logger.info("got device capabilities for " + deviceID);
		return capas.getDeviceCapabilities();
	}

	public static void getAvailableDevices() {
		// String[] connectedDevices;
		// String[] avalaiblesDevices = {};
		DriverManager.connectedDevices = adb.getConnectedDevices();
		int i = 0;
		for (String deviceID : DriverManager.connectedDevices) {
			// if (!adb.isAppInstalled(deviceID, capas.getAPP_PACKAGE())) {
			DriverManager.availableDevices.add(deviceID);
			// i++;
			// }
		}
		// return DriverManager.availableDevices;
	}

	// public URL host(String deviceId)
	// {
	// return null
	// }

	// create androidDriver for multitesting
	public static synchronized void createAndroidDriver() throws AppiumServerHasNotBeenStartedLocallyException {
		int j = 0;
		String port = "";
		String foundPort;
		getAvailableDevices();
		try {

			for (String currentDeviceName : DriverManager.availableDevices) {
				if (capas != null) {
					if ((capas.getDEVICEID() == "" || capas.getDEVICEID() == null)) {
						capas.setDeviceName(currentDeviceName);
					}
				}

				MyLogger.logger.info("creating driver for " + currentDeviceName);
				if (!adb.isAppInstalled(currentDeviceName, capas.getAPP_PACKAGE())) {
					// capas.setAppApkPath(path);
					adb.installApp(currentDeviceName, capas.getAPP_PACKAGE());
				}
				// To do change to make multi device testing possible
				if ((isThisPortFree(PORTS[j]))) {
					urlString = LOCAL_HOST + ":" + PORTS[j] + URL_SUFFIX;
					port = PORTS[j];
				} else {
					foundPort = findFreePort(PORTS[j]);
					if (!foundPort.equals("")) {
						urlString = LOCAL_HOST + ":" + foundPort + URL_SUFFIX;
						port = foundPort;
					}
				}
				if (!urlString.equals("")) {
					MyLogger.logger.info("starting appium server at port " + port + " with following url " + urlString
							+ " for device " + currentDeviceName);
					createService(port).start();
					driver = new AndroidDriver<WebElement>(new URL(urlString),
							getCapabilities(currentDeviceName, capas.getAPP_PACKAGE(), capas.getActivity(), null));
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Android.adb = new ADB(currentDeviceName);
					Android.driver = driver;
					MyLogger.logger.info("created driver for " + currentDeviceName);
				}
				j++;
			}
		} catch (Exception e) {
			MyLogger.logger.error("Driver creation failled ...." + e.getStackTrace());
			e.printStackTrace();
		}
		// return this;
	}

	// create androidDriver for multitesting is synchronized du to
	// multithreading to avoid simoultanious driver createion
	public static synchronized void createAndroidDriver(CapabilitiesDevice deviveCapas, String appiumPort)
			throws AppiumServerHasNotBeenStartedLocallyException {
		// int j = 0;
		String port = "";
		String foundPort = "";
		String currentDeviceName = deviveCapas.getDEVICEID();
		String plattform = deviveCapas.getPLATFORM_VERSION();
		AndroidDriver<WebElement> currentDriver;

		try {
			// if (!adb.isAppInstalled(currentDeviceName,
			// capas.getAPP_PACKAGE())) {
			// // capas.setAppApkPath(path);
			// adb.installApp(currentDeviceName, capas.getAPP_PACKAGE());
			// }
			//
			if ((isThisPortFree(appiumPort))) {
				urlString = LOCAL_HOST + ":" + appiumPort + URL_SUFFIX;
				port = appiumPort;
				MyLogger.logger.info("PORT ... "+ appiumPort + " is free");
			} else {
				MyLogger.logger.info("PORT ... "+ appiumPort + " wasn't free hoo!");
				foundPort = findFreePort(appiumPort);
				if (!foundPort.equals("")) {
					urlString = LOCAL_HOST + ":" + foundPort + URL_SUFFIX;
					port = foundPort;
				}
			}
			if (!urlString.equals("")) {
				MyLogger.logger.info("starting appium server at port " + port + " with following url " + urlString
						+ " for device " + currentDeviceName);
				// start appium server on given port
				createService(port).start();

				// saving created driverService into static driverService
				// hashMap
				Android.driverserviceMap.put(currentDeviceName, driverService);
				MyLogger.logger.info("creating driver for " + currentDeviceName);
				// create android driver for given device
				currentDriver = new AndroidDriver<WebElement>(new URL(urlString), getCapabilities(currentDeviceName,
						deviveCapas.getAPP_PACKAGE(), deviveCapas.getActivity(), null));
				currentDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				// no sleep here, will lead to error
				Thread.sleep(500);
				Android.adb = new ADB(currentDeviceName);
				// Android.driver = driver;

				// put created driver in driver hashMap
				Android.driverMap.put(currentDeviceName, currentDriver);

				// currentDriver.getS
				MyLogger.logger.info("created driver for " + currentDeviceName + " \n" + deviveCapas.getAPP_PACKAGE()
						+ deviveCapas.getActivity() + " \n " + urlString);
			}
		} catch (Exception e) {
			MyLogger.logger.error("Driver creation failled for " + currentDeviceName + " on port" + port
					+ e.getStackTrace() + " Message. " + e.getMessage() + " Cause: " + e.getCause());
			e.printStackTrace();
		}
		// return this;
	}

	// create androidDriver for multitesting is synchronized du to
	// multithreading to avoid simoultanious driver createion
	public synchronized RemoteWebDriver createRemoteDriver() {
		try {
			MyLogger.logger.info("creating driver for " + capas.getDEVICEID());
			if (!adb.isAppInstalled(capas.getDEVICEID(), capas.getAPP_PACKAGE())) {
				// adb.installApp(capas.getDEVICE_NAME(), capas.getAppPath(),
				// capas.getAppName());
			}
			remoteDriver = new RemoteWebDriver(new URL(urlString),
					getCapabilities(capas.getDEVICEID(), capas.getAPP_PACKAGE(), capas.getActivity(), null));
			remoteDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println(capas.getDEVICEID() + "..." + capas.getAPP_PACKAGE() + "..." + capas.getActivity());
			MyLogger.logger.info("created driver for " + capas.getDEVICEID());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (RemoteWebDriver) remoteDriver;

	}

	public static synchronized void killDriver(String deviceID, String packageID) {
		if (Android.driverMap.get(deviceID) != null) {
			// adb.stopServer();
			Android.driverMap.get(deviceID).closeApp();
			Android.driverMap.get(deviceID).quit();
			// adb.unInstallApp(deviceID, packageID);
			Android.driverserviceMap.get(deviceID).stop();

			MyLogger.logger.info("killed driver and succesfully uninstalled " + packageID + " from " + deviceID);
		} else {
			MyLogger.logger.debug("No driver to kill for this device " + deviceID);
		}

	}

	// check if port if free before starting appium-instance on that port
	public static synchronized boolean isThisPortFree(String port) throws RuntimeException, IOException {
		String command = "";
		if (ServerManager.isWindows()) {
			command = "netstat -an | findstr " + port;
		} else if (ServerManager.isLinux()) {
			command = "netstat -npl | grep " + port;
		} else {
			MyLogger.logger.debug("Server type is unknown ");
			throw new RuntimeErrorException(null, "Server type is unknown ");
		}
		MyLogger.logger.info("checking port " + port + " is free.");
		return Runtime.getRuntime().exec(command) != null;
	}

	// attempt to find a free port if agiven port is not freem
	public static synchronized String findFreePort(String currentPort) {
		int i = 4;
		int diff = PORTS.length;

		// to do: shouldn't be String.valueOf(Integer.parseInt(Max(PORTS)) +
		// diff);
		String freePortInitValue = String.valueOf(Integer.parseInt(currentPort) + diff);
		String foundFreePort = "";
		try {
			MyLogger.logger.info("looking for free port, as port " + currentPort + " is busy");
			while (i > 1 && (foundFreePort.equals("") || foundFreePort == "" || foundFreePort.isEmpty())) {
				if (isThisPortFree(String.valueOf(Integer.parseInt(freePortInitValue) - i))) {
					foundFreePort = String.valueOf(i + Integer.parseInt(foundFreePort));
				}
				i--;
			}
			if (foundFreePort.equals("")) {
				MyLogger.logger.info("Giving up after trying 3 ports (" + (Integer.parseInt(freePortInitValue) - 1)
						+ ", " + (Integer.parseInt(freePortInitValue) - 2) + ", "
						+ (Integer.parseInt(freePortInitValue) - 3) + ") all busy");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return foundFreePort;
	}

	public static synchronized DriverService createService(String port) {
		// MyLogger.logger.info("PORT......." + port + "........" +
		// LOCAL_HOST.split(":")[1].replace("//", "") + "\n\n\n");
		int bootStrapPort = Integer.valueOf(port) + 1;
		String bootStrapPortStr = Integer.toString(bootStrapPort);
		driverService = new AppiumServiceBuilder().usingDriverExecutable(new File(node_js))
				.withAppiumJS(new File(appiumjs)).withIPAddress(LOCAL_HOST.split(":")[1].replace("//", ""))
				.usingPort(Integer.parseInt(port)).withArgument(Args.BOOTSTRAP_PORT, bootStrapPortStr).build(); // .withArgument(Args.LOG_LEVEL,
		// "ERROR")
		return driverService;

	}
}
