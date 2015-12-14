package blatt07;

public class EinfacherWiderstand implements Widerstand {

    private double ohm = 0;
    
    public EinfacherWiderstand(double ohm) {
        this.ohm = ohm;
    }
    
    public double getOhm() {
        return ohm;
    }
    
}
