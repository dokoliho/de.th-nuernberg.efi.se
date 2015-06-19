package lesson.swing;

import java.awt.*;
import javax.swing.*;


// Die folgende Klasse enthaelt sowohl die main-Methode zum Start
// als auch die run-Methode zum Aufbau der Oberflaeche

public class FibGui implements Runnable {

	// Hier startet das Programm und gibt den Auftrag zum
	// Aufbau der Oberfläche an Swing
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new FibGui());

	}

	// Da das Eingabefeld und das Ausgabelabel nach dem
	// ersten Aufbau der Oberflaeche weiter benoetigt 
	// werden, werden die Variablen nicht lokal sondern
	// als Instanzvariablen vereinbart.
	private JTextField field = null;
	private JLabel label = null;
	
	// Methode zum Auslesen des eingegebenen Werts
	public int getFieldValue() {
		return Integer.parseInt(field.getText());
	}
	
	// Methode zum Setzen des Ausgabewerts
	public void setLabelValue(long value) {
		String s = "";
		if (value > 0) 
			s = Long.toString(value);
		label.setText(s);
	}
	
	// Initialer AUfbau der Oberfläche
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
