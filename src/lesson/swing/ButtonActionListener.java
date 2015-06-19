package lesson.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener {

	FibGui gui;
	
	public ButtonActionListener(FibGui g) {
		gui = g;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		// Lese Zahl aus Eingabefeld
		int value = gui.getFieldValue();
		
		// Berechne Fibonacci
		Thread thread = new Thread(new CalcFib(gui, value));
		thread.start();
		
		gui.setLabelValue(0);
						
	}

}
