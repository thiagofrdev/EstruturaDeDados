package Filas.FilaCircular;

public class FilaCircularMain {
    public static void main(String[] args) {
        Enfileiravel fila = new FilaCircular(5);

        fila.enfileirar("A");   //[A]
        fila.enfileirar("B");   //[A, B]
        fila.enfileirar("C");   //[A, B, C]
        fila.enfileirar("D");   //[A, B, C, D]
        fila.desenfileirar();        //[B, C, D]

        System.out.println(fila.verificar());
        System.out.println(fila.imprimir());

        fila.desenfileirar();        //[C, D]
        fila.enfileirar("E");   //[C, D, E]
        fila.enfileirar("F");   //[C, D, E, F]
        fila.enfileirar("G");   //[C, D, E, F, G]
        fila.enfileirar("H");   //FILA CHEIA!

        System.out.println(fila.verificar());
        System.out.println(fila.imprimir());

        fila.desenfileirar();        //[D, E, F, G]
        fila.enfileirar("I");   //[D, E, F, G, I]
        fila.desenfileirar();        //[E, F, G, I]
        fila.desenfileirar();        //[F, G, I]
        fila.enfileirar("J");   //[F, G, I, J]

        System.out.println(fila.verificar());
        System.out.println(fila.imprimir());

        fila.enfileirar("K");   //[F, G, I, J, K]
        fila.enfileirar("L");   //FILA CHEIA!

        System.out.println(fila.verificar());
        System.out.println(fila.imprimir());
    }
}