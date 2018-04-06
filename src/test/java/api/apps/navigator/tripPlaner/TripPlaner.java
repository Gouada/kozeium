package api.apps.navigator.tripPlaner;

import org.apache.log4j.Level;

import core.MyLogger;

public class TripPlaner {

	private String deviceID = "";
	TripPlanerUIObject tripPlanerUIObject; // = new
											// TripPlanerUIObject(this.deviceID);

	public TripPlaner(String deviceID) {
		this.deviceID = deviceID;
		tripPlanerUIObject = new TripPlanerUIObject(this.deviceID);
		MyLogger.logger.setLevel(Level.DEBUG);

	}

	public TripPlaner() {
		MyLogger.logger.setLevel(Level.DEBUG);

	}

	/*
	 * // This method should exist only here not in sub-classes public void
	 * clickDrawerMenu() { tripPlanerUIObject.getdrawerMenu().tap(); }
	 * 
	 * public void clickStartStion() {
	 * tripPlanerUIObject.getStartStation().tap(); }
	 * 
	 * public void typeStartStionName(String startStationName) {
	 * tripPlanerUIObject.getInputLocationName().typeText(startStationName); //
	 * tripPlanerUIObject.getStartStation().typeText(startStationName); }
	 * 
	 * public void typeTargetStationName(String targetStationName) {
	 * tripPlanerUIObject.getInputLocationName().typeText(targetStationName); //
	 * tripPlanerUIObject.getTragetStation().typeText(targetStationName); }
	 * 
	 * public void clickStationNameInList(String Station_name) {
	 * tripPlanerUIObject.getStattionFromList(Station_name).tap(); }
	 * 
	 * public void clickDateSelector() {
	 * tripPlanerUIObject.getStartDateSelector().tap(); }
	 * 
	 * public void clickLargeDateSelector() {
	 * tripPlanerUIObject.getLargeStartDateSelector().tap(); }
	 * 
	 * public void selectStartDate() { tripPlanerUIObject.getStartDate().tap();
	 * }
	 * 
	 * public void clickTimeSelector() {
	 * tripPlanerUIObject.getStartTimeSelector().tap(); }
	 * 
	 * public void clickLargeTimeSelector() {
	 * tripPlanerUIObject.getLargeStartTimeSelector().tap(); }
	 * 
	 * public void selectTime() { }
	 * 
	 * public void clickSearchButton() {
	 * tripPlanerUIObject.getSearchButton().tap(); }
	 * 
	 * public void clickDoneButton() {
	 * tripPlanerUIObject.getDateSeletionDoneButton().tap(); }
	 * 
	 * public void clickTargetStation() {
	 * tripPlanerUIObject.getTragetStation().tap(); }
	 * 
	 * public void scrollToLaterButton() { if
	 * (!tripPlanerUIObject.getButtonLater().isVisible()) {
	 * tripPlanerUIObject.getButtonLater().scrollToElement(); } }
	 * 
	 * public void scrollToEarlier() { if
	 * (!tripPlanerUIObject.getButton_earlier().isVisible()) {
	 * tripPlanerUIObject.getButton_earlier().scrollToElement(); } }
	 * 
	 * public void clickLaterButton() {
	 * tripPlanerUIObject.getButtonLater().tap(); }
	 * 
	 * public boolean searchButtonIsVisible() { return
	 * tripPlanerUIObject.getSearchButton().isVisible(); }
	 * 
	 * public boolean iAmOnTripInformationActivity() { if
	 * (tripPlanerUIObject.getActivityTitle().getText().contains("Reseauskunft")
	 * ) { return true; } else { return false; } }
	 * 
	 * public boolean iAmOnConnectionsActivity() { if
	 * (tripPlanerUIObject.getActivityTitle().getText().contains("Verbindungen")
	 * ) { return true; } else { return false; } }
	 * 
	 * public boolean iAmOnTripPlanActivity() { if
	 * (tripPlanerUIObject.getActivityTitle().getText().contains("Reiseplan")) {
	 * return true; } else { return false; } }
	 * 
	 * public boolean laterButtonIsVisible() { return
	 * tripPlanerUIObject.getButtonLater().isVisible(); }
	 * 
	 * public boolean earlerButtonIsVisible() { return
	 * tripPlanerUIObject.getButton_earlier().isVisible(); }
	 * 
	 * public boolean laterButtonIsEnabled() { return
	 * tripPlanerUIObject.getButtonLater().isEnabled(); }
	 * 
	 */
}
