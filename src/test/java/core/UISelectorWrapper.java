package core;

import org.apache.log4j.Level;

public class UISelectorWrapper {

	private String locator = " new UiSelector()";
	private String deviceId = "";

	public UISelectorWrapper(String deviceId) {
		MyLogger.logger.setLevel(Level.DEBUG);
		this.deviceId = deviceId;
	}

	public UISelectorWrapper resourceId(String resourceId) {
		locator += ".resourceId(\"" + resourceId + "\")";
		return this;
	}

	public UISelectorWrapper text(String text) {
		locator += ".text(\"" + text + "\")";
		return this;
	}

	public UISelectorWrapper className(String className) {
		locator += ".className(\"" + className + "\")";
		return this;
	}

	public UISelectorWrapper contentDesc(String contentDesc) {
		locator += ".contentDesc(\"" + contentDesc + "\")";
		return this;
	}

	public UISelectorWrapper tagName(String tagName) {
		locator += ".tagName(\"" + tagName + "\")";
		return this;
	}

	public UISelectorWrapper nameContains(String name) { // to be checked
		locator += ".name(\"" + name + "\")";
		return this;
	}

	public UISelectorWrapper name(String name) {
		locator += ".name(\"" + name + "\")";
		return this;
	}

	public UISelectorWrapper index(int index) {
		locator += ".index(" + index + ")";
		return this;
	}

	public UISelectorWrapper description(String description) {
		locator += ".description(\"" + description + "\")";
		return this;
	}

	public UISelectorWrapper descriptionContains(String value) {
		locator += ".descriptionContains(\"" + value + "\")";
		return this;
	}

	public UISelectorWrapper xPath(String xPath) {
		// locator = ".xPath(\"" + xPath + "\")";
		locator = xPath;
		return this;
	}

	public UIObjectWrapper makeIUObject() {
		return new UIObjectWrapper(locator, this.deviceId);
	}

	boolean isclickable() {
		return true;
	}

}
