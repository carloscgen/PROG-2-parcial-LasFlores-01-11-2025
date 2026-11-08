public class EstrategiaPorcentajeNominal extends Estrategia {
    private double porcentaje;

    public EstrategiaPorcentajeNominal(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double calcularRendimiento(Elemento e) {
        return (e.getValorNominal() * porcentaje) / 100;
    }
}
