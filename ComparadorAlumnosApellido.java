import java.util.Comparator;

public class ComparadorAlumnosApellido implements Comparator<Alumno> {
    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
}
