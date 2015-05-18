package lesson.materialbuchung.loesung;

public class Vendor extends Partner implements GoodsSource{
	
	// Konstruktor mit Aufruf des Konstruktors der Oberklasse
	public Vendor(String name, String city) {
		super(name, city);
	}

	// Lieferanten koennen immer liefern
	public boolean deliver(int count) {
		return true;
	}

	// Lieferantendaten mit Zugriff auf den String der Oberklasse
	public String toString()
	{
		return "Lieferant:" + super.toString();
	}

}
