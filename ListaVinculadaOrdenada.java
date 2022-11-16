public class ListaVinculadaOrdenada {

    private Nodo primero;
    private Ordenador ordenador;

    public ListaVinculadaOrdenada(){

    }


    public void insertarObjeto(Object o){
        Nodo nuevo = new Nodo();
        nuevo.insertarObjeto(o);
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
