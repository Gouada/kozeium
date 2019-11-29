package api.apps.navigator.testSteps;

import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.ADD_TICKET_LINK_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.BAHNCARD_LINK_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.DELAY_NOTIFICATION_LINK_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.DRAWER_MENU_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.FAVORITE_AND_HISTORY_LINK_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.FIND_ORDER_LINK_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.IMPRINT_LINK_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.INFORMATION_AND_BOOKING_LINK_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.MAP_LINK_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.MY_TICKETS_LINK_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.REAL_TIME_INFORMATION_LINK_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.REGIONAL_OFFERS_LINK_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.SAVE_FARES_LINK_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.TIME_TABLE_LINK_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.TRIP_INFORMATION_LINK_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.VERBUND_TICKETS_LINK_IDENTIFICATOR;
import static api.apps.navigator.navigation.NavigationUIelementsIdentificators.IS_MY_TRAIN_ON_TIME_LINK_IDENTIFICATOR;
import static core.Constants.ACCESS_COARSE_LOCATION;
import static core.Constants.ACCESS_FINE_LOCATION;
import static core.Constants.READ_CONTACTS;
import static core.Constants.SCREEN_SHOTS_FOLDER;

import org.junit.Assert;

import api.android.Android;
import api.apps.navigator.navigation.Navigation;
import core.CapabilitiesDevice;
import core.FreeDevicefinder;
import core.MyLogger;
import core.manager.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.AssertionFailedError;
import model.Device;
import runners.TestStarter;

public class NavigationSteps {
	private String deviceID = ""; 

	private Device device;
	private String filename;
	private Navigation navigation;
	private FreeDevicefinder freeDevicefinder;

	public Device getFreeDevice() {
		freeDevicefinder = FreeDevicefinder.getInstance();
		return freeDevicefinder.findReadyDevice();
//		return freeDevicefinder.findFreeDevice();
	}

	public void clickdrawerMenu() {
		try {
			navigation.clickUIObjectFoundByContentDesc(DRAWER_MENU_IDENTIFICATOR);
		} catch (Exception e) {
			filename = Android.adb.setScreenShotFilename("clicking_drawer_menu");
			Android.adb.saveScreeenShootOnServer(deviceID, filename, SCREEN_SHOTS_FOLDER);
			MyLogger.logger
					.error("FAILED STEP: \"...........click drawer menu...........\"refer to screenshot for more details "
							+ SCREEN_SHOTS_FOLDER + "/" + filename + "\n" + e.getMessage());
			MyLogger.logger.error(e.getMessage() + e.getStackTrace().toString());
			throw new AssertionFailedError();
		}

	}

	@Given("^navigator is started for navigation$")
	public void navigator_app_is_started_for_navigation() {
		// device = findFreeDevice();
		device = getFreeDevice();

		if (device != null) {
			try {

				navigation = new Navigation(device.getDeviceID());

				// getting device capabilities
				CapabilitiesDevice capas = TestStarter.getCapas(device, Android.apps.navigator.getPackageID(),
						Android.apps.navigator.getLuncherActivityID());

				deviceID = capas.getDEVICEID();
				DriverManager.createAndroidDriver(capas, device.getPort());

				MyLogger.logger.info("starting test of " + "  " + Android.apps.navigator.getPackageID() + " on "
						+ capas.getDEVICEID() + "  plattform version " + capas.getPLATFORM_VERSION() + " "
						+ Android.apps.navigator.getLuncherActivityID());

				//Android.adb.grantPermission(READ_CONTACTS, Android.apps.navigator.getPackageID());
				
				//Android.adb.grantPermission(ACCESS_FINE_LOCATION, Android.apps.navigator.getPackageID());
				//Android.adb.grantPermission(ACCESS_COARSE_LOCATION, Android.apps.navigator.getPackageID());
				
				Android.apps.navigator.open(Android.adb.getDeviceID());

				MyLogger.logger
						.debug("opening " + Android.apps.navigator.getPackageID() + " on " + Android.adb.getDeviceID());

//				Assert.assertTrue("the app could not be started", Android.adb.getCurrentAppInForeGround(deviceID)
//						.contains(Android.apps.navigator.getPackageID()));
			} catch (Exception e) {
				filename = Android.adb.setScreenShotFilename("starting_navigator");
				MyLogger.logger.error("app: " + Android.apps.navigator.getPackageID() + " could not be started");
				Android.adb.saveScreeenShootOnServer(deviceID, filename, SCREEN_SHOTS_FOLDER);
				e.printStackTrace();
			}
		} else {
			MyLogger.logger.error("no free device found");
		}
	}

	@Then("^I click information and booking$")
	public void clickInfoBooking() {
		try {
			clickdrawerMenu();
			navigation.clickUIObject(INFORMATION_AND_BOOKING_LINK_IDENTIFICATOR);
		} catch (Exception e) {
			filename = Android.adb.setScreenShotFilename("clicking_information_booking");
			Android.adb.saveScreeenShootOnServer(deviceID, filename, SCREEN_SHOTS_FOLDER);
			MyLogger.logger
					.error("FAILED STEP: \"I click information and booking\"refer to screenshot for more details "
							+ SCREEN_SHOTS_FOLDER + "/" + filename + "\n" + e.getMessage());
			MyLogger.logger.error(e.getMessage() + e.getStackTrace().toString());
			throw new AssertionFailedError();
		}
	}

	@Then("^I click favorite and history$")
	public void clickFavoriteHistory() {
		try {
			clickdrawerMenu();
			navigation.clickUIObject(FAVORITE_AND_HISTORY_LINK_IDENTIFICATOR);
		} catch (Exception e) {
			filename = Android.adb.setScreenShotFilename("I_click_favorite_and_history");
			Android.adb.saveScreeenShootOnServer(deviceID, filename, SCREEN_SHOTS_FOLDER);
			MyLogger.logger.error("FAILED STEP: \"I click favorite and history\"refer to screenshot for more details "
					+ SCREEN_SHOTS_FOLDER + "/" + filename + "\n" + e.getMessage());
			MyLogger.logger.error(e.getMessage() + e.getStackTrace().toString());
			throw new AssertionFailedError();
		}
	}

	@Then("^I click trip planer$")
	public void clickTripPlaner() {
		clickdrawerMenu();
		navigation.clickUIObject(TRIP_INFORMATION_LINK_IDENTIFICATOR);
	}

	@Then("^I click real time info$")
	public void clickRealTimeInfo() {
		clickdrawerMenu();
		navigation.clickUIObject(REAL_TIME_INFORMATION_LINK_IDENTIFICATOR);
	}

	@Then("^I click save fares$")
	public void clickSaveFares() {
		clickdrawerMenu();
		navigation.clickUIObject(SAVE_FARES_LINK_IDENTIFICATOR);
	}

	@Then("^I click verbundtickets$")
	public void clickVerbundTickets() {
		clickdrawerMenu();
		navigation.clickUIObject(VERBUND_TICKETS_LINK_IDENTIFICATOR);
	}

	@Then("^I click regional offers$")
	public void clickRegionalOffers() {
		clickdrawerMenu();
		navigation.clickUIObject(REGIONAL_OFFERS_LINK_IDENTIFICATOR);
	}

	@Then("^I click my tickets$")
	public void clickMyTickets() {
		clickdrawerMenu();
		navigation.clickUIObject(MY_TICKETS_LINK_IDENTIFICATOR);
	}

	@Then("^I click add ticket")
	public void clickAddTicket() {
		clickdrawerMenu();
		navigation.clickUIObject(ADD_TICKET_LINK_IDENTIFICATOR);
	}

	@Then("^I click search order$")
	public void clickSearchOrder() {
		clickdrawerMenu();
		navigation.clickUIObject(FIND_ORDER_LINK_IDENTIFICATOR);
	}

	@Then("^I click departure arrival$")
	public void clickdepartureArrival() {
		clickdrawerMenu();
		navigation.clickUIObject(TIME_TABLE_LINK_IDENTIFICATOR);
	}

	@Then("^I scroll to imprint$")
	public void scrollToImprint() {
		clickdrawerMenu();
		navigation.scrollToElement(IMPRINT_LINK_IDENTIFICATOR);
	}

	@Then("^I click bahnCard$")
	public void clickBahnCard() {
		// clickdrawerMenu();
		navigation.clickUIObject(BAHNCARD_LINK_IDENTIFICATOR);
	}

	@Then("^I scroll to regional offers$")
	public void scrollToRegionalOffers() {
		clickdrawerMenu();
		navigation.scrollToElement(REGIONAL_OFFERS_LINK_IDENTIFICATOR);
	}

	@Then("^I click Karte$")
	public void clickKarte() {
		// clickdrawerMenu();
		navigation.clickUIObject(MAP_LINK_IDENTIFICATOR);
	}

	@Then("^I scroll to favorite and history$")
	public void scrollToFavofiteHistory() {
		clickdrawerMenu();
		navigation.scrollToElement(FAVORITE_AND_HISTORY_LINK_IDENTIFICATOR);
	}

	@Then("^I click real time information agin$")
	public void clickRealTimeInfosAgain() throws Throwable{
		navigation.clickUIObject(REAL_TIME_INFORMATION_LINK_IDENTIFICATOR);
	}

	@Then("^I Scroll to delay alarm$")
	public void scrollToDelayAlarm() throws Throwable{
		clickdrawerMenu();
		navigation.scrollToElement(DELAY_NOTIFICATION_LINK_IDENTIFICATOR);
	}

	@Then("^I scroll to is my train on time$")
	public void scrollToIsMyTrainOnTime() throws Throwable{
		//clickdrawerMenu();
		navigation.scrollToElement(IS_MY_TRAIN_ON_TIME_LINK_IDENTIFICATOR);
	}
	
	@After
	public void finishTest() {
		device.setUsed(false);
		device.setStatus(1L);
		freeDevicefinder.updateDeviceInDeviceListFile(device);
		DriverManager.killDriver(deviceID, Android.apps.navigator.getPackageID());
	}
}
