package Arvores.ArvoreBinariaDeBusca.Conceito;

public class ArvoreBST<T extends Comparable<T>> implements Arborizavel<T> {
    private NoTriplo<T> raiz;

    public ArvoreBST(){
        this.raiz = null;
    }

    public void inserir(T valor){
        System.out.println("Método inserir");
    }

    public T remover(T valor){
        System.out.println("Método remover");
        return null;
    }

    public boolean existe(T dado){
        System.out.println("Método existe");
        return false;
    }

    public void limpar(){
        System.out.println("Método limpar");
    }

    public NoTriplo<T> getRaiz(){
        return raiz;
    }

    public String imprimirPreOrdem(){
        if (raiz == null) {
            return "Árvore vazia";
        } else {
            return "Algum erro";
        }
    }

    public String imprimirEmOrdem(){
        if (raiz == null) {
            return "Árvore vazia";
        } else {
            return "Algum erro";
        }
    }

    public String imprimirPosOrdem(){
        if (raiz == null) {
            return "Árvore vazia";
        } else {
            return "Algum erro";
        }
    }
}
