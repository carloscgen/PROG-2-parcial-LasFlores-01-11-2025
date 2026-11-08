import java.util.ArrayList;
import java.util.List;

public class BonoConglomerado extends Elemento {
    private List<Elemento> elementos;

    public BonoConglomerado(String CUIT) {
        super(CUIT);
        this.elementos = new ArrayList<>();
    }

    public List<Elemento> getElementos() {
        return new ArrayList<>(this.elementos);
    }

    public int getEmision() {
        if (elementos.isEmpty()) {
            return 0;
        } else {
            int emisionInicial = elementos.get(0).getEmision();
            for (Elemento el : elementos) {
                int emisionElemento = el.getEmision();
                if (emisionElemento > emisionInicial) {
                    emisionInicial = emisionElemento;
                }
            }
            return emisionInicial;
        }
    }

    public double getValorNominal() {
        double res = 0;
        if (elementos.isEmpty()) {
            return 0;
        }
        for (Elemento elemento : elementos) {
            res += elemento.getValorNominal();
        }
        return res;
    }

    public double calcular() {
        double res = 0;
        for (Elemento elemento : elementos) {
            res += elemento.calcular();
        }
        return res;
    }

    public void agregarElemento(Elemento e) {
        this.elementos.add(e);
    }

    public List<Elemento> buscar(Condicion c) {
        List<Elemento> res = new ArrayList<>();

        for (Elemento elemento : elementos) {
            res.addAll(elemento.buscar(c));
        }

        return res;
    }
}
