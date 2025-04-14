package Pilhas.Exe_Palindromo;

public interface Empilhavel {
    void empilhar(char caractere);
    String desempilhar();
    char espiar();

    boolean palindromo();
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}
