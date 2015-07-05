package blatt12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButtonPressedActionListener implements ActionListener {

	private Calculator calculator;
	private CalcGui gui;

	
	public AddButtonPressedActionListener(CalcGui g, Calculator c) {
		calculator = c;
		gui = g;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		calculator.addPressed();
		gui.updateDisplay();
	}

}
