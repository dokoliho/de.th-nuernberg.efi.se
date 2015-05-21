package blatt7;

// Die beiden an den Konstruktor uebergebenen Widerstaende werden 
// gespeichert. Bei bedarf wird der ohmsche Widerstand der 
// Schaltung errechnet.
// Ausserdem implementiert die Klasse das Interface Widerstand.
public class ParallelSchaltung implements Widerstand {
    
    private Widerstand r1;
    private Widerstand r2;
    
    public ParallelSchaltung(Widerstand r1, Widerstand r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public double getOhm() {
        return 1 / ( 1 / r1.getOhm() + 1 / r2.getOhm());
    }
    
}
