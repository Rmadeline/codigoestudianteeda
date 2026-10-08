/**
 * ============================================================================
 * UNIVERSIDAD ESPAM MFL - CARRERA DE COMPUTACION / SOFTWARE
 * Asignatura: Estructuras de Datos y Algoritmos (CDS-0202)
 * Docente:    Luiggi Alexander Jalca Saltos
 * Clase 02:   Taller Practico - Listas Enlazadas Simples en Java
 * ============================================================================
 * PROGRAMA PRINCIPAL DE PRUEBAS (VERSION PARA EL ESTUDIANTE)
 * Ejecucion en consola:
 *        javac src/*.java
 *        java -cp src Main
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=======================================================================");
        System.out.println("  ESPAM MFL • ESTRUCTURAS DE DATOS Y ALGORITMOS (CDS-0202)");
        System.out.println("  Docente: Luiggi Alexander Jalca Saltos");
        System.out.println("  Taller Practico: Implementacion de Listas Enlazadas Simples en Java");
        System.out.println("  [VERSION PARA EL ESTUDIANTE]");
        System.out.println("=======================================================================\n");

        // --------------------------------------------------------------------
        // PASO 1: Creacion de la Lista y Verificacion Inicial
        // --------------------------------------------------------------------
        System.out.println(">>> PASO 1: Creacion de la Lista y Verificacion Inicial");
        ListaEnlazadaSimple<Integer> listaEnteros = new ListaEnlazadaSimple<>();
        System.out.println("  ¿La lista esta vacia al inicio?: " + listaEnteros.estaVacia());
        listaEnteros.mostrarLista();
        System.out.println();

        // --------------------------------------------------------------------
        // PASO 2: Insercion al Inicio - Operacion O(1)
        // --------------------------------------------------------------------
        System.out.println(">>> PASO 2: Insercion al Inicio (Operacion O(1))");
        System.out.println("  Insertaremos: 30, luego 20, luego 10");
        listaEnteros.insertarAlInicio(30);
        listaEnteros.insertarAlInicio(20);
        listaEnteros.insertarAlInicio(10);
        System.out.println("  Observa el resultado: el ultimo insertado al inicio queda primero:");
        listaEnteros.mostrarLista();
        System.out.println();

        // --------------------------------------------------------------------
        // PASO 3: Insercion al Final - Operacion O(N)
        // --------------------------------------------------------------------
        System.out.println(">>> PASO 3: Insercion al Final (Operacion O(N))");
        System.out.println("  Insertaremos: 40, luego 50 al final de la cola del tren");
        listaEnteros.insertarAlFinal(40);
        listaEnteros.insertarAlFinal(50);
        listaEnteros.mostrarLista();
        System.out.println("  Total de nodos en la lista: " + listaEnteros.getCantidad());
        System.out.println();

        // --------------------------------------------------------------------
        // PASO 4: TALLER AUTONOMO - Busqueda Lineal de Elementos
        // --------------------------------------------------------------------
        System.out.println(">>> PASO 4: Busqueda Lineal de Elementos (Taller Autonomo)");
        System.out.println("  [INSTRUCCION]: Implementa el metodo buscar() en ListaEnlazadaSimple.java.");
        System.out.println("  Luego de implementarlo, descomenta las siguientes lineas de prueba:");
        System.out.println();

        /*
        // DESCOMENTAR CUANDO IMPLEMENTES EL METODO buscar():
        System.out.println("  1. Buscando el numero 30 (que si existe):");
        boolean encontrado30 = listaEnteros.buscar(30);
        System.out.println("     Resultado obtenido: " + encontrado30 + " | Esperado: true");

        System.out.println("\n  2. Buscando el numero 99 (que no existe):");
        boolean encontrado99 = listaEnteros.buscar(99);
        System.out.println("     Resultado obtenido: " + encontrado99 + " | Esperado: false");
        */
        listaEnteros.buscar(30); // Llamada actual al metodo pendiente
        System.out.println();

        // --------------------------------------------------------------------
        // PASO 5: Eliminacion al Inicio - Demostracion de Garbage Collector O(1)
        // --------------------------------------------------------------------
        System.out.println(">>> PASO 5: Eliminacion al Inicio (Demostracion de Garbage Collector)");
        listaEnteros.eliminarAlInicio();
        System.out.println("  Lista tras eliminar el nodo inicial:");
        listaEnteros.mostrarLista();
        System.out.println();

        // --------------------------------------------------------------------
        // PASO 6: Lista Enlazada con Cadenas (String) - Genericidad <T>
        // --------------------------------------------------------------------
        System.out.println(">>> PASO 6: Lista Enlazada con Cadenas (String)");
        ListaEnlazadaSimple<String> listaMaterias = new ListaEnlazadaSimple<>();
        listaMaterias.insertarAlFinal("POO");
        listaMaterias.insertarAlFinal("EDA");
        listaMaterias.insertarAlFinal("BasesDeDatos");
        listaMaterias.insertarAlInicio("Docente_Luiggi");
        listaMaterias.mostrarLista();
        System.out.println("\n>>> PASO 7: Prueba de Búsqueda");
 listaMaterias.buscar("EDA");
  listaMaterias.buscar("Matemáticas");
        System.out.println();

        System.out.println("=======================================================================");
        System.out.println("  [GUIA] Revisa el archivo README.md para la consigna del taller.");
        System.out.println("=======================================================================");
    }
}
