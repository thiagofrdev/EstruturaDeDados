public class ControleListaDeReceita implements Listavel{
    //Variáveis de Instância
    private ListaDeReceita[] lista;
    private int qtdItens;
    private int ponteiroFim;

    //Construtores
    public ControleListaDeReceita(){this(10);}

    public ControleListaDeReceita(int tamanho){
        lista = new ListaDeReceita[tamanho];
        qtdItens = 0;
        ponteiroFim = -1;
    }

    //Métodos Principais
    public boolean inserir(ListaDeReceita receita){
        boolean retorno = false;
        if(!estaCheia()){
            ponteiroFim++;
            lista[ponteiroFim] = receita;
            qtdItens++;
            retorno = true;
        } else System.out.println("Lista Cheia!");
        return retorno;
    }
    
    public ListaDeReceita verificar(){
        ListaDeReceita retorno = null;
        if(!estaVazia()){
            retorno = lista[ponteiroFim];
        } else System.out.println("Lista Vazia!");
        return retorno;
    }

    public boolean atualizar(int posicao, ListaDeReceita receita){
        boolean retorno = false;
        if(posicao >= 0 && posicao < lista.length){
            lista[posicao] = receita;
            if(lista[posicao] == null)
                qtdItens++;
            retorno = true;
        } else System.out.println("Posição inválida!");
        return retorno;
    }

    public ListaDeReceita remover(int posicao){
        ListaDeReceita retorno = null;
        if(!estaVazia()){
            if(posicao >= 0 && posicao < lista.length){
                retorno = lista[posicao];
                realocarItens(posicao);
                qtdItens--;
                ponteiroFim--;
            } else System.out.println("Posição inválida!");
        } else System.out.println("Lista Vazia!");
        return retorno;
    }
    
    //Métodos Secundários
    public boolean estaCheia(){
        return qtdItens == lista.length;
    }

    public boolean estaVazia(){
        return qtdItens == 0;
    }

    public String imprimir(){
        String retorno = "[";
        if(!estaVazia()){
            for(int i = 0; i < qtdItens; i++){
                if(i+1 != qtdItens)
                    retorno += lista[i].getNomeReceita() + ", ";
                else
                    retorno += lista[i].getNomeReceita();
            }
        }
        return retorno + "]";
    }

    //Métodos Auxiliares
    public void realocarItens(int posicao){
        for(int i = posicao; i < qtdItens-1; i++){
            lista[i] = lista[i+1];
        }
        if (qtdItens > 0) {
            lista[qtdItens - 1] = null;
        }
    }
}