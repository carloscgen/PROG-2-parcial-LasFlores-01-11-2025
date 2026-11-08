public class Bono extends Elemento {
    private int emision;
    private String descripcion;
    private double valorNominal;
    private Estrategia e1;

    public Bono(String CUIT, int emision, String descripcion, double valorNominal, Estrategia e1) {
        super(CUIT);
        this.emision = emision;
        this.descripcion = descripcion;
        this.valorNominal = valorNominal;
        this.e1 = e1;
    }

    public double getValorNominal() {
        return this.valorNominal;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public int getEmision() {
        return this.emision;
    }

    public double calcular() {
        return e1.calcularRendimiento(this);
    }

}
