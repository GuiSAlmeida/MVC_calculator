package calculator;

public class CalculatorModel {
	
	private int calculationValue;
	
	public void sumNumbers(int firstNum, int secondNum) {
		calculationValue = firstNum + secondNum;
	}
	
	public int getCalculationValue() {
		return calculationValue;
	}

}
