package Listas.ListaEncadeada.Conceito;

public class No<T> {
    //Variáveis de instância
    private T dado;         //Dado a ser guardado pelo nó
    private No<T> proximo;  //Referência ao próximo nó

    //Construtores
    public No(T dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public No(T dado, No<T> proximo) {
        this.dado = dado;
        this.proximo = null;
    }

    //Métodos Getters e Setters
    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getProximo() {
        return proximo;
    }
    
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    //Método toString
    @Override
    public String toString() {
        return "No [dado=" + dado + ", proximo=" + proximo + "]";
    }
}