public class ListaVinculadaOrdenada {

    private Nodo primero;


    public void insertarNodo(Object o){
        Nodo nuevo = new Nodo();
        nuevo.insertarObjeto(o);
        if (primero == null){
            primero = nuevo;
        }
        else {
            if(nuevo.sosMenor(primero.getObjeto())){
                nuevo.setSiguiente(primero);
                primero = nuevo;
            }
            else{

            }
        }
    }
}
