public class Nodo {

    private Object objeto;
    private Nodo siguiente;

    public Nodo(Object o){
        this.objeto = o;
        this.siguiente = null;
    }

    /*

    public void insertarObjeto(Object o){
        this.objeto = o;
    }

     */

    public void setSiguiente(Nodo sig){
        this.siguiente = sig;
    }

    public Nodo getSiguiente(){
        return this.siguiente;
    }


    public Object getObjeto() {
        return this.objeto;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "objeto=" + objeto +
                '}';
    }
}

