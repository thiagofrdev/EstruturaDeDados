package Arvores.ArvoreBinariaDeBusca.Conceito;

public class ArvoreBSTCLI {
    public static void main(String args[]){
        Arborizavel<Integer> arvore = new ArvoreBST<>();

        arvore.inserir(1);
        arvore.inserir(4);
        arvore.inserir(8);
        arvore.inserir(2);
        arvore.inserir(11);
        arvore.inserir(18);
        arvore.inserir(7);
        arvore.inserir(3);
        arvore.inserir(20);
        arvore.inserir(13);

        System.out.println("Pré Ordem: " + arvore.imprimirPreOrdem());
        System.out.println("Em Ordem: " + arvore.imprimirEmOrdem());
        System.out.println("Pós Ordem: " + arvore.imprimirPosOrdem());
    }    
}
