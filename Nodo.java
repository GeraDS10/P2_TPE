public class Nodo {

    private Object objeto;
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
    public boolean sosMenor(Object o){

    }

    public Object getObjeto() {
        return this.objeto;
    }
}