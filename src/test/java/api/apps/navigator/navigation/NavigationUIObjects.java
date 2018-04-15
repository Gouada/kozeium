package api.apps.navigator.navigation;

import core.UIObjectWrapper;
import core.UISelectorWrapper;

public class NavigationUIObjects {

	private final String device_ID;
	private final NavigationUIelementsIdentificators navigationUIelementsIdentificators;

	private String locator;

	public NavigationUIObjects(String device_ID) {
		this.device_ID = device_ID;
		navigationUIelementsIdentificators = new NavigationUIelementsIdentificators(device_ID);

	}

	public UIObjectWrapper getUIObjecByText(String identificator) {
		locator = navigationUIelementsIdentificators.getElementIdentificatorByText(identificator);
		return new UISelectorWrapper(this.device_ID).xPath(locator).makeIUObject();
	}

	public UIObjectWrapper getUIObjecByContentDesc(String identificator) {
		locator = navigationUIelementsIdentificators.getElementIdentificatorByContenDesc(identificator);
		return new UISelectorWrapper(this.device_ID).xPath(locator).makeIUObject();
	}

}
