package Pilhas.PilhaDinamica.Base_PilhaDinamica;

public interface Stack<T> {
    //Métodos Principais
    void empilhar(T data);
    T desempilhar();
    T pegar();

    //Métodos Secundários
    boolean estaVazia();
    int tamanho();
}
