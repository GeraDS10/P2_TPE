public abstract class ElementoUniversidad {
    private String nombre;

    public ElementoUniversidad(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public abstract int getCantidad();
}
