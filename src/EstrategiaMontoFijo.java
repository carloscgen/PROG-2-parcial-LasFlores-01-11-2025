public class EstrategiaMontoFijo extends Estrategia {
    private double montoFijo;

    public EstrategiaMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    public double calcularRendimiento(Bono b) {
        return this.montoFijo;
    }

}
