package blatt06;

// Die nachfolgende Klasse bietet mehrere Implementierungen
// fuer die Berechnung der Fibonacci-Zahlen
public class Fibonacci {

	// Statische Variable fuer die Zeitmessung
	// Kann in statischen Methoden verwendet werden
	// Existiert aber nur einmal je Klasse (nicht je Instanz)
	static long tics = 0;
	
	// Ausgabe der Millisekunden, die seit dem letzten 
	// Aufruf vergangen sind
	static void printTimeSinceLast()
	{
		long newTics = System.currentTimeMillis();
		System.out.println(newTics-tics);
		tics = newTics;
	}
	
	// Rekursive Implementierung der Berechnung
	// (analog zur mathematischen Definition)
	static long recursive(long n) {
		if ((n == 1) || (n == 2)) return 1;
		return recursive(n-1) + recursive(n-2);
	}

	// Iterative Implementierung der Berechnung
	static long iterative(long n) {
		long f1 = 0;
		long f2 = 1;
		for (long i = 1; i <= n; i++) {
			long buffer = f1 + f2;
			f1 = f2;
			f2 = buffer;
		}
		return f1;
	}

	// Einstieg in die endrekursive Loesung
	static long recursive2(long n) {
		return endRecursive(1, 1, n);
	}

	// Endrekursive Implementierung der Berechnung
	static long endRecursive(long f1, long f2, long n) {
		if (n == 1) return f1;
		return endRecursive(f2, f1+f2, n-1);
	}

	// Austesten der verschiedenen Implementierungen
	public static void main(String[] args) {
		tics = System.currentTimeMillis();
		System.out.println("fib rekursiv:" + recursive(40));
		printTimeSinceLast();
		System.out.println("fib iterativ:" + iterative(40));
		printTimeSinceLast();
		System.out.println("fib endrekursiv:" + recursive2(40));
		printTimeSinceLast();
	}
	
	
}
