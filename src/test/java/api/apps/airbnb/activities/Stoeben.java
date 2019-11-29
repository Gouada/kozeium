package api.apps.airbnb.activities;

import api.apps.airbnb.uiObjects.StoebenUIObjects;
import api.apps.interfaces.Activity;
import core.ADB;

public class Stoeben implements Activity {

    private String device_ID;
    private StoebenUIObjects stoebenUIObjects;

    public Stoeben(String device_ID) {
        // TODO Auto-generated constructor stub
        stoebenUIObjects = new StoebenUIObjects(device_ID);
    }

    @Override
    public void waitToLoad() {
        stoebenUIObjects.getGaesteButton().waitElementToappaer(5);
        stoebenUIObjects.getFilterButton().waitElementToappaer(5);
        stoebenUIObjects.getReisedatenButton().waitElementToappaer(5);

    }

    public void clickReiseDatenButton() {
        stoebenUIObjects.getReisedatenButton().tap();
    }

    public void clickFilterButton() {
        stoebenUIObjects.getFilterButton().tap();
    }

    public void clickGaesteButton() {
        stoebenUIObjects.getGaesteButton().tap();
    }

    public void selectTripDates() {
        selectTripStartDate();
        selectTripEndDate();
        clickSaveButton();
    }

    private void clickSaveButton() {
        // TODO Auto-generated method stub

    }

    public void search(String cityName) {
        ADB adb = new ADB();
        stoebenUIObjects.getSearchField().typeText(cityName);
        adb.PressEnter(this.device_ID);
    }

    public void selectTripStartDate() {
        // select date randomly
    }


    public void selectTripEndDate() {
        // select date randomly
    }

    public void enterGaesteInfos() {

    }
}
