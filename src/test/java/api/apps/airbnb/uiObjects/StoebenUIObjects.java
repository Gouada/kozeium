package api.apps.airbnb.uiObjects;

import api.apps.airbnb.uiObjects.identificators.StoebenUIobjetcsIdentificators;
import core.UIObjectWrapper;
import core.UISelectorWrapper;

import static api.apps.airbnb.uiObjects.identificators.StoebenUIobjetcsIdentificators.*;

public class StoebenUIObjects {

    private String device_ID;

    public StoebenUIObjects(String device_ID) {
        this.device_ID = device_ID;
    }

    public UIObjectWrapper getReisedatenButton() {
        return new UISelectorWrapper(this.device_ID).xPath(REISEDATEN_BTN_IDENTIFICATOR).makeIUObject();
    }

    public UIObjectWrapper getGaesteButton() {
        return new UISelectorWrapper(this.device_ID).xPath(GAESTE_BTN_IDENTIFICATOR).makeIUObject();
    }

    public UIObjectWrapper getFilterButton() {
        return new UISelectorWrapper(this.device_ID).xPath(FILTER_BTN_IDENTIFICATOR).makeIUObject();
    }

    public UIObjectWrapper getSearchField() {
        return new UISelectorWrapper(this.device_ID).resourceId(StoebenUIobjetcsIdentificators.FILTER_BTN_IDENTIFICATOR).makeIUObject();
    }

    public UIObjectWrapper getAdultCountField() {
        return new UISelectorWrapper(this.device_ID).index(3).makeIUObject();
    }

    public UIObjectWrapper getchildrenCountField() {
        return new UISelectorWrapper(this.device_ID).index(3).makeIUObject();
    }
}
