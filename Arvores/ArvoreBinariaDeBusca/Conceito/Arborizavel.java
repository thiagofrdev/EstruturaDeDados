package Arvores.ArvoreBinariaDeBusca.Conceito;

public interface Arborizavel<T> {
    void inserir(T valor);
    T remover(T valor);
    boolean existe(T dado);
    void limpar();

    NoTriplo<T> getRaiz();
    NoTriplo<T> buscarDado();
    String imprimirPreOrdem();
    String imprimirEmOrdem();
    String imprimirPosOrdem();
}
