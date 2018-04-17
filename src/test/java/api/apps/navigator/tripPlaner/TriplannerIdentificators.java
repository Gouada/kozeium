package api.apps.navigator.tripPlaner;

import java.util.Calendar;
import java.util.Properties;

import core.ADB;
import core.PropertiesFilesLoader;
import model.Device;

public class TriplannerIdentificators {

	private PropertiesFilesLoader propertiesFilesLoader;
	private final Device device = null;
	private static String tripplan_activity_title_identificator;
	private static String connetion_activity_title_identificator;

	private static Properties properties;
	private static String propertiy_filename;

	private static String SINGLE_CONNECTION_IDENTIFICATOR_KEY = "single_connection_identificator_key";
	private static String DRAWER_MENU_IDENTIFICATOR_KEY = "drawer_menu_identificator_key";

	static Calendar calendar = Calendar.getInstance();
	static int today = calendar.get(Calendar.DAY_OF_MONTH);

	public static String drawer_menu_identificator = "";
	public static final String START_STATION_IDENTIFICATOR = "de.hafas.android.db:id/input_start";
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
	private static String DAY_OF_OPERATION_IDENTIFICATOR_KEY = "day_of_operation_identificator_key";
	private static String POP_UP_BACK_BUTTON_IDENTIFICATOR_KEY = "pop_up_back_button_identificator_key";
	private static String TRIPLAN_ACTIVITY_TITLE_IDETIFICATOR_KEY = "tripplan_activity_title_identificator_key";
	private static String CONNECTION_ACTIVITY_TITLE_IDENTIFICATOR_KEY = "connetion_activity_title_identificator_key";
	private static String tripInformation_activity_title_identificator;
	private static String TRIPINFORMATION_ACTIVITY_TITLE_IDENTIFICATOR_KEY = "tripInformation_activity_title_identificator_key";

	// constructors
	public TriplannerIdentificators(String device_ID) {
		ADB adb = new ADB();
		String device_lang = adb.getDeviceLang(device_ID);
		propertiy_filename = getPropertiFileName(device_lang);
		properties = PropertiesFilesLoader.getInstance(propertiy_filename).loadPropertiesFile();
	}

	public TriplannerIdentificators() {
	}

	public String getPropertiFileName(String device_lang) {
		if (device_lang.contains("en")) {
			return "en-US.properties";
		}
		if (device_lang.contains("de")) {
			return "de-DE.properties";
		} else {
			return null;
		}
	}

	public String getSingleConnectionIdentificator() {
		// ADB adb = new ADB();
		// String deviceLang = adb.getDeviceLang(deviceID);
		// loadPropertiesFile(deviceLang);
		single_connection_identificator = "//android.widget.LinearLayout[contains(@content-desc, '"
				+ properties.getProperty(TriplannerIdentificators.SINGLE_CONNECTION_IDENTIFICATOR_KEY) + "')]";
		return single_connection_identificator;
	}

	public String getDrawerMenuIdentificator() {
		// ADB adb = new ADB();
		// String deviceLang = adb.getDeviceLang(deviceID);
		// loadPropertiesFile(deviceLang);
		drawer_menu_identificator = "//android.widget.ImageButton[contains(@content-desc, '"
				+ properties.getProperty(TriplannerIdentificators.DRAWER_MENU_IDENTIFICATOR_KEY) + "')]";
		return drawer_menu_identificator;
	}

	public String getDayOfOperationsIdentificator() {
		// ADB adb = new ADB();
		// String deviceLang = adb.getDeviceLang(deviceID);
		// loadPropertiesFile(deviceLang); //
		// android.widget.TextView[contains(@resource-id,
		// 'android:id/text1')]";
		day_of_operation_identificator = "//android.widget.TextView[contains(@text, '"
				+ properties.getProperty(TriplannerIdentificators.DAY_OF_OPERATION_IDENTIFICATOR_KEY) + "')]";
		return day_of_operation_identificator;
	}

	public String getPopUpBackButtonIdentificator() {
		// ADB adb = new ADB();
		// String deviceLang = adb.getDeviceLang(deviceID);
		// loadPropertiesFile(deviceLang);
		pop_up_back_button_identificator = "//android.widget.Button[contains(@text, '"
				+ properties.getProperty(TriplannerIdentificators.POP_UP_BACK_BUTTON_IDENTIFICATOR_KEY) + "')]";
		return pop_up_back_button_identificator;
	}

	public String getTripplanActivityTitleIdentificator() {
		// ADB adb = new ADB();
		// String deviceLang = adb.getDeviceLang(deviceID);
		// loadPropertiesFile(deviceLang);
		tripplan_activity_title_identificator = "//android.widget.TextView[contains(@text, '"
				+ properties.getProperty(TriplannerIdentificators.TRIPLAN_ACTIVITY_TITLE_IDETIFICATOR_KEY) + "')]";
		return tripplan_activity_title_identificator;
	}

	public String getConnetionActivityTitleIdentificator() {
		// ADB adb = new ADB();
		// String deviceLang = adb.getDeviceLang(deviceID);
		// loadPropertiesFile(deviceLang);
		connetion_activity_title_identificator = "//android.widget.TextView[contains(@text, '"
				+ properties.getProperty(TriplannerIdentificators.CONNECTION_ACTIVITY_TITLE_IDENTIFICATOR_KEY) + "')]";
		return connetion_activity_title_identificator;
	}

	public String getTripInformationActivityTitleIdentificator() {
		// ADB adb = new ADB();
		// String deviceLang = adb.getDeviceLang(deviceID);
		// loadPropertiesFile(deviceLang);
		tripInformation_activity_title_identificator = "//android.widget.TextView[contains(@text, '"
				+ properties.getProperty(TriplannerIdentificators.TRIPINFORMATION_ACTIVITY_TITLE_IDENTIFICATOR_KEY)
				+ "')]";
		return tripInformation_activity_title_identificator;
	}

	//
	// public static void loadPropertiesFile(String deviceLang) {
	// String file_name = "";
	// MyLogger.logger.info("Loading " + deviceLang + " properties file ...");
	//
	// // in this case adb ... persist.sys.locale is i.e.: de-DE. For emulator
	// // the return vavule is i.e.: just de
	// if (deviceLang.contains("-")) {
	// file_name = deviceLang + ".properties";
	// } else // if (deviceLang.length() >= 2 && deviceLang.length() < 5)
	// {
	// file_name = deviceLang + "-" + deviceLang.toUpperCase() + ".properties";
	// }
	// PropertiesFilesLoader propertiesFilesLoader =
	// PropertiesFilesLoader.getInstance(file_name);
	//
	// TriplannerIdentificators.SINGLE_CONNECTION_IDENTIFICATOR_KEY =
	// propertiesFilesLoader
	// .getPropertyByKey("single_connection_identificator_key");
	//
	// TriplannerIdentificators.DRAWER_MENU_IDENTIFICATOR_KEY =
	// propertiesFilesLoader
	// .getPropertyByKey("drawer_menu_identificator_key");
	//
	// TriplannerIdentificators.DAY_OF_OPERATION_IDENTIFICATOR_KEY =
	// propertiesFilesLoader
	// .getPropertyByKey("day_of_operation_identificator_key");
	//
	// TriplannerIdentificators.POP_UP_BACK_BUTTON_IDENTIFICATOR_KEY =
	// propertiesFilesLoader
	// .getPropertyByKey("pop_up_back_button_identificator_key");
	//
	// TriplannerIdentificators.TRIPLAN_ACTIVITY_TITLE_IDETIFICATOR_KEY =
	// propertiesFilesLoader
	// .getPropertyByKey("tripplan_activity_title_identificator_key");
	//
	// TriplannerIdentificators.CONNECTION_ACTIVITY_TITLE_IDENTIFICATOR_KEY =
	// propertiesFilesLoader
	// .getPropertyByKey("connetion_activity_title_identificator_key");
	//
	// TriplannerIdentificators.TRIPINFORMATION_ACTIVITY_TITLE_IDENTIFICATOR_KEY
	// = propertiesFilesLoader
	// .getPropertyByKey("tripInformation_activity_title_identificator_key");
	// }

}
