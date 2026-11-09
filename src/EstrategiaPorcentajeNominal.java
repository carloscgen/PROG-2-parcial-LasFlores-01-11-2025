public class EstrategiaPorcentajeNominal extends Estrategia {
    private double porcentaje;

    public EstrategiaPorcentajeNominal(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double calcularRendimiento(Bono b) {
        return (b.getValorNominal() * porcentaje) / 100;
    }
}
