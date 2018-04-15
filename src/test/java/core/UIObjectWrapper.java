package core;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.log4j.Level;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import api.android.Android;
import core.manager.DriverManager;
import io.appium.java_client.android.AndroidDriver;

public class UIObjectWrapper {

	private final String locator;
	DriverManager driverManager = new DriverManager();
	AndroidDriver<WebElement> androidDriver;
	private String deviceId = "";
	// private UISelectorWrapper uiLocator;

	public UIObjectWrapper(String locator, String deviceId) {
		this.locator = locator;
		this.deviceId = deviceId;
		setAndroidDroiver();
		MyLogger.logger.setLevel(Level.DEBUG);
	}

	private void setAndroidDroiver() {
		// androidDriver = driverManager.createAndroidDriver();
		// if (Android.driverMap.size() > 0) {
		// androidDriver = Android.driverMap.get(deviceId);
		//
		// }
		// Android.driverMap.
		androidDriver = Android.driverMap.get(this.deviceId);
		// MyLogger.logger.info("LOGGED FROM UIObjectWrapper " + this.deviceId);
		// androidDriver = Android.driver;

	}

	// public void getandroidDriver() {
	// return androidDriver; // = driverManager.createAndroidDriver();
	//
	// }

	private boolean isxPath() {
		return !locator.contains("UiSelector");
	}

	public boolean isVisible() {

		try {
			WebElement element;
			if (isxPath()) {
				element = androidDriver.findElementByXPath(locator);
			} else {
				element = androidDriver.findElementByAndroidUIAutomator(locator);
			}
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean isElementEmpty() {

		try {
			boolean element;
			if (isxPath()) {
				element = androidDriver.findElementsByXPath(locator).isEmpty();
			} else {
				element = androidDriver.findElementsByAndroidUIAutomator(locator).isEmpty();
			}
			return element;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean isSelected() {
		WebElement element;
		if (isxPath()) {
			element = androidDriver.findElementByXPath(locator);
		} else {
			element = androidDriver.findElementByAndroidUIAutomator(locator);
		}
		return element.isSelected();
	}

	public boolean isChecked() {
		WebElement element;
		if (isxPath()) {
			element = androidDriver.findElementByXPath(locator);
		} else {
			element = androidDriver.findElementByAndroidUIAutomator(locator);
		}
		return element.getAttribute("checked").equals(true);
	}

	public boolean isEnabled() {
		WebElement element;
		if (isxPath()) {
			element = androidDriver.findElementByXPath(locator);
		} else {
			element = androidDriver.findElementByAndroidUIAutomator(locator);
		}
		return element.getAttribute("enabled").equals(true);
	}

	public boolean isFocused() {
		WebElement element;
		if (isxPath()) {
			element = androidDriver.findElementByXPath(locator);
		} else {
			element = androidDriver.findElementByAndroidUIAutomator(locator);
		}
		return element.getAttribute("focused").equals(true);
	}

	public boolean isClickable() {
		WebElement element;
		if (isxPath()) {
			element = androidDriver.findElementByXPath(locator);
		} else {
			element = androidDriver.findElementByAndroidUIAutomator(locator);
		}
		return element.getAttribute("clickable").equals(true);
	}

	// public String getText(String locator) {
	// if (isxPath()) {
	// return androidDriver.findElementByXPath(locator).getText();
	// } else {
	// return androidDriver.findElementByAndroidUIAutomator(locator).getText();
	// }
	// }

	public String getText() {
		if (isxPath()) {
			return androidDriver.findElementByXPath(locator).getText();
		} else {
			return androidDriver.findElementByAndroidUIAutomator(locator).getText();
		}
	}

	public String getTagName() { // String locator
		if (isxPath()) {
			return androidDriver.findElementByXPath(locator).getTagName();
		} else {
			return androidDriver.findElementByAndroidUIAutomator(locator).getTagName();
		}
	}

	public String getClassName() { // String locator
		if (isxPath()) {
			return androidDriver.findElementByXPath(locator).getAttribute("className");
		} else {
			return androidDriver.findElementByAndroidUIAutomator(locator).getAttribute("className");
		}
	}

	public String getName() {

		if (isxPath()) {
			return androidDriver.findElementByXPath(locator).getAttribute("name");
		} else {
			return androidDriver.findElementByAndroidUIAutomator(locator).getAttribute("name");
		}
	}

	public String contentTDescription() { // String locator
		if (isxPath()) {
			return androidDriver.findElementByXPath(locator).getAttribute("content-Desc");
		} else {
			return androidDriver.findElementByAndroidUIAutomator(locator).getAttribute("content-Desc");
		}
	}

	public Point getLoaction() { // String locator
		if (isxPath()) {
			return androidDriver.findElementByXPath(locator).getLocation();
		} else {
			return androidDriver.findElementByAndroidUIAutomator(locator).getLocation();
		}
	}

	// return a list of specific Webelement i.e.: a list of linear layout object
	public List<WebElement> getElementsList() {
		if (isxPath()) {
			// MyLogger.logger.info("FINDING ELEMENT BY XPATH:.......... " +
			// locator);
			return androidDriver.findElementsByXPath(locator);
		} else {
			// MyLogger.logger.info("FINDING ELEMENT BY UIAutomator:.......... "
			// + locator);
			return androidDriver.findElementsByAndroidUIAutomator(locator);
		}
	}

	public void tap() {
		if (isxPath()) {
			androidDriver.findElementByXPath(locator).click();
		} else {
			androidDriver.findElementByAndroidUIAutomator(locator).click();
		}
	}

	public void tapListElement(int element_position) {
		if (!getElementsList().isEmpty() && (getElementsList().size() - 1 > element_position)) {
			getElementsList().get(element_position).click();
		}
	}

	public void typeText(String text) {
		if (isxPath()) {
			androidDriver.findElementByXPath(locator).sendKeys(text);
		} else {
			androidDriver.findElementByAndroidUIAutomator(locator).sendKeys(text);
		}
	}

	public void clearText() {
		if (isxPath()) {
			androidDriver.findElementByXPath(locator).clear();
		} else {
			androidDriver.findElementByAndroidUIAutomator(locator).clear();
		}
	}

	public void scrollToElement() {
		String text = ".";
		try {
			if (!locator.contains("text") && !locator.contains("resourceId")) {
				MyLogger.logger
						.error("locator " + locator + " does not contains text. Element is not identified by text.");
				throw new AssertionError(
						"locator " + locator + " does not contains text. Element is not identified by text.");
			} else if (locator.contains("resourceId")) {
				androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()."
						+ "scrollable(true).instance(0)).scrollIntoView( " + locator + ".instance(0));");
			} else {
				if (locator.contains("textcontains")) {
					text = locator.substring(locator.indexOf("[@textcontains=\""), locator.indexOf("\""))
							.replace("[@textcontains=\"", " ");
				} else if (locator.contains("text")) {
					// replacing all special char by whitespace
					// String locatorText = locator.replaceAll("\\W", " ");
					String locatorText = locator.replaceAll("[^a-zA-Z0-9&/-_]", " ");

					text = locatorText.substring(locatorText.indexOf("text"), locatorText.lastIndexOf(" "))
							.replace("text", "").trim();
					// text = text.replace("text", "").trim();
					// String[] textArray = text.split(" ");
					// text = textArray[textArray.length - 2].trim();
					// text = text + " " + textArray[textArray.length -
					// 1].trim();
				}
				androidDriver.findElementByAndroidUIAutomator(
						"new UiScrollable(new UiSelector()." + "scrollable(true).instance(0)).scrollIntoView( new "
								+ "UiSelector().textContains(\"" + text + "\").instance(0));");
				//
				// + ".getChildByText(new
				// UiSelector().className(\"android.widget.TextView\"), " + "\""
				// + text + "\");");
				//
				MyLogger.logger.info("Successffuly scrolled to ............" + text);
			}
		} catch (Exception e) {
			MyLogger.logger.info("scrolling to.." + text + "failed");
			MyLogger.logger.error(e.getMessage() + e.getStackTrace().toString());
			e.printStackTrace();
		}
	}

	public void waitElementToappaer(int seconds) {
		Timer timer = new Timer();
		timer.start();
		while (!timer.isExpired(seconds)) {
			if (isVisible()) {
				// MyLogger.logger.info("element is now displayed" + locator);
				break;
			}
			MyLogger.logger.info("element still not displayed");
		}
		if (timer.isExpired(seconds) && !isVisible()) {
			throw new AssertionError("Element " + locator + " failed to appaer within " + seconds);
		}
	}

	public void waitElementToDisppear(int seconds) {
		Timer timer = new Timer();
		timer.start();
		while (!timer.isExpired(seconds)) {
			if (!isVisible()) {
				break;
			}
		}
		if (timer.isExpired(seconds) && isVisible()) {
			throw new AssertionError("Element " + locator + " failed to disappear within " + seconds);
		}
	}

	// public void setFocus() {
	// WebElement element;
	// if (isxPath()) {
	// element = androidDriver.findElementByXPath(locator);
	// } else {
	// element = androidDriver.findElementByAndroidUIAutomator(locator);
	// }
	// return element.getAttribute("focused").value;
	// // return element.getAttribute("focused").equals(true);
	// }

	// public void scrollTo() {
	// // ...
	// }
}
