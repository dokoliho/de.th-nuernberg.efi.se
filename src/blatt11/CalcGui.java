package blatt11;

import java.awt.*;

import javax.swing.*;

// Oberflaeche fuer einen einfachen Taschenrechner

public class CalcGui implements Runnable {
	
	// Zum Programmstart wird eine neue Oberflaeche erzeugt.
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new CalcGui());
	}

	// Aufbau der Oberflaeche
	public void run() {

		JFrame window = new JFrame("Taschenrechner");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container content = window.getContentPane();

		// Display.Feld
		JTextField display = new JTextField("0");
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setEditable(false);
		content.add(display, BorderLayout.NORTH);
		
		// Zahlenfeld
		JPanel numbers = new JPanel();
		numbers.setLayout(new GridLayout(4, 3));
		for (int i = 1; i < 10; i++)
		{
			JButton button = new JButton(Integer.toString(i));
			numbers.add(button);			
		}
		numbers.add(new JLabel());
		JButton button0 = new JButton(Integer.toString(0));
		numbers.add(button0);			
		numbers.add(new JLabel());
		content.add(numbers, BorderLayout.CENTER);
		
		// Plus-Button
		content.add(new JButton("+"), BorderLayout.WEST);		

		window.setSize(300, 200);
		window.setVisible(true);
	}


}