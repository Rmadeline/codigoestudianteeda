/**
 * ============================================================================
 * UNIVERSIDAD ESPAM MFL - CARRERA DE COMPUTACION / SOFTWARE
 * Asignatura: Estructuras de Datos y Algoritmos (CDS-0202)
 * Docente:    Luiggi Alexander Jalca Saltos
 * Clase 02:   Taller Practico - Listas Enlazadas Simples en Java
 * ============================================================================
 * CLASE LISTA ENLAZADA SIMPLE (VERSION PARA EL ESTUDIANTE)
 * Estructura de datos dinamica lineal donde los elementos estan conectados
 * mediante punteros unidireccionales.
 */
public class ListaEnlazadaSimple<T> {

    // 1. Atributo principal: El primer nodo de la lista (Locomotora)
    private Nodo<T> cabeza;
    private int cantidad;

    // 2. Constructor: Al inicio, la lista esta vacia
    public ListaEnlazadaSimple() {
        this.cabeza = null;
        this.cantidad = 0;
    }

    // ------------------------------------------------------------------------
    // OPERACION 0: Verificar si la lista esta vacia - O(1)
    // ------------------------------------------------------------------------
    public boolean estaVacia() {
        return this.cabeza == null;
    }

    // ------------------------------------------------------------------------
    // OPERACION 1: Insercion al Inicio - O(1) [Tiempo Constante]
    // ------------------------------------------------------------------------
    public void insertarAlInicio(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato); // Paso 1: Nuevo nodo en Heap
        nuevo.siguiente = this.cabeza;    // Paso 2: Conectar al anterior primer nodo
        this.cabeza = nuevo;              // Paso 3: Actualizar cabeza
        this.cantidad++;
        System.out.println("  [+] Insertado al inicio: [" + dato + "] (O(1))");
    }

    // ------------------------------------------------------------------------
    // OPERACION 2: Insercion al Final - O(N) [Tiempo Lineal]
    // ------------------------------------------------------------------------
    public void insertarAlFinal(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);

        if (estaVacia()) {
            this.cabeza = nuevo;
            this.cantidad++;
            System.out.println("  [+] Insertado al final (primer elemento): [" + dato + "]");
            return;
        }

        Nodo<T> actual = this.cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente; // Avanzamos hasta el ultimo vagon
        }

        actual.siguiente = nuevo;
        this.cantidad++;
        System.out.println("  [+] Insertado al final: [" + dato + "] (O(N))");
    }

    // ------------------------------------------------------------------------
    // OPERACION 3: Recorrido e Impresion Visual de la Lista - O(N)
    // ------------------------------------------------------------------------
    public void mostrarLista() {
        if (estaVacia()) {
            System.out.println("  Lista vacia: (null)");
            return;
        }

        System.out.print("  Estado de la Lista: ");
        Nodo<T> actual = this.cabeza;

        while (actual != null) {
            System.out.print("[" + actual.dato + "] -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // ------------------------------------------------------------------------
    // TALLER PRACTICO AUTONOMO (A IMPLEMENTAR POR EL ESTUDIANTE)
    // ------------------------------------------------------------------------
    /**
     * OPERACION 4: Busqueda de un Elemento - Complejidad esperada: O(N)
     *
     * Consigna del Taller:
     * 1. Declarar un puntero auxiliar 'actual' que inicie apuntando a 'this.cabeza'.
     *    IMPORTANTE: Nunca muevas 'this.cabeza' directamente para no perder nodos.
     * 2. Recorrer la lista con un bucle 'while (actual != null)'.
     * 3. En cada iteracion, comparar 'actual.dato' con 'valorBuscado' usando .equals().
     * 4. Si hay coincidencia, emitir un mensaje con la posicion y retornar true.
     * 5. Si no coincide, avanzar el puntero auxiliar: 'actual = actual.siguiente'.
     * 6. Si el bucle termina y llega a null sin encontrarlo, retornar false.
     *
     * @param valorBuscado Dato que se desea localizar en la lista
     * @return true si el valor existe en algun nodo, false en caso contrario
     */
    public boolean buscar(T valorBuscado) {
        // ====================================================================
        // TODO: [ESTUDIANTE] Escribe aqui tu algoritmo de busqueda lineal.
        // Guiate con el diagrama de flujo proporcionado en el README.md.
        // ====================================================================

        System.out.println("  [AVISO] El metodo buscar() aun no ha sido implementado por el estudiante.");
        return false;
    }

    // ------------------------------------------------------------------------
    // OPERACION 5: Eliminacion al Inicio - O(1)
    // ------------------------------------------------------------------------
    public T eliminarAlInicio() {
        if (estaVacia()) {
            System.out.println("  [AVISO] No se puede eliminar: la lista esta vacia.");
            return null;
        }

        T datoEliminado = this.cabeza.dato;
        this.cabeza = this.cabeza.siguiente; // Desconectamos el primer nodo
        this.cantidad--;
        System.out.println("  [ELIMINADO] Dato retirado: [" + datoEliminado + "] (El Garbage Collector liberara su memoria Heap)");
        return datoEliminado;
    }

    // Retorna la cantidad total de nodos registrados
    public int getCantidad() {
        return this.cantidad;
    }
}
