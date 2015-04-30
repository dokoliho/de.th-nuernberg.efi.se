package blatt4;

public class Uhrzeit {
	
	// Privates Attribut: Sekunden seit Mitternacht
	private int sekunden;
	
	// Konstruktor: H:M:S -> Sekunden seit Mitternacht
	public Uhrzeit(int h, int m, int s)
	{
		sekunden = (h*60+m)*60+s;
		bereinigen();
	}
	
	// Normierung des Attributs auf das Intervall eines Tages
	private void bereinigen()
	{
		int max = 60*60*24;
		// Funktioniert sowohl bei pos. als auch bei neg. Zahlen
		sekunden = ((sekunden % max) + max) % max; 
	}

	// Hinzufuegen bzw. Abziehen von Sekunden
	public void add(int s)
	{
		sekunden += s;
		bereinigen();
	}
	
	// Ausgabe: Sekunden seit Mitternacht -> HH:MM:SS
	public void ausgabe()
	{
		int stunden = this.sekunden / (60*60);
		int minuten = (this.sekunden - stunden * 60 * 60) / 60;
		int sekunden = this.sekunden - ((stunden * 60) + minuten) * 60; 
		System.out.printf("%02d:%02d:%02d%n", stunden, minuten, sekunden);
	}
	
	// Aufgabe 3
	public static void main(String[] args)
	{		
		Uhrzeit z = new Uhrzeit(23, 40, 3);
		z.add(98397);
		z.ausgabe();
		z.add(-86390);
		z.ausgabe();				
	}
	
}
