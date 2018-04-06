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
	private static Properties properties;
	private static String single_connection_identificatorkey;

	static Calendar calendar = Calendar.getInstance();
	static int today = calendar.get(Calendar.DAY_OF_MONTH);

	public static final String drawer_identificator = "...";

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

	public static final String button_later_identificator = "de.hafas.android.db:id/button_later"; // "//android.widget.Button[@text=\"Später\"]";
																									// //
																									// "de.hafas.android.db:id/button_later";

	public static final String button_mfe_secondary_identificator = "de.hafas.android.db:id/button_mfe_secondary";

	public static final String day_of_operation_identificator = "//android.widget.TextView[contains(@text, 'Verkehrstage')]";

	public static final String pop_up_back_button_identificator = "//android.widget.Button[contains(@text,'ZURÜCK')]";

	public static final String button_earlier_identificator = "de.hafas.android.db:id/button_earlier";

	public static final String button_now_identificator = "de.hafas.android.db:id/button_now";

	public static final String button_favorite_identificator = "de.hafas.android.db:id/button_favorite";

	public static final String activity_title_identificator = "de.hafas.android.db:id/actionbar_title"; // "xpath(//android.widget.Button[@text=''])";

	public static final String connection_list_identificator = "de.hafas.android.db:id/list_connection";
	// public static final String single_connection_identificator =
	// "//android.widget.LinearLayout[contains(@content-desc, 'Fahrt mit Abfahrt
	// um')]";

	// "//android.widget.LinearLayout[contains(@content-desc, '" +
	// TriplannerIdentificators.single_connection_identificatorkey + "')]";
	public static String single_connection_identificator;

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

		TriplannerIdentificators.single_connection_identificatorkey = propertiesFilesLoader
				.getPropertyByKey("single_connection_identificatorkey");
	}

	public static String getSingleConnectionIdentificator(String deviceID) {
		ADB adb = new ADB();
		String deviceLang = adb.getDeviceLang(deviceID);
		loadPropertiesFile(deviceLang);
		single_connection_identificator = "//android.widget.LinearLayout[contains(@content-desc, '"
				+ TriplannerIdentificators.single_connection_identificatorkey + "')]";
		return single_connection_identificator;
	}

	// public static String getProperty(String propertyKey) {
	// MyLogger.logger.info("getting property with following key..." +
	// propertyKey);
	// if (properties == null) {
	// MyLogger.logger.info("properties is null............");
	// }
	// return properties.getProperty(propertyKey);
	// }
}
