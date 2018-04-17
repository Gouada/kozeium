package api.apps.navigator.tripPlaner;

import static api.apps.navigator.tripPlaner.TriplannerIdentificators.START_STATION_IDENTIFICATOR;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.date_seletion_done_button_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.input_location_name_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.search_button_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.start_date_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.start_date_selector_L_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.start_date_selector_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.start_time_selector_L_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.start_time_selector_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.target_station_identificator;

import org.apache.log4j.Level;

import core.MyLogger;
import core.UIObjectWrapper;
import core.UISelectorWrapper;

public class TripInformationUIObjects {

	private final String drawer_identificator = "...";
	private TriplannerIdentificators triplannerIdentificators;

	// deviceId is required for parallel testting
	public String device_ID;

	public TripInformationUIObjects() {
	}

	public TripInformationUIObjects(String deviceId) {
		this.device_ID = deviceId;
		triplannerIdentificators = new TriplannerIdentificators(device_ID);
		// TriplannerIdentificators triplannerIdentificators = new
		// TriplannerIdentificators(device_ID);
		MyLogger.logger.setLevel(Level.DEBUG);
	}

	UISelectorWrapper uiSelector = new UISelectorWrapper(this.device_ID);

	private static UIObjectWrapper uiobject, drawer_menu, start_station, target_station, search_button,
			start_time_selector_L, start_date_selector_L, input_location_name, station_name_in_linear_layout_list,
			button_later, start_date_selector, start_date, start_time, start_time_selector, date_seletion_done_button,
			activity_title; // TO DO THIS SCHOULD BE DEFINED IN PARENT CLASS
							// TRIPLANERUIOBJECT activity_title, draw_menu

	public UIObjectWrapper getActivityTitle() {
		String activity_title_identificator = triplannerIdentificators.getTripInformationActivityTitleIdentificator();
		return new UISelectorWrapper(this.device_ID).xPath(activity_title_identificator).makeIUObject();
	}

	public UIObjectWrapper getdrawerMenu() {
		drawer_menu = new UISelectorWrapper(this.device_ID).resourceId(drawer_identificator).makeIUObject();
		return drawer_menu;
	}

	public UIObjectWrapper getStartStation() {
		start_station = new UISelectorWrapper(this.device_ID).resourceId(START_STATION_IDENTIFICATOR).makeIUObject();
		return start_station;
	}

	public UIObjectWrapper getTragetStation() {
		target_station = new UISelectorWrapper(this.device_ID).resourceId(target_station_identificator).makeIUObject();
		return target_station;
	}

	public UIObjectWrapper getStartDate() {
		start_date = new UISelectorWrapper(this.device_ID).text(start_date_identificator).makeIUObject();
		return start_date;
	}

	public UIObjectWrapper getStartTime() {
		start_time = new UISelectorWrapper(this.device_ID).resourceId(start_date_identificator).makeIUObject();
		return start_time;
	}

	public UIObjectWrapper getStartDateSelector() {
		start_date_selector = new UISelectorWrapper(this.device_ID).resourceId(start_date_selector_identificator)
				.makeIUObject();
		return start_date_selector;
	}

	public UIObjectWrapper getStartTimeSelector() {
		start_time_selector = new UISelectorWrapper(this.device_ID).resourceId(start_time_selector_identificator)
				.makeIUObject();
		return start_time_selector;
	}

	public UIObjectWrapper getSearchButton() {
		search_button = new UISelectorWrapper(this.device_ID).resourceId(search_button_identificator).makeIUObject();
		return search_button;
	}

	public UIObjectWrapper getLargeStartTimeSelector() {
		start_time_selector_L = new UISelectorWrapper(this.device_ID).resourceId(start_time_selector_L_identificator)
				.makeIUObject();
		return start_time_selector_L;
	}

	public UIObjectWrapper getLargeStartDateSelector() {
		start_date_selector_L = new UISelectorWrapper(this.device_ID).resourceId(start_date_selector_L_identificator)
				.makeIUObject();
		return start_date_selector_L;
	}

	public UIObjectWrapper getInputLocationName() {
		input_location_name = new UISelectorWrapper(this.device_ID).resourceId(input_location_name_identificator)
				.makeIUObject();
		return input_location_name;
	}

	// get a specipic station from a dynamically displayed javascript
	// stationList
	public UIObjectWrapper getStattionFromList(String station_Name) {
		station_name_in_linear_layout_list = new UISelectorWrapper(this.device_ID)
				.xPath("//android.widget.LinearLayout[@content-desc='" + station_Name + "']").makeIUObject();
		return station_name_in_linear_layout_list;
	}

	public UIObjectWrapper getDateSeletionDoneButton() {
		date_seletion_done_button = new UISelectorWrapper(this.device_ID)
				.resourceId(date_seletion_done_button_identificator).makeIUObject();
		return date_seletion_done_button;
	}

}
