package api.apps.xing.activities;

import api.apps.interfaces.Activity;
import api.apps.xing.login.LoginActivityUIObjects;
import core.MyLogger;
import org.apache.log4j.Level;

public class LoginActivity implements Activity {

    LoginActivityUIObjects loginActivityUIObjects;
    private String deviceID = "";

    public LoginActivity(String deviceID) {
        this.deviceID = deviceID;
        loginActivityUIObjects = new LoginActivityUIObjects(this.deviceID);
        MyLogger.logger.setLevel(Level.DEBUG);
    }

    public LoginActivity() {
        MyLogger.logger.setLevel(Level.DEBUG);
    }

    @Override
    public void waitToLoad() {
        waitForActivitUIElementstoAppaer();
    }

    private void waitForActivitUIElementstoAppaer() {
        loginActivityUIObjects.getTxtV_go_to_login().waitElementToappaer(3);
    }

    public void clickGoToLoginButton() {
        loginActivityUIObjects.getTxtV_go_to_login().tap();
    }

    public void loginWithCredentials(String username, String password) {
        loginActivityUIObjects.getEditTxtUsername().typeText(username);
        loginActivityUIObjects.getEditTxtUserPwd().typeText(password);
        loginActivityUIObjects.getBtnLoginButton().tap();
    }

    public void typeUsername(String username) {
        loginActivityUIObjects.getEditTxtUsername().typeText(username);
    }

    public void typePassword(String password) {
        loginActivityUIObjects.getEditTxtUserPwd().typeText(password);
    }
}
