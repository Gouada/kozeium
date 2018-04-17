package runners;

/* This class is the main starter class for multi-devices testting (for running same test on multiples devices or running mutiples tests)
 * on different devices it start a separate thread for each test to start on a device.*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.bcel.verifier.exc.AssertionViolatedException;

import core.ADB;
import core.CapabilitiesDevice;
import core.FreeDevicefinder;
import core.JsonReadWriter;
import core.MyLogger;
import core.manager.ServerManager;
import model.Device;

public class TestStarter {

	private static ArrayList<Device> devices;
	private final static ADB adb = new ADB();
	private static JsonReadWriter jsonRW = new JsonReadWriter();
	private static List<String> testClassNames = Arrays.asList("TripPlanerRunner", "CalculatorRunner"); // "NavigationRunner"

	public static void main(String[] args) throws Throwable {
		try {
			// startSameTestOnMultipleDevices("TripPlanerRunner");
			startDifferentsTestOnDifferentDevices(testClassNames);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// retrive connected devices and save found devices into a json-file using
	// the utility class-JsonReadWriter
	public static void getDeviceList() {
		ArrayList<String> connectedDevicesNames = null;
		String plattformVersion = "";
		Device device;

		// retrieving connected devices
		connectedDevicesNames = adb.getConnectedDevices();
		if (connectedDevicesNames != null) {
			MyLogger.logger.info("Connected devices found. Starting creating list of connected devices");
			devices = new ArrayList<>();
			for (String deviceID : connectedDevicesNames) {
				try {
					plattformVersion = adb.getPlattformVersion(deviceID);
					device = new Device(deviceID, false, plattformVersion);
					device.setDeviceLang(adb.getDeviceLang(deviceID));

					devices.add(device);
					MyLogger.logger.info("added " + deviceID + " to device list");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// writing found devie-list into an json-file
			// TO DO UPDATE DEVICE LIST ONLY FROM
			// FREEDEVICEFINDER SINGLETON-CLASS
			jsonRW.writeToFile(devices);
		} else {
			MyLogger.logger.warn("No connected device found");
			throw new AssertionViolatedException("No connected device found");
		}
	}

	// starts a separte thread for each device in device-list
	public static void startSameTestOnMultipleDevices(String testClassName) throws Throwable {
		String command;
		final String finalCommand;
		int i = 0;
		MyLogger.logger.info("Starting Test cases from " + testClassName);
		getDeviceList();

		// maven command for starting testClass. here we need to provide
		// absolute-path to maven
		command = ServerManager.getMavenBinFolder();
		command = command + "//mvn.bat -Dtest=" + testClassName + " test";
		finalCommand = command;

		// TO DO UPDATE DEVICE LIST ONLY FROM
		// FREEDEVICEFINDER SINGLETON-CLASS
		ArrayList<Device> deviceList = jsonRW.readFromFile();
		if (deviceList.size() > 0) {
			for (Device device : deviceList) {
				// check wether a test is already running on the device or is
				// planned t be started
				if (!device.isUsed() && device.getStatus() < 1L) {

					// start test in new thread
					Thread thread = new Thread(new Runnable() {
						@Override
						public void run() {
							// process =
							try {
								Runtime.getRuntime().exec(finalCommand);
								device.setStatus(1L);

								// TO DO UPDATE DEVICE LIST ONLY FROM
								// FREEDEVICEFINDER SINGLETON-CLASS
								jsonRW.updateList(device);
							} catch (IOException e) {
								e.printStackTrace();
							}
							// process.waitFor();
						}
					});
					thread.start();
					MyLogger.logger.info("starting thread " + thread.getId() + " with device " + device.getDeviceID());
				}
				i++;
			}
		} else {
			MyLogger.logger.debug("Device liste is empty");
			throw new Exception("Device liste is empty");
		}
	}

	// starts a separte thread for each device in device-list
	public static void startDifferentsTestOnDifferentDevices(List<String> testClassNames) throws Throwable {
		String command;
		String mvnBinFolder;
		int i = 0;
		getDeviceList();
		// maven command for starting testClass. here we need to provide
		// absolute-path to maven bin folder
		mvnBinFolder = ServerManager.getMavenBinFolder();

		// reading from device list file
		// TO DO UPDATE DEVICE LIST ONLY FROM
		// FREEDEVICEFINDER SINGLETON-CLASS
		ArrayList<Device> deviceList = jsonRW.readFromFile();
		// Test suite to be executed exist and at least one device is connected
		if (deviceList.size() > 0 && testClassNames.size() > 0) {

			// more device available then test suites to be run
			if (deviceList.size() >= testClassNames.size()) {
				for (Device device : deviceList) {
					// incase there is more devices than testClasses re-iterate
					// over testClasse
					if (i == testClassNames.size()) {
						i = 0;
					}
					// maven command for starting cucumber test-class-runner
					command = mvnBinFolder + "//mvn.bat -Dtest=" + testClassNames.get(i) + " test";
					final String finalCommand;
					finalCommand = command;

					// check wether a test is already running on the device or
					// is planned t be started
					if (!device.isUsed() && device.getStatus() < 1L) {
						MyLogger.logger.info("\n\nStarting Test cases from " + testClassNames.get(i) + " with \n"
								+ finalCommand + " on \n" + device.getDeviceID() + "\n\n");
						// start test in new thread
						TestStarterThread testStarterThread = new TestStarterThread(finalCommand, device);
						testStarterThread.setName(device.getDeviceID() + "-" + testClassNames.get(i));
						testStarterThread.start();

						// sleeping may held jenkings for transferring json
						// report files
						// Thread.sleep(5000);
						MyLogger.logger.info("starting thread " + testStarterThread.getId() + " with device "
								+ device.getDeviceID());
					}
					i++;
				}
			} else if (deviceList.size() < testClassNames.size()) {
				for (String testClassName : testClassNames) {
					// maven command for starting cucumber test-class-runner
					command = mvnBinFolder + "//mvn.bat -Dtest=" + testClassNames.get(i) + " test";
					final String finalCommand;
					finalCommand = command;

					// check wether a test is already running on the device or
					// is
					// planned t be started
					Device device = FreeDevicefinder.getInstance().findFreeDevice();
					if (device == null) {
						device = FreeDevicefinder.getInstance().waitForReadyDevice(300);
						if (device == null) {
							throw new Exception("Waited too long for Free device ");
						}
					}
					if (device != null) {
						MyLogger.logger.info("\n\nStarting Test cases from " + testClassName + " with \n" + finalCommand
								+ " on \n" + device.getDeviceID() + "\n\n");
						// start test in new thread
						TestStarterThread testStarterThread = new TestStarterThread(finalCommand, device);
						testStarterThread.start();
						MyLogger.logger.info("starting thread " + testStarterThread.getId() + " with device "
								+ device.getDeviceID());
					}
					i++;
				}
			}
		} else {
			MyLogger.logger.debug("Device liste is empty");
			throw new Exception("Device liste is empty");
		}
	}

	public static CapabilitiesDevice getCapas(Device device, String appPackage, String appActivity) {
		CapabilitiesDevice capas = new CapabilitiesDevice(device.getPlatformVersion(), device.getDeviceID(), appPackage,
				appActivity, null);
		return capas;
	}
}
