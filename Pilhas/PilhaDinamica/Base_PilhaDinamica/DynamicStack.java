package Pilhas.PilhaDinamica.Base_PilhaDinamica;

public class DynamicStack<T> implements Stack<T> {
    //Variáveis de instância
    private Node<T> top;    //Ponteiro para o Nó do topo
    private int size;       //Quandidade de nós na pilha

    //Métodos primários
    public void empilhar(T dado){
        Node<T> newNode = new Node<>(dado);
        newNode.next = top;     //Liga o novo nó ao atual topo (que será o anterior ao novo)
        top = newNode;          //Atualiza o topo
        size++;
    }

    //Métodos secundários
    public boolean estaVazia(){
        return size == 0;
    }

    public int size(){
        return size;
    }
}