package Filas.ConceitoGeral;

public class TestesFilas {
    public static void main(String[] args) {
        Enfileiravel f1 = new FilaEstatica();

        System.out.println(f1.verificar());

        f1.enfileirar("casa");
        f1.enfileirar(2);
        f1.enfileirar(9.35);
        f1.enfileirar('A');
        System.out.println(f1.imprimir());
        System.out.println(f1.verificar());

        f1.desenfileirar();
        f1.enfileirar("Maria");
        f1.enfileirar(true);
        f1.desenfileirar();
        System.out.println(f1.imprimir());
        System.out.println(f1.verificar());

        System.out.println(f1.verificarFim());
        System.out.println(f1.verificarElemento(3));
    }
}
