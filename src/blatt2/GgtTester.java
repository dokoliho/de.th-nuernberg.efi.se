package blatt2;

import java.util.Scanner;

public class GgtTester {
	
	// Aufgabe 1
	// Methode zur Berechnung des ggT
	// Durch das Schluesselwort static wird angezeigt, dass
	// die Methode keinen Zugriff auf Instanzvariablen benoetigt.
	// Sie kann dann (wie in main gemacht) direkt aufgerufen 
	// werden, ohne dass vorher eine Instanz mit new erzeugt
	// werden muss
	public static long ggT(long a, long b)
	{
		if (a==0)
			return b;
		while (b != 0)
			if (a>b)
				a -= b;
			else 
				b -= a;
		return a;
	}
	
	// Einlesen von zwei Zahlen und Berechnen des ggT
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte geben Sie die erste Zahl ein: ");
		long zahl1 = scanner.nextLong();
		System.out.println("Bitte geben Sie die zweite Zahl ein: ");
		long zahl2 = scanner.nextLong();
		System.out.println(ggT(zahl1, zahl2));
		scanner.close();		
	}
}
