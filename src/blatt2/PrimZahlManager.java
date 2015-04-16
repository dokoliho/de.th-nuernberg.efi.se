package blatt2;

public class PrimZahlManager {
	
	// Aufgabe 2
	// Methode um zu testen, ob eine Zahl prim ist
	public boolean istPrim(int zahl)
	{
		for (int i=2; i*i<=zahl; i++)
			if (zahl%i==0)
				return false;
		return true;
	}
	
	// Aufgabe 3
	// Methode um die Primzahlen bis zu einer Grenze 
	// zu ermitteln und auszugeben
	public void druckePrimzahlenBis(int grenze)
	{
		for (int i=2; i<=grenze; i++)
			if (istPrim(i))
				System.out.println(i);
	}
		
	// Start der Ausführung
	public static void main(String[] args)
	{
		PrimZahlManager m = new PrimZahlManager();
		m.druckePrimzahlenBis(500);
	}	
	
	
}
