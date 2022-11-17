public class ListaVinculadaOrdenada {

    private Nodo primero;
    private Ordenador ordenador;

    public ListaVinculadaOrdenada(){

    }
    public void setOrdenador(Ordenador o){
        this.ordenador = o;
        ordenarLista();
    }
    private void ordenarLista(){
        Nodo anterior = this.primero;
        Nodo iterador= this.primero;
        while(iterador.getSiguiente() != null){
            if(this.ordenador.esMenor(anterior, iterador)){
                anterior = iterador;
                iterador = iterador.getSiguiente();
            }
            else{
                anterior.setSiguiente(iterador.getSiguiente());
                //seguir desde aca
            }
        }
    }

    public void imprimirLista(){
        int posicionActual = 0;
        Nodo iterador = this.primero;
        while(iterador.getSiguiente() != null){
            System.out.println(iterador.getObjeto() + " en posicion " + posicionActual);
            iterador = iterador.getSiguiente();
            posicionActual++;
        }
    }

    public void obtenerPosicion(Object o){
        int posicionActual = 0;
        Nodo anterior = this.primero;
        Nodo iterador = this.primero;
        while ((iterador.getSiguiente() != null) && (!iterador.getObjeto().equals(o))){
            anterior = iterador;
            iterador = iterador.getSiguiente();
            posicionActual++;
        }
        if(iterador.getSiguiente() != null){
            System.out.println("No se encontro objeto");
        }
        else{
            System.out.println("Objeto encontrado en posicion: " + posicionActual);
        }
    }
    public void eliminarPosicion(int pos){
        int posicionActual = 0;
        Nodo anterior = this.primero;
        Nodo iterador = this.primero;
        while((pos != posicionActual) && (iterador.getSiguiente() != null)){
            anterior = iterador;
            iterador = iterador.getSiguiente();
        }
        if(iterador.getSiguiente() == null){
            System.out.println("No existe objeto en la posicion ingresada");
        }
        else{
            anterior.setSiguiente(iterador.getSiguiente());
        }
    }


    public void eliminarObjeto(Object o){
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
    public void insertarObjeto(Object o){
        Nodo nuevo = new Nodo(o);
        if (this.primero == null){
            this.primero = nuevo;
        }
        else {
            if(this.ordenador.esMenor(nuevo, this.primero)){
                nuevo.setSiguiente(primero);
                primero = nuevo;
            }
            else{
                Nodo atras = this.primero;
                Nodo adelante = this.primero;
                while((this.ordenador.esMenor(adelante.getObjeto(), o) && (adelante.getObjeto() != null))){
                    atras = adelante;
                    adelante = adelante.getSiguiente();
                }
                if( this.ordenador.esMenor(o, adelante.getObjeto())){
                    adelante.setSiguiente(nuevo);
                }
                else{
                    nuevo.setSiguiente(adelante);
                    atras.setSiguiente(nuevo);
                }
            }
        }
    }
}
