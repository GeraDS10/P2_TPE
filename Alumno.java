import java.util.ArrayList;
import java.util.Comparator;

public class Alumno extends ElementoUniversidad{

    private String apellido;
    private int dni;
    private int edad;
    private ArrayList intereses;

    public Alumno(String nombre, String apellido, int dni) {
        super(nombre);
        this.apellido = apellido;
        this.dni = dni;
        intereses = new ArrayList();
    }

    public void addInteres(String interes){
        if(!this.intereses.contains(interes.toLowerCase())){
            this.intereses.add(interes.toLowerCase());
        }
    }

    public ArrayList getIntereses(){
        return new ArrayList<>(this.intereses);
    }

    @Override
    public int getCantidad() {
        return 1;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        try{
            Alumno otro = (Alumno) o;
            return (this.dni == ((Alumno) o).getDni());
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Alumno: " + this.getNombre() + '\'' +
                ", " + apellido + '\'' +
                ", " + dni +
                '}';
    }
}
