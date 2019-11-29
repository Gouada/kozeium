package api.apps.airbnb.uiObjects.identificators;

public class StoebenUIobjetcsIdentificators {

    public static final String REISEDATEN_BTN_IDENTIFICATOR = "//android.widget.TextView[contains(@text, 'Reisedaten')]";
    public static final String GAESTE_BTN_IDENTIFICATOR = "//android.widget.TextView[contains(@text, 'Gäste')]";
    public static final String FILTER_BTN_IDENTIFICATOR = "//android.widget.TextView[contains(@text, 'Filter')]";
    public static final String SAVE_TRP_DATE_IDENTIFICATOR = "//android.widget.Button[contains(@text, 'Speichern')]";
    public static final String SEARCH_FIELD_IDENTIFICATOR = "com.airbnb.android:id/text_view";
    public static final String MORE_ADULT_BTN_IDENTIFICATOR = "//android.widget.Button[contains(@index, '4') && contains(@ressourceid, 'plus_button')]";
    public static final String MORE_ADULT_TXT_IDENTIFICATOR = "//android.widget.Button[contains(@index, '3') && contains(@ressourceid, 'value')]";
    public static final String MORE_KIDS_TXT_IDENTIFICATOR = "//android.widget.Button[contains(@index, '8') && contains(@ressourceid, 'value')]";
    public static final String MORE_BABY_TXT_IDENTIFICATOR = "//android.widget.Button[contains(@index, '13') && contains(@ressourceid, 'value')]";
    public static final String GAESTE_INFO_SPEICHERN_BTN_IDENTIFICATOR = "//android.widget.TextView[contains(@text, 'Ergebnisse anzeigen')]";
    private String device_ID;

    public StoebenUIobjetcsIdentificators(String device_ID) {
        this.device_ID = device_ID;
    }

}
