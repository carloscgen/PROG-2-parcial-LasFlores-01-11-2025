public class CondicionCUIT extends Condicion {
    private String CUIT;

    public CondicionCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    public boolean cumple(Bono b) {
        return b.getCUIT().equals(this.CUIT);
    }
}
