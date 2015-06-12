package lesson.swing;

import java.awt.*;
import javax.swing.*;

public class Gui implements Runnable {

	public void run() {

		JFrame window = new JFrame("Titelzeile des Fensters");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container content = window.getContentPane();

		JLabel label1 = new JLabel("NORTH", JLabel.CENTER);
		content.add(label1, BorderLayout.NORTH);

		JLabel label2 = new JLabel("SOUTH", JLabel.CENTER);
		content.add(label2, BorderLayout.SOUTH);

		JLabel label3 = new JLabel("EAST", JLabel.CENTER);
		content.add(label3, BorderLayout.EAST);

		JLabel label4 = new JLabel("WEST", JLabel.CENTER);
		content.add(label4, BorderLayout.WEST);

		JLabel label5 = new JLabel("CENTER", JLabel.CENTER);
		content.add(label5, BorderLayout.CENTER);

		window.setSize(300, 200);
		window.setVisible(true);
	}

}
