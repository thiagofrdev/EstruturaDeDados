package Listas.ListaEncadeada.Conceito;

public class ListaEncadeada<T>{
    //Variáveis de instância
    private No<T> inicio;   //Ponteiro de referência para o próximo nó
    private int qtdElementos = 0;

    //Métodos Principais
    public void inserir(T dado){
        No<T> novoElemento = new No<T>(dado);   //Instanciação de um novo elemento
        novoElemento.setProximo(inicio);
        this.inicio = novoElemento;             //Faz o novo elemento criado ser o primeiro da Lista 
        qtdElementos++;
    }
}