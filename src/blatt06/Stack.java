package blatt06;


public class Stack {
	
	int[] data;
	int index;
	
	// Konstruktor, liefert einen leeren Stapel mit der Maximalhoehe l.
	Stack(int l) { 
		data = new int [l];
		index = 0;
	}

	// Falls der Stapel voll ist, wird false zurueckgemeldet, andernfalls 
	// wird die Zahl i hinzugefuegt und true zurueckgegeben.
	boolean push(int i) 
	{
		if (index >= data.length) return false;
		data[index++] = i;
		return true;
	}
	
	// Die zuletzt hinzugefuegte Zahl wird entfernt und zurueckgegeben. 
	// Ist keine Zahl auf dem Stapel, so ist der Rueckgabewert undefiniert.
	int pop() {
		if (empty()) return 0;
		return data[--index]; 
	}
	
	// Falls der Stapel leer ist, wird true zurueckgeliefert, sonst false.
	boolean empty() { 
		return (index == 0); 
	} 
	
}