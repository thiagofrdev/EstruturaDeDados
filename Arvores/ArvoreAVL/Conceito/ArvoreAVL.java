package Arvores.ArvoreAVL.Conceito;

public class ArvoreAVL<T extends Comparable<T>> implements Arborizavel<T> {
    private NoTriplo<T> raiz;

    public ArvoreAVL(){
        raiz = null;
    }

    @Override
    public void inserir(T dado){
        NoTriplo<T> novoNo = new NoTriplo<>(); //Criação do novo nó que será inserido
        novoNo.setDado(dado); //Seta o dado passado como parâmetro no nó recém criado

        if (raiz == null) { //Verificação para primeiro nó (raiz)
            raiz = novoNo;
        } else { //Caso não seja o primeiro...
            NoTriplo<T> noAuxiliar = raiz; //Nó que vai em busca do lugar a ser inserido. Começa pela raiz
            while (noAuxiliar != null) {
                if (dado.compareTo(noAuxiliar.getDado()) < 0) { //Usa o compareTo para fazer aquela verificação se é maior ou menor. Se for menor, vai para esquerda. Se for igual ou maior, vai para a direita

                    //Verifica se é necesário ir para a esquerda ou se já é o lugar de inserir
                    if (noAuxiliar.getEsquerda() != null) { //Se tiver valor, segue na esquerda
                        noAuxiliar = noAuxiliar.getEsquerda();
                    } else { //Se não tiver valor, insere alí
                        noAuxiliar.setEsquerda(novoNo); //Insere o novoNo na esquerda do nó que foi comparado
                        novoNo.setGenitor(noAuxiliar); //Indica o nó comparado como pai do novoNo
                        break; //Sai do while
                    }
                } else {
                    //Verifica se é necesário ir para a direita ou se já é o lugar de inserir
                    if (noAuxiliar.getDireita() != null) { //Se tiver valor, segue na direita
                        noAuxiliar = noAuxiliar.getDireita();
                    } else { //Se não tiver valor, insere alí
                        noAuxiliar.setDireita(novoNo); //Insere o novoNo na direita do nó que foi comparado
                        novoNo.setGenitor(noAuxiliar); //Indica o nó comparado como pai do novoNo
                        break; //Sai do while
                    }
                }
            }

            //Falta implementar -> rebalancear(dado, novoNo);
        }
    }

    public T apagar(T dado){
        return null;
    }

    public void limpar(){
        raiz = null;
    } 


    public NoTriplo<T> pegarRaiz(){
        return raiz;
    }

    public boolean existe(T dado){
        return false;
    }

    public String imprimirPreOrdem(){
        return "imprimirPreOrdem";
    }

    public String imprimirEmOrdem(){
        return "imprimirEmOrdem";
    }

    public String imprimirPosOrdem(){
        return "imprimirPosOrdem";
    }
}
