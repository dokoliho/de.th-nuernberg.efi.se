package blatt07;

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
