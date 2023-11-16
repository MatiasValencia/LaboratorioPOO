import java.util.ArrayList;

public class Correa {
    ArrayList<Object> correa;
    public Correa() {
        this.correa = new ArrayList<Object>();
    }
    public ArrayList<Object> getCorrea() {
        return correa;
    }
    public void agregarCaja(Object caja) {
        correa.add(caja);
    }
    public void removerCaja(Object caja) {
        correa.remove(caja);
    }
}