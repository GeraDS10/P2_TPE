import java.util.Comparator;
import java.util.Iterator;

public class ListaVinculadaOrdenada implements Iterable<Nodo> {

    private Nodo primero = null;
    private Comparator comparador;

    public ListaVinculadaOrdenada(Comparator comparador){
        this.comparador = comparador;

    }

    public void setPrimero(Nodo n){
        this.primero = n;
    }

    public Nodo getPrimero(){
        return this.primero;
    }
    public void setComparador(Comparator c){
        this.comparador = c;
        ordenarLista();
    }
    private void ordenarLista() {
         int corrimientos = 0;
        if ((this.primero != null) && (this.primero.getSiguiente() != null)) {
            Nodo iterador = this.primero;
            Nodo siguiente = iterador.getSiguiente();
            Nodo anterior = null;
            if (this.comparador.compare(siguiente.getObjeto(), iterador.getObjeto()) < 0) {
                iterador.setSiguiente(siguiente.getSiguiente());
                siguiente.setSiguiente(iterador);
                this.setPrimero(siguiente);
                anterior = siguiente;
                siguiente = iterador.getSiguiente();
            }
            else{
                anterior = iterador;
                iterador = siguiente;
                siguiente = siguiente.getSiguiente();
            }
            while (siguiente != null){
                if(this.comparador.compare(siguiente.getObjeto(), iterador.getObjeto()) < 0){
                        anterior.setSiguiente(siguiente);
                        iterador.setSiguiente(siguiente.getSiguiente());
                        siguiente.setSiguiente(iterador);
                        anterior = siguiente;
                        siguiente = iterador.getSiguiente();
                        corrimientos++;
                    }
                    else {
                        anterior = iterador;
                        iterador = siguiente;
                        siguiente = siguiente.getSiguiente();
                    }
                }
                if(corrimientos != 0){
                    ordenarLista();
                }
        }
    }

    public int getCantidadElementos(){
        int cantidad = 0;
        if(this.primero != null){
            cantidad = 1;
            Nodo iterador = this.primero;
            while(iterador.getSiguiente() != null){
                cantidad++;
                iterador = iterador.getSiguiente();
            }
            return cantidad;
        }
        else {
            return cantidad;
        }

    }

    public int obtenerPosicion(Object o){
        int posicionActual = 0;
        Nodo iterador = this.primero;
        while ((iterador.getSiguiente() != null) && (!iterador.getObjeto().equals(o))){
            iterador = iterador.getSiguiente();
            posicionActual++;
        }
        if(iterador.getObjeto().equals(o)){
            return posicionActual;
        }
        else{
            return -1;
        }
    }
    public void eliminarPosicion(int pos){
        int posicionActual = 0;
        if((this.primero.getSiguiente() == null) && (pos == posicionActual)){
            this.primero = null;
        }
        else if(pos == posicionActual){
            this.primero = this.primero.getSiguiente();
        }
        else{
            Nodo anterior = this.primero;
            Nodo iterador = this.primero;
            while((pos != posicionActual) && (iterador.getSiguiente() != null)){
                anterior = iterador;
                iterador = iterador.getSiguiente();
                posicionActual++;
            }
            if(pos == posicionActual){
                System.out.println("Borrando");
                anterior.setSiguiente(iterador.getSiguiente());
            }
            else{
                System.out.println("No existe objeto en la posicion ingresada");
            }
        }


    }


    public void eliminarObjeto(Object o){
        if(this.primero.getObjeto().equals(o)){
            this.primero = this.primero.getSiguiente();
        }
        else{
            Nodo anterior = this.primero;
            Nodo iterador = this.primero;
            while (iterador.getSiguiente() != null){
                if(iterador.getObjeto().equals(o)){
                    anterior.setSiguiente(iterador.getSiguiente());
                }
                else{
                    anterior = iterador;
                }
                iterador = iterador.getSiguiente();
            }
        }

    }
    public void insertar(Object o){
        Nodo nuevo = new Nodo(o);
        if (this.primero == null){
            this.primero = nuevo;
        }else if(this.comparador.compare(this.primero.getObjeto(), nuevo.getObjeto()) > 0){
            nuevo.setSiguiente(this.primero);
            this.primero = nuevo;
        }
        else if(this.primero.getSiguiente() != null){
            Nodo anterior = this.primero;
            Nodo iterador = this.primero.getSiguiente();
            while ((iterador != null)&&(this.comparador.compare(iterador.getObjeto(), nuevo.getObjeto()) < 0)){
                anterior = iterador;
                iterador = iterador.getSiguiente();
            }
            if(iterador == null){
                anterior.setSiguiente(nuevo);
            }else{
                anterior.setSiguiente(nuevo);
                nuevo.setSiguiente(iterador);
            }
            //nuevo.setSiguiente(this.primero);
            //this.primero = nuevo;
        }
        else{
            this.primero.setSiguiente(nuevo);
        }
        //this.ordenarLista();
  }

  public Nodo obtenerEnPosicion(int pos){
        int posicionActual = 0;
        Nodo iterador = this.primero;
        while((pos != posicionActual)&&(iterador != null)){
            iterador = iterador.getSiguiente();
            posicionActual++;
        }
        return iterador;
  }

    @Override
    public Iterator<Nodo> iterator() {
        return new IteratorNodo();
    }

    private class IteratorNodo implements Iterator<Nodo>{
        private int pos = 0;
        @Override
        public boolean hasNext() {
            return pos < getCantidadElementos();
        }

        @Override
        public Nodo next() {
            pos++;
            return obtenerEnPosicion(pos-1);
        }
    }
}
