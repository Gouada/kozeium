package api.apps.navigator.tripPlaner;

import static api.apps.navigator.tripPlaner.TriplannerIdentificators.activity_title_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.date_seletion_done_button_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.input_location_name_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.search_button_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.start_date_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.start_date_selector_L_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.start_date_selector_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.start_station_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.start_time_selector_L_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.start_time_selector_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.target_station_identificator;

import org.apache.log4j.Level;

import core.MyLogger;
import core.UIObjectWrapper;
import core.UISelectorWrapper;

public class TripInformationUIObjects {

	private final String drawer_identificator = "...";

	// deviceId is required for parallel testting
	public String deviceId;

	public TripInformationUIObjects() {
	}

	public TripInformationUIObjects(String deviceId) {
		this.deviceId = deviceId;
		MyLogger.logger.setLevel(Level.DEBUG);
	}

	UISelectorWrapper uiSelector = new UISelectorWrapper(this.deviceId);

	private static UIObjectWrapper uiobject, drawer_menu, start_station, target_station, search_button,
			start_time_selector_L, start_date_selector_L, input_location_name, station_name_in_linear_layout_list,
			button_later, start_date_selector, start_date, start_time, start_time_selector, date_seletion_done_button,
			activity_title; // TO DO THIS SCHOULD BE DEFINED IN PARENT CLASS
							// TRIPLANERUIOBJECT activity_title, draw_menu

	// TO DO TRANSFER THIS IN PARENT CLASS
	public UIObjectWrapper getActivityTitle() {
		activity_title = new UISelectorWrapper(this.deviceId).resourceId(activity_title_identificator).makeIUObject();
		return activity_title;
	}

	public UIObjectWrapper getdrawerMenu() {
		drawer_menu = new UISelectorWrapper(this.deviceId).resourceId(drawer_identificator).makeIUObject();
		return drawer_menu;
	}

	public UIObjectWrapper getStartStation() {
		start_station = new UISelectorWrapper(this.deviceId).resourceId(start_station_identificator).makeIUObject();
		return start_station;
	}

	public UIObjectWrapper getTragetStation() {
		target_station = new UISelectorWrapper(this.deviceId).resourceId(target_station_identificator).makeIUObject();
		return target_station;
	}

	public UIObjectWrapper getStartDate() {
		start_date = new UISelectorWrapper(this.deviceId).text(start_date_identificator).makeIUObject();
		return start_date;
	}

	public UIObjectWrapper getStartTime() {
		start_time = new UISelectorWrapper(this.deviceId).resourceId(start_date_identificator).makeIUObject();
		return start_time;
	}

	public UIObjectWrapper getStartDateSelector() {
		start_date_selector = new UISelectorWrapper(this.deviceId).resourceId(start_date_selector_identificator)
				.makeIUObject();
		return start_date_selector;
	}

	public UIObjectWrapper getStartTimeSelector() {
		start_time_selector = new UISelectorWrapper(this.deviceId).resourceId(start_time_selector_identificator)
				.makeIUObject();
		return start_time_selector;
	}

	public UIObjectWrapper getSearchButton() {
		search_button = new UISelectorWrapper(this.deviceId).resourceId(search_button_identificator).makeIUObject();
		return search_button;
	}

	public UIObjectWrapper getLargeStartTimeSelector() {
		start_time_selector_L = new UISelectorWrapper(this.deviceId).resourceId(start_time_selector_L_identificator)
				.makeIUObject();
		return start_time_selector_L;
	}

	public UIObjectWrapper getLargeStartDateSelector() {
		start_date_selector_L = new UISelectorWrapper(this.deviceId).resourceId(start_date_selector_L_identificator)
				.makeIUObject();
		return start_date_selector_L;
	}

	public UIObjectWrapper getInputLocationName() {
		input_location_name = new UISelectorWrapper(this.deviceId).resourceId(input_location_name_identificator)
				.makeIUObject();
		return input_location_name;
	}

	// get a specipic station from a dynamically displayed javascript
	// stationList
	public UIObjectWrapper getStattionFromList(String station_Name) {
		station_name_in_linear_layout_list = new UISelectorWrapper(this.deviceId)
				.xPath("//android.widget.LinearLayout[@content-desc='" + station_Name + "']").makeIUObject();
		return station_name_in_linear_layout_list;
	}

	public UIObjectWrapper getDateSeletionDoneButton() {
		date_seletion_done_button = new UISelectorWrapper(this.deviceId)
				.resourceId(date_seletion_done_button_identificator).makeIUObject();
		return date_seletion_done_button;
	}

}
