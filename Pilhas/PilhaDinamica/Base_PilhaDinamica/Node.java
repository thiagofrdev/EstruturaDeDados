package Pilhas.PilhaDinamica.Base_PilhaDinamica;

public class Node<T> {
    //Variáveis de Instância
    T data;         //Dado a ser armazenado pelo nó
    Node<T> next;   //Próximo nó

    //Construtor
    Node(T data){
        this.data = data;
        this.next = null;   //Só vai receber outro Nó quando for colocado mais um na pilha
    }
}
