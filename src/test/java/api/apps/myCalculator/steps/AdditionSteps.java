package api.apps.myCalculator.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.ADB;
import core.manager.DriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;

public class AdditionSteps {

	private final ADB adb = new ADB();

	private final String packageID = "com.android.calculator2";// "com.sec.android.app.popupcalculator";
	private final String activity = "com.android.calculator2.Calculator"; // "com.sec.android.app.popupcalculator.Calculator";
	private final String deviceID = adb.getConnectedDevices()[0]; // Nexus_5X_API_24-Tester1
	// private final String pattformVersion = adb.getPlattformVersion(deviceID);
	private static String urlString = "http://127.0.0.1:4723/wd/hub";
	public static AndroidDriver androidDriver;
	public static WebDriver remoteDriver;
	DriverManager drivermanager;

	@Given("^I start the calculator$")
	public void i_start_the_calculator() throws Throwable {

		drivermanager = new DriverManager(deviceID, packageID, activity);
		// remoteDriver = drivermanager.createRemoteDriver();
		androidDriver = drivermanager.createAndroidDriver();
	}

	@When("^I click the first (\\d+)$")
	public void i_click_the_first(int digitValue) throws Throwable {
		String digitStringValue = "com.android.calculator2:id/digit_" + Integer.toString(digitValue);// com.android.calculator2:id/digit_7

		// androidDriver.findElementByAndroidUIAutomator("new
		// UiSelector().resourceId(\"" + digitStringValue + "\")")
		// .click();
		androidDriver.findElementById(digitStringValue).click();
		// remoteDriver.findElement(By.xpath("//android.widget.Button[@text='" +
		// Integer.toString(digitValue) + "']"))
		// .click();

	}

	@Then("^I click an operator (\\w+)$")
	public void i_click_an_operator(String operatorValue) throws Throwable {
		String opString = "com.android.calculator2:id/" + operatorValue;
		androidDriver.findElement(By.xpath("//android.widget.Button[@content-desc='" + operatorValue + "']")).click();

		// androidDriver
		// .findElementByAndroidUIAutomator("new
		// UiSelector().resourceId(\"com.android.calculator2:id/op_add\")")
		// .click();

		// remoteDriver.findElement(By.xpath("//android.widget.Button[@content-desc='"
		// + operatorValue + "']")).click(); // [@resource-id='"
	}

	@And("^I click the second (\\d+)$")
	public void i_click_the_second(int digitValue) throws Throwable {
		String digitStringValue = "com.android.calculator2:id/digit_" + Integer.toString(digitValue);
		androidDriver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"" + digitStringValue + "\")")
				.click();

		// androidDriver.findElement(By.xpath("//android.widget.Button[@text='"
		// + Integer.toString(digitValue) + "']"))
		// .click();
		// remoteDriver.findElement(By.xpath("//android.widget.Button[@text='5']")).click();
		// [@resource-id='"

	}

	@And("^I click equal$")
	public void i_click_equal() throws Throwable {
		androidDriver.findElement(By.xpath("//android.widget.Button[@content-desc='equals']")).click(); // [@resource-id='"
	}

	// @After
	// public void stopSserver() {
	// drivermanager.killDriver(adb.getDeviceID(), this.packageID);
	// }

}
