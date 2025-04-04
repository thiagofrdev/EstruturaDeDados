package Pilhas.Exe_InvertendoPalavra;

public interface Empilhavel {
    void empilhar(char caractere);
    String desempilhar();
    char espiar();

    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}
