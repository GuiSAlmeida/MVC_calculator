package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	private CalculatorView view;
	private CalculatorModel model;
	
	public CalculatorController(CalculatorView view, CalculatorModel model) {
		this.view = view;
		this.model = model;
		
		this.view.addCalcListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int firstNum, secondNum = 0;
			
			try {
				
				firstNum = view.getFirstNumber();
				secondNum = view.getSecondNumber();
				
				model.sumNumbers(firstNum, secondNum);
				
				view.setCalcSolution(model.getCalculationValue());
				
			} catch(NumberFormatException e) {
				System.out.println(e);
				view.errorMessage("You need enter 2 integers");
			}
			
		}
		
	}
}
