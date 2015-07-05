package blatt12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButtonPressedActionListener implements ActionListener {

	private Calculator calculator;
	private Gui gui;

	
	public AddButtonPressedActionListener(Gui g, Calculator c) {
		calculator = c;
		gui = g;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		calculator.addPressed();
		gui.updateDisplay();
	}

}
