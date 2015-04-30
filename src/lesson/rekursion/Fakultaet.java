package lesson.rekursion;

public class Fakultaet {
	
	// Iterative Loesung
	public long fakultaet_iterativ(long n) {
		long produkt = 1;
		for (long k = 1; k <= n; k++)
			produkt *= k;
		return produkt;
	}

	
	// Rekursive Loesung
	public long fakultaet_rekursiv(long n) {
		if (n == 0) return 1;
		return n * fakultaet_rekursiv(n-1);
	}

}
