package api.apps.xing.login;

import core.MyLogger;
import core.UIObjectWrapper;
import core.UISelectorWrapper;
import org.apache.log4j.Level;

import static api.apps.xing.login.LoginActitivityIdentificators.*;

public class LoginActivityUIObjects {

    private static UIObjectWrapper uiobject, txtV_go_to_login, editTxtUsername, btnLoginButton, editTxtUserPwd;
    // deviceId is required for parallel testting
    public String device_ID;
    UISelectorWrapper uiSelector = new UISelectorWrapper(this.device_ID);
    private LoginActitivityIdentificators loginActitivityIdentificators;

    public LoginActivityUIObjects() {
    }

    public LoginActivityUIObjects(String device_ID) {
        this.device_ID = device_ID;
        loginActitivityIdentificators = new LoginActitivityIdentificators(device_ID);
        MyLogger.logger.setLevel(Level.DEBUG);
    }

    public UIObjectWrapper getTxtV_go_to_login() {
        txtV_go_to_login = new UISelectorWrapper(this.device_ID).resourceId(txtV_go_to_login_identificator).makeIUObject();
        return txtV_go_to_login;
    }

    public UIObjectWrapper getEditTxtUsername() {
        editTxtUsername = new UISelectorWrapper(this.device_ID).resourceId(editTxtUsernameIdentificator).makeIUObject();
        return editTxtUsername;
    }

    public UIObjectWrapper getBtnLoginButton() {
        btnLoginButton = new UISelectorWrapper(this.device_ID).resourceId(btnLoginButtonIdentificator).makeIUObject();
        return btnLoginButton;
    }

    public UIObjectWrapper getEditTxtUserPwd() {
        editTxtUserPwd = new UISelectorWrapper(this.device_ID).resourceId(editTxtUserPwdIdentificator).makeIUObject();
        return editTxtUserPwd;
    }

}
