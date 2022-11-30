import java.util.Comparator;

public class ComparadorMultiple implements Comparator{
    private Comparator c1, c2;

    public ComparadorMultiple(Comparator c1, Comparator c2){
        this.c1 = c1;
        this.c2 = c2;
    }
    @Override
    public int compare(Object o1, Object o2) {
        int resultado;
        resultado = c1.compare(o1,o2);
        if(resultado == 0){
            resultado = c2.compare(o1,o2);
        }
        return resultado;
    }
}
