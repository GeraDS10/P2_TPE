import java.util.Comparator;

public class ComparadorEUString implements Comparator<ElementoUniversidad> {
    @Override
    public int compare(ElementoUniversidad o1, ElementoUniversidad o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
