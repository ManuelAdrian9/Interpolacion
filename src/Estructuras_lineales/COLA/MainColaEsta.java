package Estructuras_lineales.COLA;

public class MainColaEsta {
    public static void main(String[] args) {

        ColaEstatica miCola = new ColaEstatica( 3);


        miCola.enqueue(10);
        miCola.enqueue(20);
        miCola.enqueue(30);


        miCola.mostrar();

        miCola.dequeue();

        miCola.mostrar();
    }
}

