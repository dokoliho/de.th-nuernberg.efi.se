package blatt6;

public class Stack {
	
	// Konstruktor, liefert einen leeren Stapel mit der Maximalhoehe l.
	Stack(int l) {}

	// Falls der Stapel voll ist, wird false zurueckgemeldet, andernfalls 
	// wird die Zahl i hinzugefuegt und true zurueckgegeben.
	boolean push(int i) { return false; }
	
	// Die zuletzt hinzugefuegte Zahl wird entfernt und zurueckgegeben. 
	// Ist keine Zahl auf dem Stapel, so ist der Rueckgabewert undefiniert.
	int pop() { return 0; }
	
	// Falls der Stapel leer ist, wird true zurueckgeliefert, sonst false.
	boolean empty() { return false; } 
	
}