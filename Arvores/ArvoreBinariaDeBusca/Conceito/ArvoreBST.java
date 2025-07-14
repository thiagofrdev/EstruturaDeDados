package Arvores.ArvoreBinariaDeBusca.Conceito;

public class ArvoreBST<T extends Comparable<T>> implements Arborizavel<T> {
    private NoTriplo<T> raiz;

    public ArvoreBST(){
        this.raiz = null;
    }

    @Override
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

    @Override
    public T remover(T valor){
        NoTriplo<T> noAuxiliar = buscarDado(valor); //Variável que vai guardar o retorno de "buscarDado()", que vai ser o dado ou null

        if (noAuxiliar == null) { //Se não encontrar, retorna null
            return null;
        }

        //Caso encontre e o nó NÃO tenha filhos
        if (noAuxiliar.getEsquerda() == null && noAuxiliar.getDireita() == null) {
            apagarNoFolha(noAuxiliar);
        }

        //Caso encontre e tenha 1 filho
        if (noAuxiliar.getEsquerda() == null || noAuxiliar.getDireita() == null) {
            apagarComUmFilho(noAuxiliar);
        }

        //Caso encontre e tenha 2 filhos
        else {
            apagarComDoisFilhos(noAuxiliar);
        }

        return valor;
    }

    @Override
    public boolean existe(T dado){
        System.out.println("Método existe");
        return false;
    }

    @Override
    public void limpar(){
        System.out.println("Método limpar");
    }

    @Override
    public NoTriplo<T> getRaiz(){
        return raiz;
    }

    @Override
    public NoTriplo<T> buscarDado(T valor){
        NoTriplo<T> noAuxiliar = raiz; //Começa a busca pela raiz da árvore

        while (noAuxiliar != null) { //Enquanto tiver elementos, continuar buscando
            int comparacao = valor.compareTo(noAuxiliar.getDado()); //Faz a comparacao
            if (comparacao == 0) {  //Se forem iguais, retorna o nó noAuxiliar
                return noAuxiliar;
            } //Se não forem iguais... 
            noAuxiliar = (comparacao <= 0) ? noAuxiliar.getEsquerda() : noAuxiliar.getDireita(); //...vai descendo na árvore (aqui é o core da árvore BST)
        }

        return null;
    }

    @Override
    public String imprimirPreOrdem(){
        if (raiz == null) {
            return "Árvore vazia";
        } else {
            return "Algum erro";
        }
    }

    @Override
    public String imprimirEmOrdem(){
        if (raiz == null) {
            return "Árvore vazia";
        } else {
            return "Algum erro";
        }
    }

    @Override
    public String imprimirPosOrdem(){
        if (raiz == null) {
            return "Árvore vazia";
        } else {
            return "Algum erro";
        }
    }

    //Métodos Auxiliares
    private void apagarNoFolha(NoTriplo<T> no){
        NoTriplo noPai = no.getGenitor(); //Volta para o pai no nó selecionado
        
        if (noPai == null) { //Se for a raiz, o genitor vai ser null...
            raiz = null;    //...então ele só seta a raiz como null
        } else {
            if (noPai.getDireita().equals(no)) {
                noPai.setDireita(null);
            } else {
                noPai.setEsquerda(null);
            }
        }
    }
}
