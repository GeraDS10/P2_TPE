import java.util.ArrayList;
import java.util.Comparator;

public class GrupoAlumnos extends ElementoUniversidad{

    private ListaVinculadaOrdenada lista;
    public GrupoAlumnos(String nombre, Comparator comparador){
        super(nombre);
        lista = new ListaVinculadaOrdenada(comparador);

    }

    public void addElemento(ElementoUniversidad eu){
        lista.insertar(eu);
    }

    public ListaVinculadaOrdenada getLista(){
        return this.lista;
    }

    @Override
    public String toString() {
        return "GrupoAlumnos = " + this.getNombre();
    }

    @Override
    public int getCantidad() {
        int i = 0;
        int total = 0;
        if(this.lista.getPrimero() != null){
            Nodo iterador = this.lista.getPrimero();
            int cantidad = lista.getCantidadElementos();
            while(i < cantidad){
                ElementoUniversidad eu = (ElementoUniversidad) iterador.getObjeto();
                total += eu.getCantidad();
                iterador = iterador.getSiguiente();
                i++;
            }
            return total;
        }
        else {
            return total;
        }

    }
}
