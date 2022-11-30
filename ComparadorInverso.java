import java.util.Comparator;

public class ComparadorInverso implements Comparator{


    //IMPLEMENTAR
    private Comparator comparador;

    public ComparadorInverso(Comparator c){
        this.comparador = c;
    }


    @Override
    public int compare(Object o1, Object o2) {
        return - (this.comparador.compare(o1, o2));
    }
}
