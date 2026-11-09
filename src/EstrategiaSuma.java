public class EstrategiaSuma extends Estrategia {
    private Estrategia e1;
    private Estrategia e2;

    public EstrategiaSuma(Estrategia e1, Estrategia e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double calcularRendimiento(Bono b) {
        return e1.calcularRendimiento(b) + e2.calcularRendimiento(b);
    }

}
