package api.apps.xing.activities;

import api.apps.interfaces.Activity;
import api.apps.xing.registerNewUser.XingRegistrationActivityUIObjects;

public class XingUserRegistrationActivity implements Activity {

    private XingRegistrationActivityUIObjects xingRegistrationActivityUIObjects;
    private String device_ID;

    public XingUserRegistrationActivity(String device_ID) {
        this.device_ID = device_ID;
        xingRegistrationActivityUIObjects = new XingRegistrationActivityUIObjects(device_ID);
    }

    @Override
    public void waitToLoad() {
        // TODO Auto-generated method stub

    }

    public void typeInEmailAdress(String emailAdress) {
        xingRegistrationActivityUIObjects.getEmailField().typeText(emailAdress);
    }

    public void tapSignUPBtn() {
        xingRegistrationActivityUIObjects.getSignupButton().tap();
    }

    public void tapeNextBtn() {
        xingRegistrationActivityUIObjects.getNextBtn().tap();
    }
}
