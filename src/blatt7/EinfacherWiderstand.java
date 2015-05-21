package blatt7;

// Der ohmsche Widerstand muss in einer Instanzvariablen gespeichert 
// und bei Bedarf zurueckgegeben werden
// Ausserdem implementiert die Klasse das Interface Widerstand.
public class EinfacherWiderstand implements Widerstand {

    private double ohm = 0;
    
    public EinfacherWiderstand(double ohm) {
        this.ohm = ohm;
    }
    
    public double getOhm() {
        return ohm;
    }
    
}
