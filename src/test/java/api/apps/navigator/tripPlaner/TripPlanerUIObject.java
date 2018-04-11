package api.apps.navigator.tripPlaner;

import org.apache.log4j.Level;

import core.MyLogger;
import core.UIObjectWrapper;
import core.UISelectorWrapper;

public class TripPlanerUIObject {

	private final String drawer_identificator = "...";

	// deviceId is required for parallel testting
	public String deviceId;

	public TripPlanerUIObject() {
	}

	public TripPlanerUIObject(String deviceId) {
		this.deviceId = deviceId;
		MyLogger.logger.setLevel(Level.DEBUG);
	}

	UISelectorWrapper uiSelector = new UISelectorWrapper(this.deviceId);

	private static UIObjectWrapper activity_title;
	// uiobject, drawer_menu, start_station, target_station, start_date,
	// start_time,
	// start_date_selector, start_time_selector, search_button,
	// date_seletion_done_button, start_time_selector_L,
	// start_date_selector_L, input_location_name,
	// station_name_in_linear_layout_list, button_later,
	// button_earlier, button_now, button_favorite;

	/*
	 * public UIObjectWrapper getdrawerMenu() { drawer_menu = new
	 * UISelectorWrapper(this.deviceId).resourceId(drawer_identificator).
	 * makeIUObject(); return drawer_menu; }
	 *
	 * public UIObjectWrapper getStartStation() { start_station = new
	 * UISelectorWrapper(this.deviceId).resourceId(start_station_identificator).
	 * makeIUObject(); return start_station; }
	 *
	 * public UIObjectWrapper getTragetStation() { target_station = new
	 * UISelectorWrapper(this.deviceId).resourceId(target_station_identificator)
	 * .makeIUObject(); return target_station; }
	 *
	 * public UIObjectWrapper getStartDate() { start_date = new
	 * UISelectorWrapper(this.deviceId).text(start_date_identificator).
	 * makeIUObject(); return start_date; }
	 *
	 * public UIObjectWrapper getStartTime() { start_time = new
	 * UISelectorWrapper(this.deviceId).resourceId(start_date_identificator).
	 * makeIUObject(); return start_time; }
	 *
	 * public UIObjectWrapper getStartDateSelector() { start_date_selector = new
	 * UISelectorWrapper(this.deviceId).resourceId(
	 * start_date_selector_identificator) .makeIUObject(); return
	 * start_date_selector; }
	 *
	 * public UIObjectWrapper getStartTimeSelector() { start_time_selector = new
	 * UISelectorWrapper(this.deviceId).resourceId(
	 * start_time_selector_identificator) .makeIUObject(); return
	 * start_time_selector; }
	 *
	 * public UIObjectWrapper getSearchButton() { search_button = new
	 * UISelectorWrapper(this.deviceId).resourceId(search_button_identificator).
	 * makeIUObject(); return search_button; }
	 *
	 * public UIObjectWrapper getDateSeletionDoneButton() {
	 * date_seletion_done_button = new UISelectorWrapper(this.deviceId)
	 * .resourceId(date_seletion_done_button_identificator).makeIUObject();
	 * return date_seletion_done_button; }
	 *
	 * public UIObjectWrapper getLargeStartTimeSelector() {
	 * start_time_selector_L = new UISelectorWrapper(this.deviceId).resourceId(
	 * start_time_selector_L_identificator) .makeIUObject(); return
	 * start_time_selector_L; }
	 *
	 * public UIObjectWrapper getLargeStartDateSelector() {
	 * start_date_selector_L = new UISelectorWrapper(this.deviceId).resourceId(
	 * start_date_selector_L_identificator) .makeIUObject(); return
	 * start_date_selector_L; }
	 *
	 * public UIObjectWrapper getInputLocationName() { input_location_name = new
	 * UISelectorWrapper(this.deviceId).resourceId(
	 * input_location_name_identificator) .makeIUObject(); return
	 * input_location_name; }
	 *
	 * // get a specipic station from a dynamically displayed javascript //
	 * stationList public UIObjectWrapper getStattionFromList(String
	 * station_Name) { station_name_in_linear_layout_list = new
	 * UISelectorWrapper(this.deviceId)
	 * .xPath("//android.widget.LinearLayout[@content-desc='" + station_Name +
	 * "']").makeIUObject(); return station_name_in_linear_layout_list; }
	 *
	 * public UIObjectWrapper getButtonLater() { button_later = new
	 * UISelectorWrapper(this.deviceId).resourceId(button_later_identificator).
	 * makeIUObject(); return button_later; }
	 *
	 * public UIObjectWrapper getButton_earlier() { button_earlier = new
	 * UISelectorWrapper(this.deviceId).resourceId(button_earlier_identificator)
	 * .makeIUObject(); return button_earlier; }
	 *
	 * public UIObjectWrapper getButton_now() { button_now = new
	 * UISelectorWrapper(this.deviceId).resourceId(button_now_identificator).
	 * makeIUObject(); return button_now; }
	 *
	 * public UIObjectWrapper getButtonFavorite() { button_favorite = new
	 * UISelectorWrapper(this.deviceId).resourceId(button_favorite_identificator
	 * ).makeIUObject(); return button_favorite; }
	 */
	// this method should be implemented only here and not in sub-classes
	public void getActivityTitlehhh() {
		// activity_title = new
		// UISelectorWrapper(this.deviceId).xPath(activity_title_identificator).makeIUObject();
	}

}
