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
            apagarComDoisFilhosDireita(noAuxiliar);
            //apagarComDoisFilhosEsquerda(noAuxiliar);
        }

        return valor;
    }

    @Override
    public boolean existe(T dado){
        return (buscarDado(dado) != null);
    }

    @Override
    public void limpar(){
        raiz = null;
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
        return imprimir(imprimirPreOrdemRec(raiz));
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

    private void apagarComUmFilho(NoTriplo<T> no){ //Dica: o nó a ser removido será um nó meio (Esse nó tem um pai e um filho. O filho tem um avô e o avô tem um neto). Aqui vamos pensar na relação a aprtir do filho (por isso o "Avô")
        NoTriplo<T> avo = no.getGenitor(); //pega o pai no nó que será excluido (Avô do filho do pai)
        NoTriplo<T> neto = ((no.getEsquerda() != null) ? no.getEsquerda() : no.getDireita()); //Pega o filho do elemento que será excluido (Neto do pai do filho)

        if(avo == null){ //Se o pai do que será excluido for null, então o pai é a raiz
            raiz = neto; //Apagando a raiz, o seu único filho se torna a nova raiz
            raiz.setGenitor(null); //Seta o genitor da nova raiz como null
        } else { //Se o genitor do que será excluido existir...
            neto.setGenitor(avo); //O avô vira o pai no neto
            if (no.equals(avo.getEsquerda())) { //Se o nó removido foi o da esquerda... 
                avo.setEsquerda(neto); //...atribui o nó à esquerda
            } else { //Se o nó removido foi o da direita...
                avo.setDireita(neto); //...atribui o nó à direita
            }
        }
    }

    private void apagarComDoisFilhosDireita(NoTriplo<T> no){
        NoTriplo<T> menorDireita = enontraMenorDireita(no); //Encontra o nó que será substituido

        no.setDado(menorDireita.getDado()); //Seta o valor do nó encontrado no nó que será apagado (os dois nós ainda existem e agora tem o mesmo dado)

        if (menorDireita.getEsquerda() == null && menorDireita.getDireita() == null) { //Se o nó encontrado não tiver nenhum filho...
            apagarNoFolha(menorDireita);
        } else { //Se o nó encontrado tiver um filho...
            apagarComUmFilho(menorDireita);
        } //Se o nó encontrado tiver dois filhos, o código terá feito uma outra verificação e cairia em algum dos casos a cima
    }

    private void apagarComDoisFilhosEsquerda(NoTriplo<T> no){
        NoTriplo<T> maiorEsquerda = encontraMaiorEsquerda(no); //Nó que será colocado no lugar do que será apagado

        no.setDado(maiorEsquerda.getDado()); //O nó que será apagado tem o memso dado do que será substituido

        //Apagar no encontrado
        if (maiorEsquerda.getDireita() == null && maiorEsquerda.getEsquerda() == null) {
            apagarNoFolha(maiorEsquerda);
        } else {
            apagarComUmFilho(maiorEsquerda);
        }
    }

    //Retona o menor valor da subárvore direita do dado que vai ser apagado
    private NoTriplo<T> enontraMenorDireita(NoTriplo<T> no){
        NoTriplo<T> atual = no.getDireita(); //Nó's da direita do nó que será apagado
        while (atual.getEsquerda() != null) { //Desce pela esquerda até achar o último (o menor da direita)
            atual = atual.getEsquerda();
        }
        return atual;
    }

    //Retona o maior valor da subárvore esquerda do dado que vai ser apagado
    private NoTriplo<T> encontraMaiorEsquerda(NoTriplo<T> no){
        NoTriplo<T> atual = no.getEsquerda(); //Nó's da esquerda do nó que será apagado
        while (atual.getDireita() != null) { //Desce pela diretia até achar o ultimo (o maior da esquerda)
            atual = atual.getDireita();
        }
        return atual;
    }

    private String imprimirPreOrdemRec(NoTriplo<T> raizAtual) {
        if (raizAtual == null) {
            return ""; //Caso base para fim da recursão
        }
        return raizAtual.getDado() + " " +  //
                imprimirPreOrdemRec(raizAtual.getEsquerda()) +  " " +
                imprimirPreOrdemRec(raizAtual.getDireita());
    }

    private String imprimir(String texto){
        texto = texto.trim().replaceAll("\\s+", ", ");
        return "[" + texto + "]";
    }
}
