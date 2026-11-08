public class EstrategiaMontoFijo extends Estrategia {
    private double montoFijo;

    public EstrategiaMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    public double calcularRendimiento(Elemento e) {
        return this.montoFijo;
    }

}
