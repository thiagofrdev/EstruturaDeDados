package Filas.FilaCircular;

public interface Enfileiravel {
    //Métodos principais
    void enfileirar(Object dado);   //Método que acrescenta um elemento ao final da Fila
    Object desenfileirar();         //Método que remove o primeiro elemento da Fila
    Object verificar();             //Método que retorna o prmeiro elemento da Fila

    //Métodos secundários
    int avancar(int ponteiro);      //Método que dá a volta no array
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}
