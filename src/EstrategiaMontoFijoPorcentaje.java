public class EstrategiaMontoFijoPorcentaje extends Estrategia {
    private int montoFijo;
    private double porcentaje;

    public EstrategiaMontoFijoPorcentaje(int montoFijo, double porcentaje) {
        this.montoFijo = montoFijo;
        this.porcentaje = porcentaje;
    }

    public double calcularRendimiento(Bono b) {
        return this.montoFijo + ((b.getValorNominal() * porcentaje) / 100);
    }

}
