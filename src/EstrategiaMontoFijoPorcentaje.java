public class EstrategiaMontoFijoPorcentaje extends Estrategia {
    private int montoFijo;
    private double porcentaje;

    public EstrategiaMontoFijoPorcentaje(int montoFijo, double porcentaje) {
        this.montoFijo = montoFijo;
        this.porcentaje = porcentaje;
    }

    public double calcularRendimiento(Elemento e) {
        return this.montoFijo + ((e.getValorNominal() * porcentaje) / 100);
    }

}
