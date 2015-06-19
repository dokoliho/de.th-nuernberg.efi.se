package lesson.swing;

import java.awt.*;
import javax.swing.*;

public class FibGui implements Runnable {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new FibGui());

	}

	private JTextField field = null;
	private JLabel label = null;
	
	public int getFieldValue() {
		return Integer.parseInt(field.getText());
	}
	
	public void setLabelValue(long value) {
		label.setText(Long.toString(value));
	}
	
	public void run() {
		
		JFrame window = new JFrame("Fibonacci Rechner");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container content = window.getContentPane();
		
		field = new JTextField("1");
		field.setHorizontalAlignment(JTextField.RIGHT);
		content.add(field, BorderLayout.NORTH);
		
		label = new JLabel("");
		content.add(label, BorderLayout.CENTER);
		
		JButton button = new JButton("Rechne!");
		button.addActionListener(new ButtonActionListener(this));
		content.add(button, BorderLayout.SOUTH);
		
		window.setSize(300, 300);
		window.setVisible(true);
	}

}
