package api.apps.myCalculator.operations;

public class CalculatorKeyBoard {

	private final String deviceID;

	private final CalculatorKeyBoardUIObejects calculatorKeyBoardUIObejects;

	public CalculatorKeyBoard(String deviceID) {
		this.deviceID = deviceID;
		calculatorKeyBoardUIObejects = new CalculatorKeyBoardUIObejects(this.deviceID);
	}

	public void clickADigit(String keyValue) {
		calculatorKeyBoardUIObejects.getAKey(keyValue).tap();
	}

	public void clickPlus() {
		calculatorKeyBoardUIObejects.getPlusKey().tap();
	}

	public void clickMinus() {
		calculatorKeyBoardUIObejects.getMinusKey().tap();
	}

	public void clickMultiply() {
		calculatorKeyBoardUIObejects.getMultiplyKey().tap();
	}

	public void clickDevide() {
		calculatorKeyBoardUIObejects.getDevideKey().tap();
	}

	public void clickEquals() {
		calculatorKeyBoardUIObejects.getEqualyKey().tap();
	}

	public void clickAnOperator(String operator) {
		calculatorKeyBoardUIObejects.getOperatorKey(operator).tap();
	}
}
