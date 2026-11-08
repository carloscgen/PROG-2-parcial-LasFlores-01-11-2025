public class EstrategiaSuma extends Estrategia {
    private Estrategia e1;
    private Estrategia e2;

    public EstrategiaSuma(Estrategia e1, Estrategia e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double calcularRendimiento(Elemento e) {
        return e1.calcularRendimiento(e) + e2.calcularRendimiento(e);
    }

}
