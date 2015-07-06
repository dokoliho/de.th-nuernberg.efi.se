package lesson.klausurvorbereitung;

public class SchrankfachRunner {

	final boolean OFFEN = true;
	final boolean ZU = !(OFFEN);
	boolean[] fach = new boolean[100];

	
	// Initialisierung
	SchrankfachRunner() {
		for (int i=0; i<100; i++)
			fach[i]=ZU;		
	}
	
	// Ein Durchlauf (Schrittweite num)
	private void doRun(int num) {
		for (int f = 0; f < 100; f+= num)
			fach[f] = !fach[f];
	}
	
	// Ausgabe der offenen Faecher
	private void printOpenDoors() {
		System.out.println("Offene Fächer:");
		for (int f= 0; f < 100; f++)
			if (fach[f] == OFFEN)
				System.out.println(f);
	}
	
	// Startpunkt des Programms
	public static void main(String[] args) {
		SchrankfachRunner runner = new SchrankfachRunner();
		for (int d = 1; d<=100; d++)
			runner.doRun(d);
		runner.printOpenDoors();
	}

}
