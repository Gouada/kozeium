package api.apps.myCalculator.steps;

import static core.Constants.SCREEN_SHOTS_FOLDER;
import static core.Constants.SCREEN_SHOT_FILE_TYPE;

import java.util.Calendar;

import org.junit.Assert;

import api.android.Android;
import api.apps.myCalculator.operations.CalculatorKeyBoard;
import core.CapabilitiesDevice;
import core.FreeDevicefinder;
import core.MyLogger;
import core.manager.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Device;
import runners.TestStarter;

public class CalculatorSteps {

	// private final ADB adb = new ADB();
	// private final String packageID = "com.android.calculator2";//
	// "com.sec.android.app.popupcalculator";
	// private final String activity = "com.android.calculator2.Calculator"; //
	// "com.sec.android.app.popupcalculator.Calculator";
	// private final String deviceID = "Nexus_5X_API_24-Tester1";//
	// adb.getConnectedDevices()[0];
	// // //
	// // Nexus_5X_API_24-Tester1
	// // private final String pattformVersion =
	// adb.getPlattformVersion(deviceID);
	// private static String urlString = "http://127.0.0.1:4723/wd/hub";
	// public static AndroidDriver androidDriver;
	// public static WebDriver remoteDriver;
	// DriverManager drivermanager;

	private Device device;
	private String deviceID;
	private static FreeDevicefinder freeDevicefinder;
	private Calendar timestp;
	private String filename = "calculator_";
	private CalculatorKeyBoard calculator;

	public Device getFreeDevice() {
		freeDevicefinder = FreeDevicefinder.getInstance();
		return freeDevicefinder.findFreeDevice();
	}

	@Given("^I start the calculator$")
	public void i_start_the_calculator() throws Throwable {

		// device = getFreeDevice();
		timestp = Calendar.getInstance();

		// device = findFreeDevice();
		device = getFreeDevice();
		if (device != null) {
			try {
				// on error save screenshot under following name
				filename = filename + device.getDeviceID() + "_" + Long.toString(timestp.getTimeInMillis()) + "."
						+ SCREEN_SHOT_FILE_TYPE;

				calculator = new CalculatorKeyBoard(device.getDeviceID());

				// getting device capabilities
				CapabilitiesDevice capas = TestStarter.getCapas(device, Android.apps.calculator.getPackageID(),
						Android.apps.calculator.getLuncherActivityID());

				deviceID = capas.getDEVICEID();
				DriverManager.createAndroidDriver(capas, device.getPort());

				MyLogger.logger.info("starting test of " + "  " + Android.apps.calculator.getPackageID() + " on "
						+ capas.getDEVICEID() + "  plattform version " + capas.getPLATFORM_VERSION() + " "
						+ Android.apps.calculator.getLuncherActivityID());

				Android.apps.calculator.open(Android.adb.getDeviceID());

				MyLogger.logger.debug(
						"opening " + Android.apps.calculator.getPackageID() + " on " + Android.adb.getDeviceID());

				Assert.assertTrue("the app could not be started", Android.adb.getCurrentAppInForeGround(deviceID)
						.contains(Android.apps.calculator.getPackageID()));
			} catch (Exception e) {
				MyLogger.logger.error("app: " + Android.apps.calculator.getPackageID() + " could not be started");
				Android.adb.saveScreeenShootOnServer(deviceID, filename, SCREEN_SHOTS_FOLDER);
				e.printStackTrace();
			}
		} else {
			MyLogger.logger.error("no free device found");
		}

		// drivermanager = new DriverManager(deviceID, packageID, activity);
		// remoteDriver = drivermanager.createRemoteDriver();
		// androidDriver = DriverManager.createAndroidDriver();
		// DriverManager.createAndroidDriver();
	}

	@When("^I click the first (\\d+)$")
	public void i_click_the_first(int digitValue) throws Throwable {
		calculator.clickADigit(Integer.toString(digitValue));
		// String digitStringValue = "com.android.calculator2:id/digit_" +
		// Integer.toString(digitValue);// com.android.calculator2:id/digit_7

		// androidDriver.findElementByAndroidUIAutomator("new
		// UiSelector().resourceId(\"" + digitStringValue + "\")")
		// .click();
		// androidDriver.findElementById(digitStringValue).click();
		// remoteDriver.findElement(By.xpath("//android.widget.Button[@text='" +
		// Integer.toString(digitValue) + "']"))
		// .click();

	}

	@Then("^I click an operator (\\w+)$")
	public void i_click_an_operator(String operatorValue) throws Throwable {
		calculator.clickAnOperator(operatorValue);
		// String opString = "com.android.calculator2:id/" + operatorValue;
		// androidDriver.findElement(By.xpath("//android.widget.Button[@content-desc='"
		// + operatorValue + "']")).click();

		// androidDriver
		// .findElementByAndroidUIAutomator("new
		// UiSelector().resourceId(\"com.android.calculator2:id/op_add\")")
		// .click();

		// remoteDriver.findElement(By.xpath("//android.widget.Button[@content-desc='"
		// + operatorValue + "']")).click(); // [@resource-id='"
	}

	@And("^I click the second (\\d+)$")
	public void i_click_the_second(int digitValue) throws Throwable {
		calculator.clickADigit(Integer.toString(digitValue));
		// String digitStringValue = "com.android.calculator2:id/digit_" +
		// Integer.toString(digitValue);
		// androidDriver.findElementByAndroidUIAutomator("new
		// UiSelector().resourceId(\"" + digitStringValue + "\")")
		// .click();

		// androidDriver.findElement(By.xpath("//android.widget.Button[@text='"
		// + Integer.toString(digitValue) + "']"))
		// .click();
		// remoteDriver.findElement(By.xpath("//android.widget.Button[@text='5']")).click();
		// [@resource-id='"

	}

	@And("^I click equal$")
	public void i_click_equal() throws Throwable {
		calculator.clickEquals();
		// androidDriver.findElement(By.xpath("//android.widget.Button[@content-desc='equals']")).click();
		// // [@resource-id='"
	}

	@After
	public void finishTest() {
		device.setUsed(false);
		device.setStatus(1L);
		freeDevicefinder.updateDeviceInDeviceListFile(device);
		// jsonReadWriter.updateList(device);
		DriverManager.killDriver(deviceID, Android.apps.navigator.getPackageID());
	}
}
