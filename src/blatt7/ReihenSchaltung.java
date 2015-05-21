package blatt7;

// Die beiden an den Konstruktor uebergebenen Widerstaende werden 
// gespeichert. Bei bedarf wird der ohmsche Widerstand der 
// Schaltung errechnet.
// Ausserdem implementiert die Klasse das Interface Widerstand.
public class ReihenSchaltung implements Widerstand {
    
    private Widerstand first;
    private Widerstand second;
    
    
    public ReihenSchaltung(Widerstand r1, Widerstand r2)
    {
        first = r1;
        second = r2;
    }

    public double getOhm() {
        return first.getOhm() + second.getOhm();
    }
    
}
