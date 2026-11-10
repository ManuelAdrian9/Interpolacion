package Estructuras_lineales.COLA;

public class ColaEstatica {
    private int [] arreglo;
    private int frente;
    private int fin;
    private int capacidad;

    public ColaEstatica(int tamano){
        this.capacidad = tamano;
        this.arreglo = new int[this.capacidad];
        this.frente = 0;
        this.fin = -1;
    }

    public void enqueue(int valor){
        if(fin == capacidad - 1) {
            System.out.println("Error: la cola esta llena");
        } else {
            fin++;
            arreglo[fin] = valor;
            System.out.println("Entro a la fila:" + valor);
        }
    }

    public void dequeue(){
        if (frente>fin){
            System.out.println("Error: la cola esta vacia.");
        } else {
            System.out.println("Atendidoy fuera:" + arreglo[frente]);
            frente++;
        }
    }

    public void mostrar(){
        if (frente > fin){
        System.out.print("La cola esta vacia");
        return;
    }
    System.out.println("Fila actual:");
    for (int i = frente; i <= fin; i++) {
        System.out.print(arreglo[i] + " ");
    }
    System.out.println();
}
}
