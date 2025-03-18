package Exe_PilhaDeChars;

//Intereface com os métodos básicos de uma Pilha
public interface PilhaDeChars{
    //Métodos principais
    void empilhar(char c);  //Adiciona um caractere (push). Não precisa de retorn
    char desempilhar();     //Remove o item do topo da pilha
    char espiar();          //Retorna os itens da pilha

    //Métodos auxiliares
    boolean estaCheia();    //Verifica se está cheia
    boolean estaVazia();    //Verifica se está vazia
    String imprimir();     //Imprime a pilha
}