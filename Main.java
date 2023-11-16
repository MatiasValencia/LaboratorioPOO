import java.util.ArrayList;
import java.util.Random;

public class Main {
    ArrayList<Naranja> naranja1 = new ArrayList<Naranja>();
    ArrayList<Durazno> durazno1 = new ArrayList<Durazno>();
    ArrayList<Manzana> manzana1 = new ArrayList<Manzana>();
    ArrayList<Pera> pera1 = new ArrayList<Pera>();
    ArrayList<Platano> platano1 = new ArrayList<Platano>();
    public static void main(String[] args) {
        Correa correa1 = new Correa();
        
        Random random = new Random();
        for (int i = 0; i <= 300; i++) {
            int numero = random.nextInt(5);
            if (numero == 0) {
                correa1.agregarCaja(new Naranja());
            }
            if (numero == 1) {
                correa1.agregarCaja(new Durazno());
            }
            if (numero == 2) {
                correa1.agregarCaja(new Manzana());
            }
            if (numero == 3) {
                correa1.agregarCaja(new Pera());
            }
            if (numero == 4) {
                correa1.agregarCaja(new Platano());
            }
        }
        System.out.println(correa1);
    }
}