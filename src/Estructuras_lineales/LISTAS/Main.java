package Estructuras_lineales.LISTAS;

public class Main {
    public static void main(String[] args) {
        // Creamos nuestra lista simple
        ListaSimple lista = new ListaSimple();

        System.out.println("¿La lista está vacía? " + lista.estaVacia());

        // Probando inserciones
        lista.insertarAlFinal(10);
        lista.insertarAlFinal(20);
        lista.insertarAlFinal(30);
        lista.insertarAlInicio(5);

        // Debería mostrar: 5 -> 10 -> 20 -> 30 -> null
        lista.mostrar();

        // Probando búsqueda
        System.out.println("¿El 20 está en la lista? " + lista.buscar(20));
        System.out.println("¿El 99 está en la lista? " + lista.buscar(99));

        // Probando eliminación (recortando la lista)
        System.out.println("\nEliminando el número 20 (del centro)...");
        lista.eliminar(20);

        // Debería mostrar: 5 -> 10 -> 30 -> null (el 20 fue aislado y borrado)
        lista.mostrar();
    }
}
