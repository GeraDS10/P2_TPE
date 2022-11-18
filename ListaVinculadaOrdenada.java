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
            //if (this.comparador.compare(iterador.getObjeto(), siguiente.getObjeto()) < 0) {
            if (this.comparador.compare(siguiente.getObjeto(), iterador.getObjeto()) < 0) {
                iterador.setSiguiente(siguiente.getSiguiente());
                siguiente.setSiguiente(iterador);
                this.setPrimero(siguiente);
                anterior = siguiente;
                siguiente = iterador.getSiguiente();
                //System.out.println("cambia el primero");
            }
            else{
                //System.out.println("No cambia");
                anterior = iterador;
                iterador = siguiente;
                siguiente = siguiente.getSiguiente();
            }
            while (siguiente != null){
                  //System.out.println(anterior.getObjeto());
                    //System.out.println(iterador.getObjeto());
                    //System.out.println(siguiente.getObjeto());
                    //if(this.comparador.compare(iterador.getObjeto(), siguiente.getObjeto()) < 0){
                if(this.comparador.compare(siguiente.getObjeto(), iterador.getObjeto()) < 0){
                  //      System.out.println("Corrimiento");
                        anterior.setSiguiente(siguiente);
                        iterador.setSiguiente(siguiente.getSiguiente());
                        siguiente.setSiguiente(iterador);
                        anterior = siguiente;
                        siguiente = iterador.getSiguiente();
                        corrimientos++;
                    }
                    else {
                     //   System.out.println("Avanzando");
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
        //Nodo anterior = this.primero;
        Nodo iterador = this.primero;
        while ((iterador.getSiguiente() != null) && (!iterador.getObjeto().equals(o))){
           // anterior = iterador;
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
            /*
            Nodo iterador = this.primero;
            while (iterador.getSiguiente() != null) {
                iterador = iterador.getSiguiente();
            }
            iterador.setSiguiente(nuevo);

             */
        }
        this.ordenarLista();
            /*
            if(this.comparador.comparar(o, this.primero.getObjeto()) <= 0){
                nuevo.setSiguiente(primero);
                primero = nuevo;
            }
            else if(this.primero.getSiguiente() != null){
                Nodo atras = this.primero;
                Nodo adelante = this.primero.getSiguiente();
                while((this.comparador.comparar(adelante.getObjeto(), o) <= 0) && (adelante.getSiguiente() != null)){
                    atras = adelante;
                    adelante = adelante.getSiguiente();
                }
                //if( this.ordenador.esMenor(o, adelante.getObjeto())){
                    //adelante.setSiguiente(nuevo);
                if(this.comparador.comparar(o, adelante.getObjeto()) <= 0){
                    atras.setSiguiente(nuevo);
                    nuevo.setSiguiente(adelante);
                }
                else{
                    adelante.setSiguiente(nuevo);
                }
            }
            else{
                this.primero.setSiguiente(nuevo);
            }
            */
       //}
  }
}
