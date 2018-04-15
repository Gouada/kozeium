package api.apps.navigator.navigation;

import java.util.Properties;

import org.apache.commons.lang.NullArgumentException;

import core.ADB;
import core.PropertiesFilesLoader;

public class NavigationUIelementsIdentificators {

	private static String propertiy_filename;
	private static Properties properties;

	public static String INFORMATION_AND_BOOKING_LINK_IDENTIFICATOR = "information_boking_key";
	public static String FAVORITE_AND_HISTORY_LINK_IDENTIFICATOR = "favorite_history_key";
	public static String TRIP_INFORMATION_LINK_IDENTIFICATOR = "trip_information_key";
	public static String REAL_TIME_INFORMATION_LINK_IDENTIFICATOR = "real_time_information_key";
	public static String SAVE_FARES_LINK_IDENTIFICATOR = "saves_fares_key";
	public static String VERBUND_TICKETS_LINK_IDENTIFICATOR = "verbund_tickets_key";
	public static String REGIONAL_OFFERS_LINK_IDENTIFICATOR = "regional_offers_key";
	public static String MY_TICKETS_LINK_IDENTIFICATOR = "my_tickets_key";
	public static String ADD_TICKET_LINK_IDENTIFICATOR = "add_ticket_key";
	public static String FIND_ORDER_LINK_IDENTIFICATOR = "find_order_key";
	public static String TIME_TABLE_LINK_IDENTIFICATOR = "time_table_key";
	public static String IS_MY_TRAIN_ON_TIME_LINK_IDENTIFICATOR = "is_my_train_on_time_key";
	public static String MAP_LINK_IDENTIFICATOR = "map_key";
	public static String DELAY_NOTIFICATION_LINK_IDENTIFICATOR = "delay_notification_key";
	public static String BAHNCARD_LINK_IDENTIFICATOR = "bahn_card_key";
	public static String FEEDBACK_DIALOG_LINK_IDENTIFICATOR = "feedback_key";
	public static String IMPRINT_LINK_IDENTIFICATOR = "imprint_key";
	public static String DRAWER_MENU_IDENTIFICATOR = "drawer_menu_identificator_key";

	public NavigationUIelementsIdentificators() {
		super();
	}

	public NavigationUIelementsIdentificators(String device_ID) {
		ADB adb = new ADB();
		String device_lang = adb.getDeviceLang(device_ID);
		propertiy_filename = getPropertiFileName(device_lang);
		properties = PropertiesFilesLoader.getInstance(propertiy_filename).loadPropertiesFile();
	}

	public String getElementIdentificatorByText(String key) {
		try {
			return "//android.widget.TextView[contains(@text, '" + properties.getProperty(key) + "')]";
		} catch (NullPointerException e) {
			throw new NullArgumentException("properties variable in NavigationUIelementsIdentificators is null");
		}
	}

	public String getElementIdentificatorByContenDesc(String key) {
		try {
			return "//android.widget.ImageButton[contains(@content-desc, '" + properties.getProperty(key) + "')]";
		} catch (NullPointerException e) {
			throw new NullArgumentException("properties variable in NavigationUIelementsIdentificators is null");
		}
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

}
