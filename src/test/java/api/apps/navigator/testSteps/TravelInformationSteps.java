package api.apps.navigator.testSteps;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;

import api.android.Android;
import api.apps.navigator.DBNavigator;
import api.apps.navigator.tripPlaner.TripPlaner;
import core.CapabilitiesDevice;
import core.JsonReadWriter;
import core.MyLogger;
import core.manager.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import model.Device;
import runners.runners.TestStarter;

public class TravelInformationSteps {

	private String deviceID = "";// "emulator-5554";
	private AndroidDriver<WebElement> androidDreiver;
	private TripPlaner tripPlaner; // = new TripPlaner();;
	private DriverManager driverManager;
	private ArrayList<Device> deviceList;
	private final JsonReadWriter jsonReadWriter = new JsonReadWriter();
	private final DBNavigator navigator = Android.apps.navigator;

	public synchronized void setDeviceList() {
		System.out.println("Setting device list");
		MyLogger.logger.info("finding free device ");
		this.deviceList = jsonReadWriter.readFromFile();
	}

	public synchronized Device findFreeDevice() {
		setDeviceList();
		Device foundDevice = null;
		System.out.println("finding free device ");
		MyLogger.logger.info("finding free device ");

		for (Device device : this.deviceList) {
			if (!device.isUsed() && device.getStatus() == 1) {
				foundDevice = device;
				foundDevice.setUsed(true);
				foundDevice.setStatus(2L);
				tripPlaner = new TripPlaner(foundDevice.getDeviceName());

				jsonReadWriter.updateList(foundDevice);
				MyLogger.logger.info("found free device " + device.getDeviceName());
				break;
			}
		}
		return foundDevice;
	}

	@Given("^navigator is started$")
	public void navigator_app_is_startted() throws Throwable {
		Device device = findFreeDevice();
		CapabilitiesDevice capas = TestStarter.getCapas(device, Android.apps.navigator.getPackageID(),
				Android.apps.navigator.getLuncherActivityID());
		deviceID = capas.getDEVICE_NAME();
		DriverManager.createAndroidDriver(capas, device.getPort());
		MyLogger.logger.info("starting test of " + "  " + Android.apps.navigator.getPackageID() + " on "
				+ capas.getDEVICE_NAME() + "  plattform version " + capas.getPLATFORM_VERSION() + " "
				+ Android.apps.navigator.getLuncherActivityID());

		// driverManager = new
		// DriverManager(Android.apps.navigator.getPackageID(),
		// Android.apps.navigator.getLuncherActivityID(), null);
		// androidDreiver = driverManager.createAndroidDriver();
		// DriverManager.createAndroidDriver();
		// androidDreiver = Android.driver;
		Android.apps.navigator.open(Android.adb.getDeviceID());
		MyLogger.logger.debug("opening " + Android.apps.navigator.getPackageID() + " on " + Android.adb.getDeviceID());
	}

	@Then("^I enter the start station (.*)$")
	public void i_enter_the_start_station(String start_station) throws Throwable {
		tripPlaner.clickStartStion();
		tripPlaner.typeStartStionName(start_station + " Hbf");
		tripPlaner.clickStationNameInList(start_station + " Hbf");
	}

	@Then("^I enter the destination station (.*)$")
	public void i_enter_the_destination_station(String destination_station) throws Throwable {
		tripPlaner.clickTargetStation();

		tripPlaner.typeTargetStationName(destination_station + " Hbf");
		tripPlaner.clickStationNameInList(destination_station + " Hbf");
	}

	@Then("^I click the day picker$")
	public void i_click_the_day_picker() throws Throwable {
		tripPlaner.clickDateSelector();
	}

	@Then("^I select the travel date$")
	public void i_select_the_travel_date() throws Throwable {
		tripPlaner.selectStartDate();
	}

	@Then("^I click the done button")
	public void i_click_the_done_button() throws Throwable {
		tripPlaner.clickDoneButton();
	}

	@And("^I click the search button")
	public void i_click_the_search_button() throws Throwable {
		tripPlaner.clickSearchButton();
	}

	@After
	public void finishTest() {
		DriverManager.killDriver(deviceID, Android.apps.navigator.getPackageID());
	}
}
