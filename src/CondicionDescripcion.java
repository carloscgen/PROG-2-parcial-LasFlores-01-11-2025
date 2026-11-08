public class CondicionDescripcion extends Condicion {
    private String descripcion;

    public CondicionDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean cumple(Bono b) {
        return this.descripcion.contains(b.getDescripcion());
    }
}
