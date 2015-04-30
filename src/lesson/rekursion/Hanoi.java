package lesson.rekursion;

import support.Stack;

// Beispiel aus der Vorlesung: Die Tuerme von Hanoi
// Die Scheiben sind hier int-Werte. Eine groessere 
// Scheibe ist gleichzusetzen mit einem groesseren
// int-Wert
public class Hanoi { 

	// Das Spielfeld besteht aus drei Stapeln
	private Stack a = new Stack(5);
	private Stack b = new Stack(5);
	private Stack c = new Stack(5);

	// Konstruktor: Auf einen Stapel kommen
	// 5 Scheiben absteigender Groesse. Die 
	// anderen Stapel bleiben leer.
	public Hanoi() {
		a.push(5);
		a.push(4);
		a.push(3);
		a.push(2);
		a.push(1);
	}
	
	// Start des Umschichtungsvorgangs
	public void doIt() {
		print();		
		// 5 Scheiben von a nach b ueber c
		moveSizeFromToUsing(5, a, b, c); 
	}

	// Einfache Ausgabe des aktuellen Spielfelds
	public void print()
	{
		System.out.println(" A " + a.asString());
		System.out.println(" B " + b.asString());
		System.out.println(" C " + c.asString());
		System.out.println();
	}
	
	// Einfache Aufgabe: oberste Scheibe von einem
	// Stapel auf einen anderen Stapel legen.
	public void moveOnePiece(Stack from, Stack to) {
		int i = from.pop();
		to.push(i); 
		print();
	}
	
	// Die eigentliche rekursive Funktion wie in der
	// Vorlesung gezeigt.
	public void moveSizeFromToUsing(int size, 
			Stack from, 
			Stack to,
			Stack using) {
		if (size > 1)
			moveSizeFromToUsing(size - 1, from, using, to);
		moveOnePiece(from, to);
		if (size > 1)
			moveSizeFromToUsing(size - 1, using, to, from);
	}

	// Der Programmeinstieg
	public static void main(String[] args) {
		Hanoi hanoi = new Hanoi();
		hanoi.doIt();
	}

}
