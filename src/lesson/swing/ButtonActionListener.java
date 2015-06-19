package lesson.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Diese Klasse beinhaltet die Methode, die beim Klick auf den
// Button auszufuehren ist. Da im Rahmen der Ausfuehrung die
// Oberflaeche manipuliert werden muss, ist eine Referenz
// zur GUI-Instanz notwendig.

public class ButtonActionListener implements ActionListener {

	// Instanzvariable fuer die Referenz zur GUI
	FibGui gui;
	
	// Konstruktor, der sich die GUI-Instanz merkt.
	public ButtonActionListener(FibGui g) {
		gui = g;
	}
	
	// Klick-Methode. Kann auf die GUI zurueckgreifen
	public void actionPerformed(ActionEvent e) {
		
		// Lese Zahl aus Eingabefeld
		int value = gui.getFieldValue();
		
		// Berechne Fibonacci (parallel, damit GUI nicht einfriert)
		Thread thread = new Thread(new CalcFib(gui, value));
		thread.start();
		
		// Ausgabe (zunaechst nur loeschen, das Ergebnis wird
		// dann vom separaten Thread gesetzt)
		gui.setLabelValue(0);
						
	}

}
