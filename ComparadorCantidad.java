import java.util.Comparator;

public class ComparadorCantidad implements Comparator<ElementoUniversidad> {
    @Override
    public int compare(ElementoUniversidad o1, ElementoUniversidad o2) {
        return o2.getCantidad() - o1.getCantidad();
    }
}
