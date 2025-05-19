package Listas.ListaEncadeada.Conceito;

public interface Lista<T> {
    //Métodos Principais
    void adicionar(T dado);
    void adicionarNoFinal(T dado);
    void adicionarEmPosicao(int posicao, T dado);
    T buscarNo(T dado);
    T removerInicio();
    T removerDoFim();
    T removerDaPosicao(int posicao);

    //Métodos Secundários
    int tamanho();
    boolean estaVazia();
    String imprimir();
}