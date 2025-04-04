package Pilhas.Exe_InvertendoPalavra;

public interface Empilhavel {
    void empilhar();
    char desempilhar();
    char espiar();

    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}
