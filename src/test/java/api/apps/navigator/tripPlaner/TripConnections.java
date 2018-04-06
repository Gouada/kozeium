package api.apps.navigator.tripPlaner;

import org.apache.log4j.Level;

import api.apps.interfaces.Activity;
import core.MyLogger;

public class TripConnections implements Activity {

	private String deviceID = "";
	TripConnectionsUIObjects tripConnectionsUIObjects; // = new
	// TripPlanerUIObject(this.deviceID);

	public TripConnections(String deviceID) {
		this.deviceID = deviceID;
		tripConnectionsUIObjects = new TripConnectionsUIObjects(this.deviceID);
		MyLogger.logger.setLevel(Level.DEBUG);

	}

	public TripConnections() {
		MyLogger.logger.setLevel(Level.DEBUG);

	}

	@Override
	public void waitToLoad() {
		waitForActivitUIElementstoAppaer();
	}

	private void waitForActivitUIElementstoAppaer() {
		tripConnectionsUIObjects.getButton_earlier().waitElementToappaer(3);
		tripConnectionsUIObjects.getButton_now().waitElementToappaer(3);
		tripConnectionsUIObjects.getButtonFavorite().waitElementToappaer(3);
	}

	public boolean laterButtonIsVisible() {
		// tripConnectionsUIObjects.getButtonLater().waitElementToappaer(5);
		return tripConnectionsUIObjects.getButtonLater().isVisible();
	}

	public boolean earlerButtonIsVisible() {
		return tripConnectionsUIObjects.getButton_earlier().isVisible();
	}

	public boolean laterButtonIsEnabled() {
		return tripConnectionsUIObjects.getButtonLater().isEnabled();
	}

	// provide xpath uiAut cannot find by resource id
	public boolean iAmOnConnectionsActivity() {
		if (!tripConnectionsUIObjects.getActivityTitle().isVisible()) {
			tripConnectionsUIObjects.getActivityTitle().waitElementToappaer(10);
		}

		if ((tripConnectionsUIObjects.getActivityTitle().getText().contains("Connection"))
				|| (tripConnectionsUIObjects.getActivityTitle().getText().contains("Verbindung"))) {
			return true;
		} else {
			return false;
		}
	}

	public void scrollToLaterButton() {
		// if (!tripConnectionsUIObjects.getButtonLater().isVisible()) {
		tripConnectionsUIObjects.getButtonLater().scrollToElement();
		// }
	}

	public void scrollToEarlier() {
		// if (!tripConnectionsUIObjects.getButton_earlier().isVisible()) {
		tripConnectionsUIObjects.getButton_earlier().scrollToElement();
		// }
	}

	public void clickLaterButton() {
		// if (!tripConnectionsUIObjects.getButtonLater().isVisible()) {
		// tripConnectionsUIObjects.getButtonLater().waitElementToappaer(5);
		// }
		tripConnectionsUIObjects.getButtonLater().tap();
	}

	public boolean activityElementsAreVisible() {
		return ((tripConnectionsUIObjects.getButton_earlier().isVisible()
				&& tripConnectionsUIObjects.getButton_now().isVisible())
				|| (tripConnectionsUIObjects.getButtonLater().isVisible()));
	}

	public void selectConnection(int element_position) {
		// if (!tripConnectionsUIObjects.getConnectionsList().isEmpty()) {
		// tripConnectionsUIObjects.getConnectionsList().get(0).click();
		// }
		tripConnectionsUIObjects.getSingleConnectioElement().tapListElement(element_position);
	}
}
