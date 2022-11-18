import java.util.Comparator;

public class ComparadorAlumnosDni implements Comparator<Alumno> {

    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getDni() - o2.getDni();
    }
}
