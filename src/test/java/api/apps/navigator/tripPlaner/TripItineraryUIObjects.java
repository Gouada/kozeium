package api.apps.navigator.tripPlaner;

import static api.apps.navigator.tripPlaner.TriplannerIdentificators.button_mfe_secondary_identificator;

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

	public UIObjectWrapper getMfeSecondary() {
		return new UISelectorWrapper(this.deviceId).resourceId(button_mfe_secondary_identificator).makeIUObject();
	}

	public UIObjectWrapper getDaysOfOperation() {
		String day_of_operation_identificator = TriplannerIdentificators.getDayOfOperationsIdentificator(this.deviceId);
		return new UISelectorWrapper(this.deviceId).xPath(day_of_operation_identificator).makeIUObject();
	}

	public UIObjectWrapper getPopUpBackButton() {
		String pop_up_back_button_identificator = TriplannerIdentificators
				.getPopUpBackButtonIdentificator(this.deviceId);
		return new UISelectorWrapper(this.deviceId).xPath(pop_up_back_button_identificator).makeIUObject();
	}

	public UIObjectWrapper getActivityTitle() {
		String activity_title_identificator = TriplannerIdentificators
				.getTripplanActivityTitleIdentificator(this.deviceId);
		return new UISelectorWrapper(this.deviceId).xPath(activity_title_identificator).makeIUObject();
	}

}
