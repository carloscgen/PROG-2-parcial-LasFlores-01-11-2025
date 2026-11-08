public class CondicionDescripcion extends Condicion {
    private String descripcion;

    public CondicionDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean cumple(Bono b) {
        return b.getDescripcion().contains(this.descripcion);
    }
}
