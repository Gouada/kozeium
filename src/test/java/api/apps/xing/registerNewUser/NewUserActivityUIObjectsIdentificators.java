package api.apps.xing.registerNewUser;

import core.ADB;
import core.PropertiesFilesLoader;

import java.util.Properties;

public class NewUserActivityUIObjectsIdentificators {

    public static final String SIGN_UP_BUTTON_RESOURCE_ID = "com.xing.android:id/button_welcome_register";
    public static final String NEXT_EMAIL_RESOURCE_ID = "com.xing.android:id/textview_registration_email_next";
    public static final String EMAIL_RESOURCE_ID = "com.xing.android:id/input_edittext_registration_email";
    public static final String USERNAME_RESOURCE_ID = "com.xing.android:id/input_edittext_registration_name";
    public static final String USERSURNAME_RESOURCE_ID = "com.xing.android:id/input_edittext_registration_surname";
    public static final String NEXT_BTN_NAME_RESOURCE_ID = "com.xing.android:id/textview_registration_next";
    private static String propertiy_filename;
    private static Properties properties;
    private String device_ID;
    private PropertiesFilesLoader propertiesFilesLoader;


    public NewUserActivityUIObjectsIdentificators(String device_ID) {
        this.device_ID = device_ID;
        ADB adb = new ADB();
        String device_lang = adb.getDeviceLang(device_ID);
        propertiy_filename = getPropertiFileName(device_lang);
        properties = PropertiesFilesLoader.getInstance(propertiy_filename).loadPropertiesFile();

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
