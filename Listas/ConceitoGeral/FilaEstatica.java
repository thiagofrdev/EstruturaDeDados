package Listas.ConceitoGeral;

public interface FilaEstatica {
    //Métodos Principais
    void adicionar(Object elemento);                        //Adiciona um elemento no final da Lista
    void adicionarPosicao(int idice, Object elemento);      //Adiciona um elemento num indice específico
    Object remover(int indice);                             //Remove um elemento de um indice específico
    Object obter(int indice);                              //Busca um elemento de um indice específico
    
    //Métodos Secundários
    boolean estaVazia();        //Verifica se a Lista está vazia
    boolean estaCheia();        //Verifica se a Lista está cheia
    String imprimir();          //Imprime a Lista
}