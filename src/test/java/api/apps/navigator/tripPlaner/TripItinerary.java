package api.apps.navigator.tripPlaner;

import org.apache.log4j.Level;

import api.apps.interfaces.Activity;
import core.MyLogger;

public class TripItinerary implements Activity {

	private String deviceID = "";
	private final TripItineraryUIObjects tripItineraryUIObjects;

	@Override
	public void waitToLoad() {
		// TODO Auto-generated method stub
	}

	public TripItinerary(String deviceID) {
		super();
		this.deviceID = deviceID;
		tripItineraryUIObjects = new TripItineraryUIObjects(this.deviceID);
		MyLogger.logger.setLevel(Level.DEBUG);
	}

	// provide xpath uiAut cannot find by resource id
	public boolean iAmOnItineraryActivity() {
		if (!tripItineraryUIObjects.getActivityTitle().isVisible()) {
			tripItineraryUIObjects.getActivityTitle().waitElementToappaer(10);
		}

		if ((tripItineraryUIObjects.getActivityTitle().getText().contains("Itinerary"))
				|| (tripItineraryUIObjects.getActivityTitle().getText().contains("Reiseplan"))) {
			return true;
		} else {
			return false;
		}
	}

	public void clickMfeButton() {
		tripItineraryUIObjects.getMfeSecondary().tap();
	}

	public boolean popUpWindowIsopen() {
		// TODO Auto-generated method stub
		return true;
	}

	public void clickOperationDays() {
		if (!tripItineraryUIObjects.getDaysOfOperation().isFocused()) {
			tripItineraryUIObjects.getDaysOfOperation().tap();
		}
		tripItineraryUIObjects.getDaysOfOperation().tap();
	}

	public void clickBackButton() {
		tripItineraryUIObjects.getPopUpBackButton().tap();
	}
}
