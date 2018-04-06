package api.apps.navigator.tripPlaner;

import static api.apps.navigator.tripPlaner.TriplannerIdentificators.button_mfe_secondary_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.day_of_operation_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.pop_up_back_button_identificator;

import org.apache.log4j.Level;

import core.MyLogger;
import core.UIObjectWrapper;
import core.UISelectorWrapper;

public class TripItineraryUIObjects extends TripPlanerUIObject {

	private final String drawer_identificator = "...";

	// deviceId is required for parallel testting
	public String deviceId;

	public TripItineraryUIObjects() {
	}

	public TripItineraryUIObjects(String deviceId) {
		this.deviceId = deviceId;
		MyLogger.logger.setLevel(Level.DEBUG);
	}

	UISelectorWrapper uiSelector = new UISelectorWrapper(this.deviceId);

	private static UIObjectWrapper uiobject, button_mfe_secondary, day_of_operations;

	public UIObjectWrapper getMfeSecondary() {
		return button_mfe_secondary = new UISelectorWrapper(this.deviceId)
				.resourceId(button_mfe_secondary_identificator).makeIUObject();
	}

	public UIObjectWrapper getDaysOfOperation() {
		return new UISelectorWrapper(this.deviceId).xPath(day_of_operation_identificator).makeIUObject();
	}

	public UIObjectWrapper getPopUpBackButton() {
		return new UISelectorWrapper(this.deviceId).xPath(pop_up_back_button_identificator).makeIUObject();
	}
}
