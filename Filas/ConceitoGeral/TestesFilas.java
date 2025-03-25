package Filas.ConceitoGeral;

public class TestesFilas {
    public static void main(String[] args) {
        Enfileiravel f1 = new FilaEstatica();

        f1.enfileirar("casa");
        f1.enfileirar(2);
        f1.enfileirar(9.35);
        f1.enfileirar('A');
        System.out.println(f1.imprimir());
    }
}
