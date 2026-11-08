import java.time.LocalDate;

public class BonoTemporal extends Elemento {
    private LocalDate inicio;
    private LocalDate fin;
    private Elemento bono;
    private static double porcentaje = 50;

    public BonoTemporal(String CUIT, LocalDate inicio, LocalDate fin, Elemento bono) {
        super(CUIT);
        this.inicio = inicio;
        this.fin = fin;
        this.bono = bono;
    }

    public static void setPorcentaje(double por) {
        porcentaje = por;
    }

    public int getEmision() {
        return bono.getEmision();
    }

    public double getValorNominal() {
        if (this.isVigente()) {
            return bono.getValorNominal();
        }
        return bono.getValorNominal() - (bono.getValorNominal() * porcentaje) / 100;
    }

    private boolean isVigente() {
        LocalDate hoy = LocalDate.now();

        return !hoy.isBefore(inicio) && !hoy.isAfter(fin);
    }

    public double calcular() {
        if(isVigente()){
            return bono.calcular();
        }
        return 0;
    }

}
