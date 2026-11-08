public class CondicionAND extends Condicion {
    Condicion c1;
    Condicion c2;

    public CondicionAND(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Bono b) {
        return c1.cumple(b) && c2.cumple(b);
    }

}
