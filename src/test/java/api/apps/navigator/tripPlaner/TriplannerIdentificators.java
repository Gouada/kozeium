package api.apps.navigator.tripPlaner;

import java.util.Calendar;
import java.util.Properties;

import core.ADB;
import core.MyLogger;
import core.PropertiesFilesLoader;
import model.Device;

public class TriplannerIdentificators {

	private PropertiesFilesLoader propertiesFilesLoader;
	private Device device = null;
	private static String tripplan_activity_title_identificator;
	private static String connetion_activity_title_identificator;
	private static Properties properties;
	private static String single_connection_identificator_key;
	private static String drawer_menu_identificator_key;

	static Calendar calendar = Calendar.getInstance();
	static int today = calendar.get(Calendar.DAY_OF_MONTH);

	public static String drawer_menu_identificator = "";

	public static final String start_station_identificator = "de.hafas.android.db:id/input_start";

	public static final String start_date_identificator = Integer.toString(today);

	public static final String start_time_identificator = "de.hafas.android.db:id/datetime_picker_container";

	public static final String start_date_selector_identificator = "de.hafas.android.db:id/datetime_small_left_panel";

	public static final String start_time_selector_identificator = "de.hafas.android.db:id/datetime_small_right_panel";

	public static final String start_time_selector_L_identificator = "de.hafas.android.db:id/datetime_large_right_panel";

	public static final String start_date_selector_L_identificator = "de.hafas.android.db:id/datetime_large_left_panel";

	public static final String target_station_identificator = "de.hafas.android.db:id/input_target";

	public static final String search_button_identificator = "de.hafas.android.db:id/button_search";

	public static final String date_seletion_done_button_identificator = "de.hafas.android.db:id/actionbar_button_done";

	public static final String input_location_name_identificator = "de.hafas.android.db:id/input_location_name";

	public static final String button_later_identificator = "de.hafas.android.db:id/button_later";

	public static final String button_mfe_secondary_identificator = "de.hafas.android.db:id/button_mfe_secondary";

	public static String day_of_operation_identificator = "";

	public static String pop_up_back_button_identificator = "";

	public static final String button_earlier_identificator = "de.hafas.android.db:id/button_earlier";

	public static final String button_now_identificator = "de.hafas.android.db:id/button_now";

	public static final String button_favorite_identificator = "de.hafas.android.db:id/button_favorite";

	// public static final String activity_title_identificator =
	// "//android.widget.TextView[contains(@text,' Reise')]";

	public static final String connection_list_identificator = "de.hafas.android.db:id/list_connection";

	public static String single_connection_identificator;
	private static String day_of_operation_identificator_key;
	private static String pop_up_back_button_identificator_key;
	private static String tripplan_activity_title_identificator_key;
	private static String connetion_activity_title_identificator_key;
	private static String tripInformation_activity_title_identificator;
	private static String tripInformation_activity_title_identificator_key;

	public TriplannerIdentificators(Device device) {
		this.device = device;
	}

	public TriplannerIdentificators() {
	}

	public static void loadPropertiesFile(String deviceLang) {
		String file_name = "";
		MyLogger.logger.info("Loading " + deviceLang + " properties file ...");

		// in this case adb ... persist.sys.locale is i.e.: de-DE. For emulator
		// the return vavule is i.e.: just de
		if (deviceLang.contains("-")) {
			file_name = deviceLang + ".properties";
		} else // if (deviceLang.length() >= 2 && deviceLang.length() < 5)
		{
			file_name = deviceLang + "-" + deviceLang.toUpperCase() + ".properties";
		}
		PropertiesFilesLoader propertiesFilesLoader = PropertiesFilesLoader.getInstance(file_name);

		TriplannerIdentificators.single_connection_identificator_key = propertiesFilesLoader
				.getPropertyByKey("single_connection_identificator_key");

		TriplannerIdentificators.drawer_menu_identificator_key = propertiesFilesLoader
				.getPropertyByKey("drawer_menu_identificator_key");

		TriplannerIdentificators.day_of_operation_identificator_key = propertiesFilesLoader
				.getPropertyByKey("day_of_operation_identificator_key");

		TriplannerIdentificators.pop_up_back_button_identificator_key = propertiesFilesLoader
				.getPropertyByKey("pop_up_back_button_identificator_key");

		TriplannerIdentificators.tripplan_activity_title_identificator_key = propertiesFilesLoader
				.getPropertyByKey("tripplan_activity_title_identificator_key");

		TriplannerIdentificators.connetion_activity_title_identificator_key = propertiesFilesLoader
				.getPropertyByKey("connetion_activity_title_identificator_key");

		TriplannerIdentificators.tripInformation_activity_title_identificator_key = propertiesFilesLoader
				.getPropertyByKey("tripInformation_activity_title_identificator_key");
	}

	public static String getSingleConnectionIdentificator(String deviceID) {
		ADB adb = new ADB();
		String deviceLang = adb.getDeviceLang(deviceID);
		loadPropertiesFile(deviceLang);
		single_connection_identificator = "//android.widget.LinearLayout[contains(@content-desc, '"
				+ TriplannerIdentificators.single_connection_identificator_key + "')]";
		return single_connection_identificator;
	}

	public static String getDrawerMenuIdentificator(String deviceID) {
		ADB adb = new ADB();
		String deviceLang = adb.getDeviceLang(deviceID);
		loadPropertiesFile(deviceLang);
		drawer_menu_identificator = "//android.widget.ImageButton[contains(@content-desc, '"
				+ TriplannerIdentificators.drawer_menu_identificator_key + "')]";
		return drawer_menu_identificator;
	}

	public static String getDayOfOperationsIdentificator(String deviceID) {
		ADB adb = new ADB();
		String deviceLang = adb.getDeviceLang(deviceID);
		loadPropertiesFile(deviceLang); // android.widget.TextView[contains(@resource-id,
										// 'android:id/text1')]";
		day_of_operation_identificator = "//android.widget.TextView[contains(@text, '"
				+ TriplannerIdentificators.day_of_operation_identificator_key + "')]";
		return day_of_operation_identificator;
	}

	public static String getPopUpBackButtonIdentificator(String deviceID) {
		ADB adb = new ADB();
		String deviceLang = adb.getDeviceLang(deviceID);
		loadPropertiesFile(deviceLang);
		pop_up_back_button_identificator = "//android.widget.Button[contains(@text, '"
				+ TriplannerIdentificators.pop_up_back_button_identificator_key + "')]";
		return pop_up_back_button_identificator;
	}

	public static String getTripplanActivityTitleIdentificator(String deviceID) {
		ADB adb = new ADB();
		String deviceLang = adb.getDeviceLang(deviceID);
		loadPropertiesFile(deviceLang);
		tripplan_activity_title_identificator = "//android.widget.TextView[contains(@text, '"
				+ TriplannerIdentificators.tripplan_activity_title_identificator_key + "')]";
		return tripplan_activity_title_identificator;
	}

	public static String getConnetionActivityTitleIdentificator(String deviceID) {
		ADB adb = new ADB();
		String deviceLang = adb.getDeviceLang(deviceID);
		loadPropertiesFile(deviceLang);
		connetion_activity_title_identificator = "//android.widget.TextView[contains(@text, '"
				+ TriplannerIdentificators.connetion_activity_title_identificator_key + "')]";
		return connetion_activity_title_identificator;
	}

	public static String getTripInformationActivityTitleIdentificator(String deviceID) {
		ADB adb = new ADB();
		String deviceLang = adb.getDeviceLang(deviceID);
		loadPropertiesFile(deviceLang);
		tripInformation_activity_title_identificator = "//android.widget.TextView[contains(@text, '"
				+ TriplannerIdentificators.tripInformation_activity_title_identificator_key + "')]";
		return tripInformation_activity_title_identificator;
	}
}
