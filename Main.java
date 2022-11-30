public class Main {
    public static void main(String[] args) {

        /*

        //   Punto 4

        ComparadorCantidad cc = new ComparadorCantidad();
        ListaVinculadaOrdenada universidad = new ListaVinculadaOrdenada(cc);

        //Unicen

        //Humanas
        //Hmanas - Historia
        Alumno a1 = new Alumno("Flora", "Rivas", 34555111);
        a1.addInteres("historia");
        a1.addInteres("antigua");
        Alumno a2 = new Alumno("Martin", "Gomez", 34111222);
        a2.addInteres("romanos");
        a2.addInteres("egipcios");
        a2.addInteres("griegos");
        Alumno a3 = new Alumno("Roman", "Bazan", 32555111);
        a3.addInteres("argentina");
        GrupoAlumnos historia = new GrupoAlumnos("Historia");
        historia.addElemento(a1);
        historia.addElemento(a2);
        historia.addElemento(a3);

        //Humanas - Libre
        Alumno a4 = new Alumno("Mora", "Diaz", 37124455);
        a4.addInteres("psicologia");
        a4.addInteres("Freud");

        GrupoAlumnos humanas = new GrupoAlumnos("Humanas");
        humanas.addElemento(historia);
        humanas.addElemento(a1);

        // Exactas
        Alumno a5 = new Alumno("Federico", "Lopez", 35999888);
        a5.addInteres("redes");
        a5.addInteres("php");
        a5.addInteres("java");
        a5.addInteres("Python");
        Alumno a6 = new Alumno("Juana", "Garcia", 27123455);
        a6.addInteres("programacion");
        a6.addInteres("php");
        a6.addInteres("java");

        GrupoAlumnos exactas = new GrupoAlumnos("Exactas");
        exactas.addElemento(a5);
        exactas.addElemento(a6);

        //Libre
        Alumno a7 = new Alumno("John", "Doe", 1200000);
        a7.addInteres("intercambio");


        GrupoAlumnos unicen = new GrupoAlumnos("Unicen");
        unicen.addElemento(exactas);
        unicen.addElemento(humanas);
        unicen.addElemento(a7);

        universidad.insertar(unicen);

        //Olimpiadas Matematicas

        Alumno a8 = new Alumno("Bernardino", "Rivas", 30987654);
        a8.addInteres("matemáticas");
        Alumno a9 = new Alumno("Jose", "Paso", 33322112);
        a9.addInteres("problemas");
        Alumno a10 = new Alumno("Isaac", "Newton", 12343565);
        a10.addInteres("sucesiones");

        GrupoAlumnos losFibo = new GrupoAlumnos("LosFibo");
        losFibo.addElemento(a8);
        losFibo.addElemento(a9);
        losFibo.addElemento(a10);

        Alumno a11 = new Alumno("Juan", "Juarez", 33222444);
        a11.addInteres("sucesiones");
        a11.addInteres("algebra");
        Alumno a12 = new Alumno("Julio", "Cesar", 33222111);
        a12.addInteres("sucesiones");
        a12.addInteres("algebra");

        GrupoAlumnos matea2 = new GrupoAlumnos("Matea2");
        matea2.addElemento(a11);
        matea2.addElemento(a12);

        GrupoAlumnos olimpiadasMatematicas = new GrupoAlumnos("Olimpiadas Matematicas");
        olimpiadasMatematicas.addElemento(losFibo);
        olimpiadasMatematicas.addElemento(matea2);

        universidad.insertar(olimpiadasMatematicas);
        for (Nodo n: universidad
             ) {
            System.out.println(n.getObjeto());
        }

         */

         //----------------------------------------------------------------------------

        /*

        // Punto 4, inciso d) e) f) g)

        ComparadorString cs = new ComparadorString();
        ListaVinculadaOrdenada listaStrings = new ListaVinculadaOrdenada(cs);
        listaStrings.insertar("Facil");
        listaStrings.insertar("Es");
        listaStrings.insertar("Parcial");
        listaStrings.insertar("Prog 2");
        for (Nodo n: listaStrings
             ) {
            System.out.println(n.getObjeto());
        }
        int posicionParcial = listaStrings.obtenerPosicion("Parcial");
        if(posicionParcial != -1){
            System.out.println("Parcial se encuentra en la posicion = " + listaStrings.obtenerPosicion("Parcial"));
        }
        else {
            System.out.println("Parcial no se encuentra en la lista");
        }
        int posicionRecuperatorio = listaStrings.obtenerPosicion("Recuperatorio");
        if(posicionRecuperatorio != -1){
            System.out.println("Recuperatorio se encuentra en la posicion = " + listaStrings.obtenerPosicion("Recuperatorio"));
        }
        else {
            System.out.println("Recuperatorio no se encuentra en la lista");
        }

        ComparadorInverso ci = new ComparadorInverso(cs);
        listaStrings.setComparador(ci);
        System.out.println("Invirtiendo orden");
        for (Nodo n: listaStrings
        ) {
            System.out.println(n.getObjeto());
        }

         */

         //------------------------------------------------------------------------------------------------


        /*

        //Punto 4, incisos a) b) c)

        ComparadorInteger ci = new ComparadorInteger();
        ListaVinculadaOrdenada listaInteger = new ListaVinculadaOrdenada(ci);
        listaInteger.insertar(10);
        listaInteger.insertar(21);
        listaInteger.insertar(1);
        listaInteger.insertar(5);
        listaInteger.insertar(11);
        for (Nodo n:listaInteger
        ) {
            System.out.println(n.getObjeto());
        }
        listaInteger.eliminarPosicion(0);
        listaInteger.eliminarObjeto(5);
        listaInteger.eliminarObjeto(11);
        System.out.println("");
        for (Nodo n:listaInteger
        ) {
            System.out.println(n.getObjeto());
        }

         */
    }
}
