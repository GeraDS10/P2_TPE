import java.util.Comparator;

public class ListaVinculadaOrdenada {

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

    public void imprimirLista(){
        if(this.primero != null){
            int posicionActual = 0;
            Nodo iterador = this.primero;
            System.out.println(iterador.getObjeto() + " en posicion " + posicionActual);
            while(iterador.getSiguiente() != null){
                iterador = iterador.getSiguiente();
                posicionActual++;
                System.out.println(iterador.getObjeto() + " en posicion " + posicionActual);
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

    public void obtenerPosicion(Object o){
        int posicionActual = 0;
        Nodo iterador = this.primero;
        while ((iterador.getSiguiente() != null) && (!iterador.getObjeto().equals(o))){
            iterador = iterador.getSiguiente();
            posicionActual++;
        }
        if(iterador.getObjeto().equals(o)){
            System.out.println("Objeto encontrado en posicion: " + posicionActual);
        }
        else{
            System.out.println("Objeto no encontrado");
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
        }
        else{
            nuevo.setSiguiente(this.primero);
            this.primero = nuevo;
        }
        this.ordenarLista();
  }
}
