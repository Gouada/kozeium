package api.apps.xing.testSteps;

import api.android.Android;
import api.apps.xing.activities.LoginActivity;
import core.CapabilitiesDevice;
import core.FreeDevicefinder;
import core.MyLogger;
import core.manager.DriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import model.Device;
import runners.TestStarter;

import java.util.Calendar;

import static core.Constants.SCREEN_SHOTS_FOLDER;

public class LoginSteps {
    private String deviceID = "";// "emulator-5554";
    // private TripPlaner tripPlaner; // = new TripPlaner();

    private Device device;
    private Calendar timestp;
    private String filename;
    private FreeDevicefinder freeDevicefinder;
    private LoginActivity loginActivity;

    public Device getReadyDevice() {
        freeDevicefinder = FreeDevicefinder.getInstance();
        return freeDevicefinder.findReadyDevice();
        //return freeDevicefinder.findFreeDevice();
    }

    @Given("^xing is started$")
    public void startXingApp() {
        device = getReadyDevice();
        MyLogger.logger.info("getting devie for test" + device.getDeviceID());
        if (device != null) {
            try {
                loginActivity = new LoginActivity(device.getDeviceID());

                // getting device capabilities
                CapabilitiesDevice capas = TestStarter.getCapas(device, Android.apps.xing.getPackageID(),
                        Android.apps.xing.getLuncherActivityID());

                deviceID = capas.getDEVICEID();
                DriverManager.createAndroidDriver(capas, device.getPort());

                MyLogger.logger.info("starting test of " + "  " + Android.apps.xing.getPackageID() + " on "
                        + capas.getDEVICEID() + "  plattform version " + capas.getPLATFORM_VERSION() + " "
                        + Android.apps.xing.getLuncherActivityID());

                Android.apps.xing.open(Android.adb.getDeviceID());

                MyLogger.logger
                        .debug("opening " + Android.apps.xing.getPackageID() + " on " + Android.adb.getDeviceID());
//
//				Assert.assertTrue("the app could not be started", Android.adb.getCurrentAppInForeGround(deviceID)
//						.contains(Android.apps.xing.getPackageID()));
            } catch (Exception e) {
                filename = Android.adb.setScreenShotFilename("starting_xing");
                MyLogger.logger.error("app: " + Android.apps.xing.getPackageID() + " could not be started");
                Android.adb.saveScreeenShootOnServer(deviceID, filename, SCREEN_SHOTS_FOLDER);
                e.printStackTrace();
            }
        } else {
            MyLogger.logger.error("no free device found");
        }
    }

    @Then("^I click go to login$")
    public void go_to_login_activity() throws Throwable {
        loginActivity.clickGoToLoginButton();
    }

    @Then("^I enter username(.*)$")
    public void type_username(String username) throws Throwable {
        loginActivity.typeUsername(username);
    }

    @Then("^I enter password(.*)$")
    public void type_password(String password) throws Throwable {
        loginActivity.typePassword(password);
    }
}
