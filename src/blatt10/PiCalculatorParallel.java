package blatt10;

// Parallele Berechnung der Leibniz-Reihe
// Jede Instanz der nachfolgenden Klasse ist fuer einen Abschnitt
// der Reihe zustaendig und berechnet diesen autonom.


public class PiCalculatorParallel implements Runnable {

	// Die main-Methode definiert die Abschnitte, legt die Instanzen
	// fuer die Teil-Berechnungen an, startet diese in eigenen Threads
	// und sammelt am Ende die Ergebnisse wieder ein.

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
		PiCalculatorParallel calculator1 = new PiCalculatorParallel(0,
				Integer.MAX_VALUE / 4);
		PiCalculatorParallel calculator2 = new PiCalculatorParallel(
				Integer.MAX_VALUE / 4, Integer.MAX_VALUE / 2);
		PiCalculatorParallel calculator3 = new PiCalculatorParallel(
				Integer.MAX_VALUE / 2, Integer.MAX_VALUE / 4 * 3);
		PiCalculatorParallel calculator4 = new PiCalculatorParallel(
				Integer.MAX_VALUE / 4 * 3, Integer.MAX_VALUE);

		Thread worker1 = new Thread(calculator1);
		Thread worker2 = new Thread(calculator2);
		Thread worker3 = new Thread(calculator3);
		Thread worker4 = new Thread(calculator4);

		worker1.start();
		worker2.start();
		worker3.start();
		worker4.start();

		try {
			worker1.join();
			worker2.join();
			worker3.join();
			worker4.join();
		} catch (InterruptedException e) {
			System.out.println("Worker wurde unterbrochen!");
		}

		System.out.println((calculator1.result+calculator2.result+calculator3.result+calculator4.result)*4);
		System.out.println(System.currentTimeMillis() - start);
	}


	// Jede Instanz benoetigt die Grenzen innerhalb der Reihe 
	// (vom wievielten Element bis zum wievielten Element)
	private int start;
	private int stop;
	// Das Ergebnis der Berechnung wird in einer Instanzvariable abgelegt
	private double result = 0;


	// Konstruktor mit Initialisierung der Grenzen
	public PiCalculatorParallel(int from, int to) {
		start = from;
		stop = to;
	}

	// Berechnung 
	public void run() {		
		result = 0;

		for (int i = start; i < stop; i++) {
			double summand = 1.0 / ((i * 2.0) + 1);
			if (i % 2 == 1)
				summand *= -1;
			result += summand;
		}
	}

}
