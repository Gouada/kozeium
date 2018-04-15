package api.apps.navigator.navigation;

import org.openqa.selenium.NoSuchElementException;

import core.MyLogger;

public class Navigation {

	private final NavigationUIObjects navigationUIObjects;
	// private final String device_ID;

	public Navigation(String device_ID) {
		// this.device_ID = device_ID;
		navigationUIObjects = new NavigationUIObjects(device_ID);
	}

	public void clickUIObject(String uiobjectIdentificator) {
		try {
			navigationUIObjects.getUIObjecByText(uiobjectIdentificator).waitElementToappaer(3);
			navigationUIObjects.getUIObjecByText(uiobjectIdentificator).tap();
			MyLogger.logger.info("clicked " + uiobjectIdentificator);
		} catch (Exception e) {
			MyLogger.logger.error(e.getMessage() + e.getStackTrace().toString());
			e.printStackTrace();
		}
	}

	public void scrollToElement(String uiobjectIdentificator) {
		try {
			if (!navigationUIObjects.getUIObjecByText(uiobjectIdentificator).isElementEmpty()) {
				MyLogger.logger.info("Object was already visible no need to scroll");
			} else {
				MyLogger.logger.info("scrolling to  " + uiobjectIdentificator);
				navigationUIObjects.getUIObjecByText(uiobjectIdentificator).scrollToElement();
				navigationUIObjects.getUIObjecByText(uiobjectIdentificator).waitElementToappaer(15);
				MyLogger.logger.info("scrolled to  " + uiobjectIdentificator);
			}
		} catch (NoSuchElementException e) {
			navigationUIObjects.getUIObjecByText(uiobjectIdentificator).scrollToElement();
			navigationUIObjects.getUIObjecByText(uiobjectIdentificator).waitElementToappaer(3);

			MyLogger.logger.error(e.getMessage() + e.getStackTrace().toString());
			e.printStackTrace();
		}

	}

	public void clickUIObjectFoundByContentDesc(String uiobjectIdentificator) {
		try {
			navigationUIObjects.getUIObjecByContentDesc(uiobjectIdentificator).waitElementToappaer(1);
			navigationUIObjects.getUIObjecByContentDesc(uiobjectIdentificator).tap();
			MyLogger.logger.info("clicked " + uiobjectIdentificator);
		} catch (Exception e) {
			MyLogger.logger.error(e.getMessage() + e.getStackTrace().toString());
			e.printStackTrace();
		}

	}
}
