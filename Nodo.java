public class Nodo {

    private Object objeto = null;
    private Nodo siguiente;

    public void insertarObjeto(Object o){
        this.objeto = o;
    }

    public void setSiguiente(Nodo sig){
        this.siguiente = sig;
    }

    public Nodo getSiguiente(){
        return this.siguiente;
    }


    public Object getObjeto() {
        return this.objeto;
    }
}
