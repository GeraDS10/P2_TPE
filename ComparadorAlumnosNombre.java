import java.util.Comparator;

public class ComparadorAlumnosNombre implements Comparator<Alumno> {

    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }

}
