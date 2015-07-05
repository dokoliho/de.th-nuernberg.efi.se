package blatt12;

import java.awt.*;

import javax.swing.*;

public class Gui implements Runnable {
	
	Calculator calculator = new Calculator();
	JTextField display;

	public void run() {

		JFrame window = new JFrame("Taschenrechner");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container content = window.getContentPane();

		display = new JTextField(Integer.toString(calculator.getDisplayValue()));
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setEditable(false);
		content.add(display, BorderLayout.NORTH);
		
		JPanel numbers = new JPanel();
		numbers.setLayout(new GridLayout(4, 3));
		for (int i = 1; i < 10; i++)
		{
			JButton button = new JButton(Integer.toString(i));
			button.addActionListener(new NumberButtonPressedActionListener(this, calculator, i) );
			numbers.add(button);			
		}
		numbers.add(new JLabel());
		JButton button0 = new JButton(Integer.toString(0));
		button0.addActionListener(new NumberButtonPressedActionListener(this, calculator, 0) );
		numbers.add(button0);			
		numbers.add(new JLabel());
		
		content.add(numbers, BorderLayout.EAST);
		JButton addButton = new JButton("+");
		addButton.addActionListener(new AddButtonPressedActionListener(this, calculator) );
		content.add(addButton, BorderLayout.WEST);		

		window.setSize(300, 200);
		window.setVisible(true);
	}

	public void updateDisplay() {
		display.setText(Integer.toString(calculator.getDisplayValue()));
	}

}
