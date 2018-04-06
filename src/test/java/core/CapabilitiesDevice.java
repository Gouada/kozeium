package core;

import java.io.File;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CapabilitiesDevice {
	private static final String BROWSER_NAME = "Android";
	private static final Platform PLATFORM_NAME = Platform.ANDROID;
	private String platformVersion;
	private String deviceName;
	private String appPackage;
	private String activity;
	private String appApkPath;
	// private final String URLSTRING = "http://127.0.0.1:4723/wd/hub"; //
	// 0.0.0.0:4723
	// private WebDriver driver;
	AndroidDriver<WebElement> androiDriver;
	ADB adb = new ADB();

	public CapabilitiesDevice(String platformVersion, String deviceName, String appPackage, String activity,
			String path) {
		setPlatformVersion(platformVersion);
		setDeviceName(deviceName);
		setAppPackage(appPackage);
		setActivity(activity);
		setAppApkPath(path);

	}

	public CapabilitiesDevice(String platformVersion, String deviceName, String path) {
		setPlatformVersion(platformVersion);
		setDeviceName(deviceName);
		setAppApkPath(path);

	}

	public CapabilitiesDevice() {
		// TODO Auto-generated constructor stub
	}

	public void setAppPackage(String appPackage) {
		this.appPackage = appPackage;

	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

	public DesiredCapabilities getDeviceCapabilities() throws InterruptedException {
		DesiredCapabilities desiredCapas = new DesiredCapabilities();

		desiredCapas.setBrowserName(getBROWSER_NAME());
		// desiredCapas.setCapability("unicodeKeyboard", true);

		// desiredCapas.setCapability("resetKeyboard", true);

		desiredCapas.setCapability(MobileCapabilityType.PLATFORM_NAME, getPLATFORM_NAME());
		desiredCapas.setCapability(MobileCapabilityType.PLATFORM_VERSION, getPLATFORM_VERSION());

		desiredCapas.setCapability(MobileCapabilityType.DEVICE_NAME, getDEVICEID());
		desiredCapas.setCapability(MobileCapabilityType.UDID, getDEVICEID());

		desiredCapas.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getAPP_PACKAGE());
		desiredCapas.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getActivity());
		desiredCapas.setCapability("newCommandTimeout", 60);
		// desiredCapas.setCapability("automationName", "UiAutomator2");

		// if(getAppApkPath() == null || getAppApkPath().equal("") )
		// if (adb.isAppInstalled(getDEVICE_NAME(), getAPP_PACKAGE())) {
		// desiredCapas.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
		// getAPP_PACKAGE());
		// desiredCapas.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
		// getActivity());
		// } else {
		// desiredCapas.setCapability("app", getAppApkPath());
		// }

		// try {
		// // driver = new RemoteWebDriver(new
		// // URL("http://127.0.0.1:4723/wd/hub"), desiredCapas);
		// androiDriver = new AndroidDriver<WebElement>(new URL(URLSTRING),
		// desiredCapas);
		//
		// // driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		// // Thread.sleep(10000);
		// } catch (MalformedURLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		return desiredCapas;
	}

	public String getAppApkPath() {
		return appApkPath;
	}

	public void setAppApkPath(String path) {
		if (path != null) {
			File absolutePath = new File(path);
			this.appApkPath = absolutePath.getAbsolutePath();
		}
	}

	public static String getBROWSER_NAME() {
		return BROWSER_NAME;
	}

	public String getPLATFORM_VERSION() {
		return platformVersion.replace("\n", "");
	}

	public static Platform getPLATFORM_NAME() {
		return PLATFORM_NAME;
	}

	public String getDEVICEID() {
		return this.deviceName;
	}

	public String getAPP_PACKAGE() {
		return appPackage;
	}

	public String getActivity() {
		return activity;
	}

	// public RemoteWebDriver getDriver() {
	// return (RemoteWebDriver) this.driver;
	// }

	public void setActivity(String activity) {
		this.activity = activity;
	}

	// public String getUrlString() {
	// // TODO Auto-generated method stub
	// return URLSTRING;
	// }
}
