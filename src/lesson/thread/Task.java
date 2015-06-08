package lesson.thread;

// In dieser Klasse steckt der parallel auszufuehrende Code
// Sie muss das Interface Runnable implementieren, damit
// sie von einem Thread als Aufgabe akzeptiert wird.

public class Task implements Runnable {

	// Die Methode run enthaelt den Code.
	// Der Thread beendet sich, sobald diese Methode fertig 
	// ausgefuehrt ist.
	public void run() {
		long start = System.currentTimeMillis();
		while (System.currentTimeMillis() < start + 2000)
			; // Busy Wait fuer 2 Sekunden
		System.out.println("Task fertig!");
	}

}
