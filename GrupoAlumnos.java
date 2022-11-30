import java.util.ArrayList;
import java.util.Comparator;

public class GrupoAlumnos extends ElementoUniversidad{

    private ArrayList<ElementoUniversidad> lista;
    public GrupoAlumnos(String nombre){
        super(nombre);
        lista = new ArrayList<ElementoUniversidad>();
    }
    public void addElemento(ElementoUniversidad eu){
        if(!this.lista.contains(eu)){
            lista.add(eu);
        }
    }

    public ArrayList getListaAlumos(){
        return new ArrayList<>(this.lista);
    }

    @Override
    public String toString() {
        return "Grupo: " + this.getNombre() + "\n  Cantidad alumnos = " + this.getCantidad();
    }

    @Override
    public int getCantidad() {
        int total = 0;
        for (ElementoUniversidad eu: this.lista
             ) {
            total += eu.getCantidad();
        }
        return total;
    }
}
