package Listas.ConceitoGeral;

public class ListaEstaticaMain {
    public static void main(String[] args) {
        Lista lista = new ListaEstatica(5);

        lista.adicionar(1);
        lista.adicionar("Casa");
        lista.adicionar(9.37);
        lista.adicionar('A');

        System.out.println(lista.imprimir());
    }
}