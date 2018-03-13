package api.apps.navigator.tripPlaner;

import java.util.Calendar;

public class TriplannerIdentificators {

	static Calendar calendar = Calendar.getInstance();
	static int today = calendar.get(Calendar.DAY_OF_MONTH);

	public static final String drawer_identificator = "...";
	public static final String start_station_identificator = "de.hafas.android.db:id/input_start";
	public static final String target_station_identificator = "de.hafas.android.db:id/input_target";
	public static final String start_date_identificator = Integer.toString(today);
	public static final String start_time_identificator = "de.hafas.android.db:id/datetime_picker_container";
	public static final String start_date_selector_identificator = "de.hafas.android.db:id/datetime_small_left_panel";
	public static final String start_time_selector_identificator = "de.hafas.android.db:id/datetime_small_right_panel";
	public static final String start_time_selector_L_identificator = "de.hafas.android.db:id/datetime_large_right_panel";
	public static final String start_date_selector_L_identificator = "de.hafas.android.db:id/datetime_large_left_panel";
	public static final String search_button_identificator = "de.hafas.android.db:id/button_search";
	public static final String date_seletion_done_button_identificator = "de.hafas.android.db:id/actionbar_button_done";
	public static final String input_location_name_identificator = "de.hafas.android.db:id/input_location_name";
}
