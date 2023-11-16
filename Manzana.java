public class Manzana implements Cloneable {
    public Manzana() {}
    public Object clone() {
        return new Manzana();
    }
}