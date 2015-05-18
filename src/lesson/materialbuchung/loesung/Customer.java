package lesson.materialbuchung.loesung;

public class Customer extends Partner implements GoodsSink{

	// Instanzvariable, in der die gelieferte Menge aufsummiert wird
	private int delivered = 0;
	
	// Konstruktor mit Aufruf des Konstruktors der Oberklasse
	public Customer(String name, String city) {
		super(name, city);
	}

	// Jeder Materialempfang wird mitgezaehlt
	public void receive(int count) {
		delivered += count;
	}
	
	// Kundendaten mit Zugriff auf den String der Oberklasse
	public String toString()
	{
		return "Kunde:" + super.toString();
	}
	
	// Ausgabe der "Rechnung" inkl. Zuruecksetzen der Menge
	public void sendInvoice()
	{
		System.out.println(toString());
		System.out.println(delivered);
		delivered = 0;
	}

}
