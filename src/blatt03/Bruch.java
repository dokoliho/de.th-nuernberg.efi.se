package blatt03;


public class Bruch {
	
	long zaehler;
	long nenner;
	
	// Main-Methode zum Ausprobieren der Loesungen
	public static void main(String[] args) {
		
		// Aufgabe 1+2
		Bruch b = new Bruch();
		b.zaehler = 12;
		b.nenner = 10;
		b.output();
		
		// Aufgabe 3
		Bruch b1 = new Bruch(); b1.zaehler = 0; b1.nenner = 10;
        Bruch b2 = new Bruch(); b2.zaehler = 1; b2.nenner = 10;
        for (int i = 1; i <= 10; i++) 
        	b1.addiere(b2);
        b1.output();
	}
	
	
	// Ausgabe des Bruchs als gebrochen rationale Zahl
	// Der ganzzahlige Anteil bzw. der Restbruch werden
	// nur ausgegeben, wenn notwendig.
	
	void output() {
		
		kuerzen(); // Ergaenzt in Aufgabe 2

		long ganzer_anteil = zaehler / nenner;
		long rest_anteil = zaehler % nenner;
		
		if (ganzer_anteil != 0)
			System.out.print(ganzer_anteil + " ");
		
		if (rest_anteil != 0)
			System.out.print(rest_anteil + "/" + nenner);
		
		System.out.println(); 
	}
	
	
	// Die folgende Methode aendert den Wert des Bruchs nicht,
	// dividiert aber zaehler und nenner durch den ggT
	// Fuer die ggT-Berechnung wird die in Blatt 2 erstellte
	// Klasse verwendet.
	
	void kuerzen() {
		long ggt = blatt02.GgtTester.ggT(zaehler, nenner);
		nenner /= ggt;
		zaehler /= ggt;
	}
	
	
	// Zum aktuellen Bruchobjekt wird ein als Parameter
	// uebergebener Bruch addiert. Im Allgemeinen kann
	// man nicht davon ausgehen, dass die Nenner gleich
	// sind, daher werden beide Brueche erweitert und
	// das Ergebnis wieder gekuerzt.
	
	void addiere(Bruch b) {
		zaehler = zaehler * b.nenner + b.zaehler * nenner;
		nenner = nenner * b.nenner;
		kuerzen();
	}
}
