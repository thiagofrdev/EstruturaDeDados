package Arvores.ArvoreBinariaDeBusca.Conceito;

public class ArvoreBST<T extends Comparable<T>> implements Arborizavel<T> {
    private NoTriplo<T> raiz;

    public ArvoreBST(){
        this.raiz = null;
    }

    public void inserir(T valor){
        NoTriplo<T> novoNo = new NoTriplo<>();
        novoNo.setDado(valor);

        //Confere se a árvore esstá vazia. Se estiver, cria o nó raiz
        if(raiz == null){
            raiz = novoNo;
        } else {
            NoTriplo<T> noAuxiliar = raiz; //Nó que vai passear pelos valores da árvore até achar o lugar onde o novo nó será inserido
            while (true) {
                int comparacao = valor.compareTo(noAuxiliar.getDado()); //Compara o valor a ser inserido com o dado que está em noAuxiliar
                if (comparacao <= 0) { //IR PARA ESQUERDA
                    if (noAuxiliar.getEsquerda() == null) { //Se a esquerda tiver vazia, adiciona
                        noAuxiliar.setEsquerda(novoNo);
                        novoNo.setGenitor(noAuxiliar);
                        break;
                    } //Se tiver valor na esquerda...
                    noAuxiliar = noAuxiliar.getEsquerda(); //...pega o valor da esquerda de noAuxiliar e reatribui a noAuxiliar para uma nova comparação
                } else {
                    //IR PARA DIREITA
                    if (noAuxiliar.getDireita() == null) { //Se a direita tiver vazia, adiciona
                        noAuxiliar.setDireita(novoNo);
                        novoNo.setGenitor(noAuxiliar);
                        break;
                    } //Se tiver valor na direita...
                    noAuxiliar = noAuxiliar.getDireita();//...pega o valor da direita de noAuxiliar e reatribui a noAuxiliar para uma nova comparação
                }
            }
        }
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
