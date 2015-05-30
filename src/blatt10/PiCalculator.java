package blatt10;

// Berechnung von PI mit der Leibniz-Reihe

public class PiCalculator {
	
	// diese Methode berechnet einen Teilabschnitt der Leibniz-Reihe
	private static double calcSection(int from, int to)
	{
		double d = 0;		
		for (int i = from; i < to; i++) {	
			double summand = 1.0 / ((i*2.0)+1); 
			if (i%2==1)
				summand *= -1;
			d += summand;
		}
		return d;
	}

	// Berechnung der Reihe mit den ersten 2.147.483.647 Summanden 
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		double pi = calcSection(0, Integer.MAX_VALUE) * 4;
		System.out.println(pi);
		System.out.println(System.currentTimeMillis() - start);
	}
	

}
