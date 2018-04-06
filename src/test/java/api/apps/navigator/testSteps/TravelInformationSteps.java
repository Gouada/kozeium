package api.apps.navigator.testSteps;

import static core.Constants.SCREEN_SHOTS_FOLDER;
import static core.Constants.SCREEN_SHOT_FILE_TYPE;

// tripPlaner steps definition
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import api.android.Android;
import api.apps.navigator.DBNavigator;
import api.apps.navigator.tripPlaner.TripConnections;
import api.apps.navigator.tripPlaner.TripInformation;
import api.apps.navigator.tripPlaner.TripItinerary;
import core.CapabilitiesDevice;
import core.FreeDevicefinder;
import core.JsonReadWriter;
import core.MyLogger;
import core.manager.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import model.Device;
import runners.TestStarter;

public class TravelInformationSteps {

	private String deviceID = "";// "emulator-5554";
	private AndroidDriver<WebElement> androidDreiver;
	// private TripPlaner tripPlaner; // = new TripPlaner();;
	private TripInformation tripInformation;
	private TripConnections tripConections;
	private TripItinerary tripItinerary;
	private DriverManager driverManager;
	private ArrayList<Device> deviceList;
	private final JsonReadWriter jsonReadWriter = new JsonReadWriter();
	private final DBNavigator navigator = Android.apps.navigator;
	private Device device;
	private Calendar timestp;
	private String filename;
	private FreeDevicefinder freeDevicefinder;

	// // read json-deviceList
	// public synchronized void setDeviceList() {
	// MyLogger.logger.setLevel(Level.DEBUG);
	// System.out.println("Setting device list");
	// MyLogger.logger.info("reading from connected device list ");
	// this.deviceList = jsonReadWriter.readFromFile();
	// if (this.deviceList == null) {
	// MyLogger.logger.info("device is empty");
	// }
	// }
	//
	// // find a device in device-list and set its status to in-use. this device
	// // cannot be used then parallely for another test
	// public synchronized Device findFreeDevice() {
	// setDeviceList();
	// Device foundDevice = null;
	// System.out.println("finding free device ");
	// MyLogger.logger.info("finding free device ");
	//
	// for (Device device : this.deviceList) {
	// // if free device is found go out of loop
	// if (!device.isUsed() && device.getStatus() == 1) {
	// foundDevice = device;
	// foundDevice.setUsed(true);
	// foundDevice.setStatus(2L);
	//
	// // tripPlaner = new TripPlaner(foundDevice.getDeviceName());
	// tripInformation = new TripInformation(foundDevice.getDeviceID());
	// tripConections = new TripConnections(foundDevice.getDeviceID());
	// tripItinerary = new TripItinerary(foundDevice.getDeviceID());
	//
	// jsonReadWriter.updateList(foundDevice);
	// MyLogger.logger.info("found free device " + foundDevice.getDeviceID());
	// break;
	// }
	// }
	// if (foundDevice == null) {
	// MyLogger.logger.info("no free device found");
	// }
	// return foundDevice;
	// }

	public Device getFreeDevice() {
		freeDevicefinder = FreeDevicefinder.getInstance();
		return freeDevicefinder.findReadyDevice();
	}

	@Given("^navigator is started$")
	public void navigator_app_is_startted() {
		timestp = Calendar.getInstance();

		// on error save screenshot under following name
		filename = deviceID + Long.toString(timestp.getTimeInMillis()) + "." + SCREEN_SHOT_FILE_TYPE;

		// device = findFreeDevice();
		device = getFreeDevice();

		if (device != null) {
			try {

				tripInformation = new TripInformation(device.getDeviceID());
				tripConections = new TripConnections(device.getDeviceID());
				tripItinerary = new TripItinerary(device.getDeviceID());

				// getting device capabilities
				CapabilitiesDevice capas = TestStarter.getCapas(device, Android.apps.navigator.getPackageID(),
						Android.apps.navigator.getLuncherActivityID());

				deviceID = capas.getDEVICEID();
				DriverManager.createAndroidDriver(capas, device.getPort());

				MyLogger.logger.info("starting test of " + "  " + Android.apps.navigator.getPackageID() + " on "
						+ capas.getDEVICEID() + "  plattform version " + capas.getPLATFORM_VERSION() + " "
						+ Android.apps.navigator.getLuncherActivityID());

				Android.apps.navigator.open(Android.adb.getDeviceID());

				MyLogger.logger
						.debug("opening " + Android.apps.navigator.getPackageID() + " on " + Android.adb.getDeviceID());

				Assert.assertTrue("the app could not be started", Android.adb.getCurrentAppInForeGround(deviceID)
						.contains(Android.apps.navigator.getPackageID()));
			} catch (Exception e) {
				MyLogger.logger.error("app: " + Android.apps.navigator.getPackageID() + " could not be started");
				Android.adb.saveScreeenShootOnServer(deviceID, filename, SCREEN_SHOTS_FOLDER);
				e.printStackTrace();
			}
		} else {
			MyLogger.logger.error("no free device found");
		}
	}

	@Then("^I enter the start station (.*)$")
	public void i_enter_the_start_station(String start_station) throws Throwable {
		tripInformation.clickStartStion();

		tripInformation.typeStartStionName(start_station);
		tripInformation.clickStationNameInList(start_station);
	}

	@Then("^I enter the destination station (.*)$")
	public void i_enter_the_destination_station(String destination_station) throws Throwable {
		tripInformation.clickTargetStation();

		tripInformation.typeTargetStationName(destination_station);
		tripInformation.clickStationNameInList(destination_station);
	}

	@Then("^I click the day picker$")
	public void i_click_the_day_picker() throws Throwable {
		tripInformation.clickDateSelector();
	}

	@Then("^I select the travel date$")
	public void i_select_the_travel_date() throws Throwable {
		tripInformation.selectStartDate();
	}

	@Then("^I click the done button$")
	public void i_click_the_done_button() throws Throwable {
		tripInformation.clickDoneButton();
		Assert.assertTrue(tripInformation.activitUIElementsArePresent());
		// Assert.assertTrue(tripInformation.iAmOnTripInformationActivity());
	}

	@And("^I click the search button$")
	public void i_click_the_search_button() throws Throwable {
		timestp = Calendar.getInstance();
		filename = deviceID + Long.toString(timestp.getTimeInMillis()) + "." + SCREEN_SHOT_FILE_TYPE;

		try {
			tripInformation.clickSearchButton();
			Assert.assertTrue("you did not land on connections activity", tripConections.iAmOnConnectionsActivity());
			// Android.adb.saveScreeenShootOnServer(deviceID, filename,
			// SCREEN_SHOTS_FOLDER);
		} catch (Exception e) {
			// //Android.adb.saveScreeenShootOnServer(deviceID, filename,
			// SCREEN_SHOTS_FOLDER);
			// MyLogger.logger.error("FAILED STEP: \"I click the search button\"
			// refer to screenshot for more details "
			// + SCREEN_SHOTS_FOLDER + "/" + filename + "\n" + e.getMessage());
			MyLogger.logger.error(e.getMessage() + e.getStackTrace().toString());
		}
	}

	@And("^I scroll down to later button$")
	public void scrollToLaterButton() {
		tripConections.scrollToLaterButton();
		Assert.assertTrue(tripConections.laterButtonIsVisible());
	}

	@Then("^I scroll up to earlier button$")
	public void scrollToEarlierButton() {
		tripConections.scrollToEarlier();
		Assert.assertTrue(tripConections.earlerButtonIsVisible());
	}

	@Then("^I scroll back to later button$")
	public void scrollBackToLaterButton() {
		tripConections.scrollToLaterButton();
		Assert.assertTrue(tripConections.laterButtonIsVisible());
	}

	@And("^I click later button$")
	public void clickLaterButton() {
		tripConections.clickLaterButton();
		// Assert.assertTrue((!tripConections.laterButtonIsVisible() ||
		// !tripConections.laterButtonIsEnabled()));
		// Assert.assertTrue((!tripConections.laterButtonIsVisible() ||
		// !tripConections.laterButtonIsEnabled()));
	}

	@Then("^I select a trip$")
	public void selectAtrip() {
		tripConections.selectConnection(1);
		// Assert.assertTrue(tripItinerary.iAmOnItineraryActivity());
	}

	@Then("^I click mfe button$")
	public void clickMfeButton() {
		tripItinerary.clickMfeButton();
		Assert.assertTrue(tripItinerary.popUpWindowIsopen());
	}

	@Then("^I click operation days$")
	public void clickOperationDays() {
		timestp = Calendar.getInstance();
		filename = deviceID + Long.toString(timestp.getTimeInMillis()) + "." + SCREEN_SHOT_FILE_TYPE;

		try {
			tripItinerary.clickOperationDays();
			Assert.assertTrue(tripItinerary.popUpWindowIsopen());
		} catch (Exception e) {
			Android.adb.saveScreeenShootOnServer(deviceID, filename, SCREEN_SHOTS_FOLDER);
			MyLogger.logger.error("FAILED STEP: \"I click operation days\" refer to screenshot for more details "
					+ SCREEN_SHOTS_FOLDER + "/" + filename);
			MyLogger.logger.error(e.getMessage());
			e.printStackTrace();
		}

	}

	@Then("^I click back button$")
	public void clickBackButton() throws Throwable {
		tripItinerary.clickBackButton();
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
