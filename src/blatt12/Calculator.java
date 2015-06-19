package blatt12;

// Die nachfolgende Klasse enthaelt die "Berechnungslogik" des
// Taschenrechners. Es ist eine bewaehrte Praxis, diese Art
// von Programmlogik *nicht* in der GUI-Klasse oder in den
// zugeordneten ActionListener zu implementieren.

public class Calculator {
	
	// Der Taschenrechner kann nur Addieren. 
	// Fuer die (bisher bereichnete) Summe
	// und die neu eingegebene Zahl benoetigen
	// wir zwei Variablen.
	private int sum = 0;
	private int invalue = 0;

	// Sobald eine Zahl angeklickt wird, muss die
	// Eingabe neu berechnet werden.
	public void numberEntered(int value) {
		invalue = invalue * 10 + value;
	}

	// Sobald der Plus-Button angeklickt wird, muss
	// die Addition stattfinden und die Eingabe
	// zurueckgesetzt werden
	public void addPressed() {
		sum += invalue;
		invalue = 0;
	}

	// Im Display des Taschenrechners steht normalerweise
	// die Summe. Sobald aber mit der Eingabe einer neuen
	// Zahl begonnen wurde, wird diese Zahl angezeigt.
	public int getDisplayValue() {
		if (invalue == 0) return sum;
		return invalue;
	}
}
