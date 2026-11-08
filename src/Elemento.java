import java.util.List;

public abstract class Elemento {
    private String CUIT;

    public abstract int getEmision();

    public abstract double getValorNominal();

    public abstract double calcular();

    public abstract List<Elemento> buscar(Condicion c);

    public Elemento(String CUIT) {
        this.CUIT = CUIT;
    }

    public String getCUIT() {
        return this.CUIT;
    }
}
