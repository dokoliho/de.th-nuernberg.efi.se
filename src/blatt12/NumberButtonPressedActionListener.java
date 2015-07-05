package blatt12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberButtonPressedActionListener implements ActionListener {

	private int value = 0;
	private Calculator calculator;
	private CalcGui gui;

	
	public NumberButtonPressedActionListener(CalcGui g, Calculator c, int number) {
		value = number;
		calculator = c;
		gui = g;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		calculator.numberEntered(value);
		gui.updateDisplay();
	}

}
