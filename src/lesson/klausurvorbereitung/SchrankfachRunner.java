package lesson.klausurvorbereitung;

public class SchrankfachRunner {

	final boolean OFFEN = true;
	final boolean ZU = !(OFFEN);
	boolean[] fach = new boolean[100];

	
	// Initialisierung
	SchrankfachRunner() {
		for (int i=1; i<=100; i++)
			fach[i-1]=ZU;		
	}
	
	// Ein Durchlauf (Schrittweite num)
	private void doRun(int num) {
		for (int f = num; f <= 100; f+= num)
			fach[f-1] = !fach[f-1];
	}
	
	// Ausgabe der offenen Faecher
	private void printOpenDoors() {
		int zaehler = 0;
		System.out.println("Offene Faecher:");
		for (int f= 1; f <= 100; f++)
			if (fach[f-1] == OFFEN) {
				System.out.print(f + " ");
				zaehler++;
			}
		System.out.println("Insgesamt:" + zaehler);		
	}
	
	// Startpunkt des Programms
	public static void main(String[] args) {
		SchrankfachRunner runner = new SchrankfachRunner();
		for (int d = 1; d<=100; d++)
			runner.doRun(d);
		runner.printOpenDoors();
	}

}
