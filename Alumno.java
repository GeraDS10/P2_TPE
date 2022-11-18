import java.util.ArrayList;
import java.util.Comparator;

public class Alumno extends ElementoUniversidad{

    private String apellido;
    private int dni;
    private ArrayList intereses;

    public Alumno(String nombre, String apellido, int dni) {
        super(nombre);
        this.apellido = apellido;
        this.dni = dni;
        intereses = new ArrayList();
    }

    public void addInteres(String interes){

        this.intereses.add(interes);
    }

    public ArrayList getIntereses(){
        return new ArrayList<>(this.intereses);
    }

    @Override
    public int getCantidad() {
        return 1;
    }

    /*
    public ListaVinculadaOrdenada getIntereses(){
        ListaVinculadaOrdenada nueva = new ListaVinculadaOrdenada();
        Nodo n = intereses.getPrimero();
        for (int i = 0; i < intereses.obtenerCantidadElementos(); i++){
            nueva.insertar(n.getObjeto());
            n = n.getSiguiente();
        }
        return nueva;
    }

     */


    public String getNombre() {
        return super.getNombre();
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + this.getNombre() + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                '}';
    }
}
