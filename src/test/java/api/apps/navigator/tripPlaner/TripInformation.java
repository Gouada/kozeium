package api.apps.navigator.tripPlaner;

import org.apache.log4j.Level;

import api.apps.interfaces.Activity;
import core.MyLogger;

public class TripInformation implements Activity {

	private String deviceID = "";
	TripInformationUIObjects tripInformationUIObjects; // = new
	// TripPlanerUIObject(this.deviceID);

	public TripInformation(String deviceID) {
		this.deviceID = deviceID;
		tripInformationUIObjects = new TripInformationUIObjects(this.deviceID);
		MyLogger.logger.setLevel(Level.DEBUG);

	}

	public TripInformation() {
		MyLogger.logger.setLevel(Level.DEBUG);
	}

	@Override
	public void waitToLoad() {
		waitForActivitUIElementstoAppaer();
	}

	private void waitForActivitUIElementstoAppaer() {
		tripInformationUIObjects.getStartStation().waitElementToappaer(3);
		tripInformationUIObjects.getTragetStation().waitElementToappaer(3);
		tripInformationUIObjects.getSearchButton().waitElementToappaer(3);
	}

	public void clickDrawerMenu() {
		tripInformationUIObjects.getdrawerMenu().tap();
	}

	public void clickStartStion() {
		tripInformationUIObjects.getStartStation().tap();
	}

	public void typeStartStionName(String startStationName) {
		tripInformationUIObjects.getInputLocationName().typeText(startStationName);
		// tripPlanerUIObject.getStartStation().typeText(startStationName);
	}

	public void typeTargetStationName(String targetStationName) {
		tripInformationUIObjects.getInputLocationName().typeText(targetStationName);
		// tripPlanerUIObject.getTragetStation().typeText(targetStationName);
	}

	public void clickStationNameInList(String Station_name) {
		tripInformationUIObjects.getStattionFromList(Station_name).tap();
	}

	public void clickDateSelector() {
		tripInformationUIObjects.getStartDateSelector().tap();
	}

	public void clickLargeDateSelector() {
		tripInformationUIObjects.getLargeStartDateSelector().tap();
	}

	public void selectStartDate() {
		tripInformationUIObjects.getStartDate().tap();
	}

	public void clickTimeSelector() {
		tripInformationUIObjects.getStartTimeSelector().tap();
	}

	public void clickLargeTimeSelector() {
		tripInformationUIObjects.getLargeStartTimeSelector().tap();
	}

	public void selectTime() {
	}

	public void clickSearchButton() {
		tripInformationUIObjects.getSearchButton().tap();
	}

	public void clickDoneButton() {
		tripInformationUIObjects.getDateSeletionDoneButton().tap();
	}

	public void clickTargetStation() {
		tripInformationUIObjects.getTragetStation().tap();
	}

	public boolean iAmOnTripInformationActivity() {
		if (tripInformationUIObjects.getActivityTitle().getText().contains("Reseauskunft")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean activitUIElementsArePresent() {
		return (tripInformationUIObjects.getSearchButton().isVisible()
				&& tripInformationUIObjects.getStartStation().isVisible()
				&& tripInformationUIObjects.getTragetStation().isVisible());

	}

}
