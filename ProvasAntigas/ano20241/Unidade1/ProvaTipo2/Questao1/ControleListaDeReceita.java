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
    public boolean inserir(ListaDeReceita receita){return false;}
    public ListaDeReceita verificar(){return null;}
    public boolean atualizar(int posicao, ListaDeReceita receita){return false;}
    public ListaDeReceita remover(int posicao){return null;}
    
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
                retorno += lista[i] + " ";
            }
        }
        return retorno + "]";
    }
}
