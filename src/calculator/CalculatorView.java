package calculator;

import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame {
	
	private JTextField firstNumber = new JTextField(10);
	private JLabel addLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton btnCalc = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	public CalculatorView() {
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		calcPanel.add(firstNumber);
		calcPanel.add(addLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(btnCalc);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
	}
	
	public int getFirstNumber() {
		return Integer.parseInt(firstNumber.getText());
	}
	
	public int getSecondNumber() {
		return Integer.parseInt(secondNumber.getText());
	}
	
	public int getCalcSolution() {
		return Integer.parseInt(calcSolution.getText());
	}
	
	public void setCalcSolution(int solution) {
		calcSolution.setText(Integer.toString(solution));
	}
	
	public void addCalcListener(ActionListener listenBtnCalc) {
		btnCalc.addActionListener(listenBtnCalc);
	}
	
	public void errorMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}
}
