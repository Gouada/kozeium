package api.apps.navigator.tripPlaner;

import static api.apps.navigator.tripPlaner.TriplannerIdentificators.button_mfe_secondary_identificator;

import org.apache.log4j.Level;

import core.MyLogger;
import core.UIObjectWrapper;
import core.UISelectorWrapper;

public class TripItineraryUIObjects extends TripPlanerUIObject {

	private final String drawer_identificator = "...";
	private TriplannerIdentificators triplannerIdentificators;

	// deviceId is required for parallel testting
	public String device_ID;

	public TripItineraryUIObjects() {
	}

	public TripItineraryUIObjects(String device_ID) {
		this.device_ID = deviceId;
		triplannerIdentificators = new TriplannerIdentificators(device_ID);
		MyLogger.logger.setLevel(Level.DEBUG);
	}

	UISelectorWrapper uiSelector = new UISelectorWrapper(this.device_ID);

	public UIObjectWrapper getMfeSecondary() {
		return new UISelectorWrapper(this.device_ID).resourceId(button_mfe_secondary_identificator).makeIUObject();
	}

	public UIObjectWrapper getDaysOfOperation() {
		String day_of_operation_identificator = triplannerIdentificators.getDayOfOperationsIdentificator();
		return new UISelectorWrapper(this.device_ID).xPath(day_of_operation_identificator).makeIUObject();
	}

	public UIObjectWrapper getPopUpBackButton() {
		String pop_up_back_button_identificator = triplannerIdentificators.getPopUpBackButtonIdentificator();
		return new UISelectorWrapper(this.device_ID).xPath(pop_up_back_button_identificator).makeIUObject();
	}

	public UIObjectWrapper getActivityTitle() {
		String activity_title_identificator = triplannerIdentificators.getTripplanActivityTitleIdentificator();
		return new UISelectorWrapper(this.device_ID).xPath(activity_title_identificator).makeIUObject();
	}

}
