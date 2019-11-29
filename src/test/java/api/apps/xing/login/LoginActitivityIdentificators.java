package api.apps.xing.login;

import core.ADB;
import core.PropertiesFilesLoader;
import model.Device;

import java.util.Calendar;
import java.util.Properties;

public class LoginActitivityIdentificators {

    public static final String txtV_go_to_login_identificator = "com.xing.android:id/textview_welcome_login";
    public static final String editTxtUsernameIdentificator = "com.xing.android:id/edit_user";
    public static final String editTxtUserPwdIdentificator = "com.xing.android:id/edit_password";
    public static final String btnLoginButtonIdentificator = "com.xing.android:id/button_login";
    public static String day_of_operation_identificator = "";
    static Calendar calendar = Calendar.getInstance();
    static int today = calendar.get(Calendar.DAY_OF_MONTH);
    private static String tripplan_activity_title_identificator;
    private static Properties properties;
    private static String propertiy_filename;
    private static String SINGLE_CONNECTION_IDENTIFICATOR_KEY = "single_connection_identificator_key";
    private static String TRIPINFORMATION_ACTIVITY_TITLE_IDENTIFICATOR_KEY = "tripInformation_activity_title_identificator_key";
    private final Device device = null;
    private PropertiesFilesLoader propertiesFilesLoader;

    LoginActitivityIdentificators(String device_ID) {
        ADB adb = new ADB();
        String device_lang = adb.getDeviceLang(device_ID);
        propertiy_filename = getPropertiFileName(device_lang);
        properties = PropertiesFilesLoader.getInstance(propertiy_filename).loadPropertiesFile();
    }

    LoginActitivityIdentificators() {
        // TODO Auto-generated constructor stub
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


    //public String getTripInformationActivityTitleIdentificator() {
    // ADB adb = new ADB();
    // String deviceLang = adb.getDeviceLang(deviceID);
    // loadPropertiesFile(deviceLang);
    //tripInformation_activity_title_identificator = "//android.widget.TextView[contains(@text, '"
    //	+ properties.getProperty(TriplannerIdentificators.TRIPINFORMATION_ACTIVITY_TITLE_IDENTIFICATOR_KEY)
    //+ "')]";
    //return tripInformation_activity_title_identificator;
    //}

}

