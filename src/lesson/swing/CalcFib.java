package lesson.swing;

// Diese Klasse liefert die Methode, die asynchron (=parallel) ausgefuehrt
// werden soll, damit die GUI nicht einfriert.

public class CalcFib implements Runnable {

	int value;  // Eingangsparameter der Berechnung
	FibGui gui; // GUI, die am Ende aktualisiert werden muss
	
	// Konstruktor (initialisiert Eingangsparameter und GUI)
	CalcFib(FibGui g, int v) {
		value = v;
		gui = g;
	}
	
	// Eigentliche parallele Berechnung und Oberflaechenaktualisierung
	public void run() {
		long fib = blatt06.Fibonacci.recursive(value);
		gui.setLabelValue(fib);
	}

}
