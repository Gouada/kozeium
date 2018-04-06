package api.apps.navigator.tripPlaner;

import static api.apps.navigator.tripPlaner.TriplannerIdentificators.button_earlier_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.button_favorite_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.button_later_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.button_now_identificator;
import static api.apps.navigator.tripPlaner.TriplannerIdentificators.single_connection_identificator;

import java.util.List;

import org.apache.log4j.Level;
import org.openqa.selenium.WebElement;

import core.MyLogger;
import core.UIObjectWrapper;
import core.UISelectorWrapper;

public class TripConnectionsUIObjects extends TripPlanerUIObject {

	private final String drawer_identificator = "...";

	// deviceId is required for parallel testting
	public String deviceId;

	public TripConnectionsUIObjects() {
	}

	public TripConnectionsUIObjects(String deviceId) {
		this.deviceId = deviceId;
		MyLogger.logger.setLevel(Level.DEBUG);
	}

	UISelectorWrapper uiSelector = new UISelectorWrapper(this.deviceId);

	private static UIObjectWrapper uiobject, button_later, button_earlier, button_now, button_favorite, activity_title,
			single_connection;
	private static List<WebElement> connection_list;

	public UIObjectWrapper getButtonLater() {
		button_later = new UISelectorWrapper(this.deviceId).resourceId(button_later_identificator).makeIUObject();
		// button_later = new
		// UISelectorWrapper(this.deviceId).text(button_later_identificator).makeIUObject();
		// button_later = new
		// UISelectorWrapper(this.deviceId).xPath(button_later_identificator).makeIUObject();
		return button_later;
	}

	public UIObjectWrapper getButton_earlier() {
		button_earlier = new UISelectorWrapper(this.deviceId).resourceId(button_earlier_identificator).makeIUObject();
		return button_earlier;
	}

	public UIObjectWrapper getButton_now() {
		button_now = new UISelectorWrapper(this.deviceId).resourceId(button_now_identificator).makeIUObject();
		return button_now;
	}

	public UIObjectWrapper getButtonFavorite() {
		button_favorite = new UISelectorWrapper(this.deviceId).resourceId(button_favorite_identificator).makeIUObject();
		return button_favorite;
	}

	// public UIObjectWrapper getActivityTitle() {
	// activity_title = new
	// UISelectorWrapper(this.deviceId).resourceId(activity_title_identificator).makeIUObject();
	// return activity_title;
	// }

	public List<WebElement> getConnectionsList() {
		// connection_list = new
		// UISelectorWrapper(this.deviceId).resourceId(connection_list_identificator).makeIUObject();
		single_connection = new UISelectorWrapper(this.deviceId).xPath(single_connection_identificator).makeIUObject();
		connection_list = single_connection.getElementsList();
		return connection_list;
	}

	public UIObjectWrapper getSingleConnectioElement() {
		String single_connection_identificator = TriplannerIdentificators
				.getSingleConnectionIdentificator(this.deviceId);
		single_connection = new UISelectorWrapper(this.deviceId).xPath(single_connection_identificator).makeIUObject(); // single_connection_identificator
		return single_connection;
	}
}
