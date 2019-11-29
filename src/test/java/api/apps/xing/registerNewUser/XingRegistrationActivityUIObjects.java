package api.apps.xing.registerNewUser;

import core.UIObjectWrapper;
import core.UISelectorWrapper;

import static api.apps.xing.registerNewUser.NewUserActivityUIObjectsIdentificators.*;

public class XingRegistrationActivityUIObjects {

    UIObjectWrapper signup_btn, email_field, next_btn;
    private String device_ID;
    private NewUserActivityUIObjectsIdentificators newUserActivityUIObjectsIdentificators;

    public XingRegistrationActivityUIObjects(String device_ID) {
        newUserActivityUIObjectsIdentificators = new NewUserActivityUIObjectsIdentificators(device_ID);
    }

    public UIObjectWrapper getSignupButton() {
        signup_btn = new UISelectorWrapper(this.device_ID).resourceId(SIGN_UP_BUTTON_RESOURCE_ID).makeIUObject();
        return signup_btn;
    }

    public UIObjectWrapper getEmailField() {
        email_field = new UISelectorWrapper(this.device_ID).resourceId(EMAIL_RESOURCE_ID).makeIUObject();
        return email_field;
    }

    public UIObjectWrapper getNextBtn() {
        next_btn = new UISelectorWrapper(this.device_ID).resourceId(NEXT_EMAIL_RESOURCE_ID).makeIUObject();
        return next_btn;
    }

    public UIObjectWrapper getBtnNextUserName() {
        signup_btn = new UISelectorWrapper(this.device_ID).resourceId(NEXT_BTN_NAME_RESOURCE_ID).makeIUObject();
        return signup_btn;
    }

    public UIObjectWrapper getUsernameField() {
        return new UISelectorWrapper(this.device_ID).resourceId(USERNAME_RESOURCE_ID).makeIUObject();
        //return email_field;
    }

    public UIObjectWrapper getUserSurnameField() {
        return new UISelectorWrapper(this.device_ID).resourceId(USERSURNAME_RESOURCE_ID).makeIUObject();
        //return next_btn;
    }

}
