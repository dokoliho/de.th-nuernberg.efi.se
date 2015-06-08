package lesson.thread;

// Beispiel fuer das Starten eines parallel ausgefuehrten Threads

public class Start {

	public static void main(String[] args) throws InterruptedException {
		
		Task task = new Task(); // Die parallel auszufuehrende Aufgabe
		Thread thread = new Thread(task); // Ein Thread erhaelt diese Aufgabe
		thread.start(); // Der Thread wird gestartet
		thread.join(); // Ausfuehrung (von main) wartet auf Threadende
		System.out.println("main Ende!");
	
	}

}
