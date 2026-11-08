public class CondicionValorNominal extends Condicion{
    private double valor;

    public CondicionValorNominal(double valor) {
        this.valor = valor;
    }

    public boolean cumple(Bono b) {
        return b.getValorNominal() > this.valor;
    }
}
