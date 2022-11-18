public class Main {
    public static void main(String[] args) {

        ComparadorCantidad cc = new ComparadorCantidad();
        ComparadorEUString ceus = new ComparadorEUString();
        ListaVinculadaOrdenada universidad = new ListaVinculadaOrdenada(cc);


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
        GrupoAlumnos historia = new GrupoAlumnos("Historia", ceus);
        historia.addElemento(a1);
        historia.addElemento(a2);
        historia.addElemento(a3);
        historia.getLista().imprimirLista();
        //System.out.println("Total = " + historia.getCantidad());


        //Humanas - Libre
        Alumno a4 = new Alumno("Mora", "Diaz", 37124455);
        a4.addInteres("psicologia");
        a4.addInteres("Freud");

        GrupoAlumnos humanas = new GrupoAlumnos("Humanas", ceus);
        humanas.addElemento(historia);
        humanas.addElemento(a1);

        System.out.println("Cantidad alumnos Humanas = " + humanas.getCantidad());




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

        GrupoAlumnos exactas = new GrupoAlumnos("Exactas", ceus);
        exactas.addElemento(a5);
        exactas.addElemento(a6);

        System.out.println("Cantidad alumnos Exactas = " + exactas.getCantidad());


        //Libre
        Alumno a7 = new Alumno("John", "Doe", 1200000);
        a7.addInteres("intercambio");


        GrupoAlumnos unicen = new GrupoAlumnos("Unicen", cc);
        unicen.addElemento(exactas);
        unicen.addElemento(humanas);
        unicen.addElemento(a7);
        unicen.getLista().imprimirLista();

        universidad.insertar(unicen);
        System.out.println("Cantidad alumnos Unicen = " + unicen.getCantidad());

        // Segunda parte punto 4, inciso i)

        Alumno a8 = new Alumno("Bernardino", "Rivas", 30987654);
        a8.addInteres("matemáticas");
        Alumno a9 = new Alumno("Jose", "Paso", 33322112);
        a9.addInteres("problemas");
        Alumno a10 = new Alumno("Isaac", "Newton", 12343565);
        a10.addInteres("sucesiones");

        GrupoAlumnos losFibo = new GrupoAlumnos("LosFibo", ceus);
        losFibo.addElemento(a8);
        losFibo.addElemento(a9);
        losFibo.addElemento(a10);

        Alumno a11 = new Alumno("Juan", "Juarez", 33222444);
        a11.addInteres("sucesiones");
        a11.addInteres("algebra");
        Alumno a12 = new Alumno("Julio", "Cesar", 33222111);
        a12.addInteres("sucesiones");
        a12.addInteres("algebra");

        GrupoAlumnos matea2 = new GrupoAlumnos("Matea2", ceus);
        matea2.addElemento(a11);
        matea2.addElemento(a12);

        GrupoAlumnos olimpiadasMatematicas = new GrupoAlumnos("Olimpiadas Matematicas", ceus);
        olimpiadasMatematicas.addElemento(losFibo);
        olimpiadasMatematicas.addElemento(matea2);

        universidad.insertar(olimpiadasMatematicas);
        universidad.imprimirLista();









        /*
        Punto 4, inciso d) e) f) g)



        ComparadorString cs = new ComparadorString();
        ListaVinculadaOrdenada listaStrings = new ListaVinculadaOrdenada(cs);
        listaStrings.insertar("Facil");
        listaStrings.insertar("Es");
        listaStrings.insertar("Parcial");
        listaStrings.insertar("Prog 2");
        listaStrings.imprimirLista();
        System.out.println("Buscar posición parcial");
        listaStrings.obtenerPosicion("Parcial");
        System.out.println("Posición recuperatorio");
        listaStrings.obtenerPosicion("recuperatorio");
        ComparadorStringsReverse csr = new ComparadorStringsReverse();
        System.out.println("Invirtiendo orden");
        listaStrings.setComparador(csr);
        listaStrings.imprimirLista();

         */


        /*
        Punto 4, incisos a) b) c)

        ComparadorEnterosDescendente ced = new ComparadorEnterosDescendente();
        ListaVinculadaOrdenada listaNumeros = new ListaVinculadaOrdenada(ced);
        listaNumeros.insertar(10);
        listaNumeros.insertar(21);
        listaNumeros.insertar(1);
        listaNumeros.insertar(5);
        listaNumeros.insertar(11);
        listaNumeros.imprimirLista();
        System.out.println("Ordenando");
        listaNumeros.setComparador(ced);
        listaNumeros.imprimirLista();
        listaNumeros.eliminarPosicion(0);
        System.out.println("Borrando");
        listaNumeros.imprimirLista();
        listaNumeros.eliminarObjeto(5);
        System.out.println("Borrando 5");
        listaNumeros.imprimirLista();
        listaNumeros.eliminarObjeto(11);
        System.out.println("Borrando 11");
        listaNumeros.imprimirLista();

         */
    }
}
