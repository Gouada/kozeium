package api.apps.myCalculator.operations;

import static api.apps.myCalculator.operations.CalculatorKeyBoardElementsIndentificators.DEVIDE_IDENTIFICATOR;
import static api.apps.myCalculator.operations.CalculatorKeyBoardElementsIndentificators.DIGITS_INDENTFICATOR_PREFIX;
import static api.apps.myCalculator.operations.CalculatorKeyBoardElementsIndentificators.EQUALS_IDENTIFICATOR;
import static api.apps.myCalculator.operations.CalculatorKeyBoardElementsIndentificators.MINUS_IDENTIFICATOR;
import static api.apps.myCalculator.operations.CalculatorKeyBoardElementsIndentificators.MULTIPLY_IDENTIFICATOR;
import static api.apps.myCalculator.operations.CalculatorKeyBoardElementsIndentificators.OPERATOR_INDENTFICATOR_PREFIX;
import static api.apps.myCalculator.operations.CalculatorKeyBoardElementsIndentificators.PLUS_IDENTIFICATOR;

import core.UIObjectWrapper;
import core.UISelectorWrapper;

public class CalculatorKeyBoardUIObejects {

	private final String deviceID;
	private UIObjectWrapper uiObjectWrapper, keyObject, plus_key, minus_key, multiply_key, devide_key, equals_key;

	public CalculatorKeyBoardUIObejects(String deviceID) {
		this.deviceID = deviceID;
	}

	public UIObjectWrapper getAKey(String keyValue) {
		String key_resourceID = DIGITS_INDENTFICATOR_PREFIX + keyValue;
		keyObject = new UISelectorWrapper(this.deviceID).resourceId(key_resourceID).makeIUObject();
		return keyObject;
	}

	public UIObjectWrapper getPlusKey() {
		plus_key = new UISelectorWrapper(this.deviceID).xPath(PLUS_IDENTIFICATOR).makeIUObject();
		return plus_key;
	}

	public UIObjectWrapper getMinusKey() {
		minus_key = new UISelectorWrapper(this.deviceID).xPath(MINUS_IDENTIFICATOR).makeIUObject();
		return minus_key;
	}

	public UIObjectWrapper getMultiplyKey() {
		multiply_key = new UISelectorWrapper(this.deviceID).xPath(MULTIPLY_IDENTIFICATOR).makeIUObject();
		return multiply_key;
	}

	public UIObjectWrapper getDevideKey() {
		devide_key = new UISelectorWrapper(this.deviceID).xPath(DEVIDE_IDENTIFICATOR).makeIUObject();
		return devide_key;
	}

	public UIObjectWrapper getEqualyKey() {
		devide_key = new UISelectorWrapper(this.deviceID).xPath(EQUALS_IDENTIFICATOR).makeIUObject();
		return devide_key;
	}

	public UIObjectWrapper getOperatorKey(String keyValue) {
		String key_resourceID = OPERATOR_INDENTFICATOR_PREFIX + keyValue;
		return new UISelectorWrapper(this.deviceID).resourceId(key_resourceID).makeIUObject();
	}
}
