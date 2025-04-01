package Listas.Aula31032025;

public class ListaEstaticaCircular implements Listavel {
    //Variáveis de Instância
    private Object[] dados;
    private int ponteiroInicio;
    private int ponteiroFim;
    private int quantidade;

    //Construtores
    public ListaEstaticaCircular(){this(10);}

    public ListaEstaticaCircular(int tamanho){
        dados = new Object[tamanho];
        ponteiroInicio = 0;
        ponteiroFim = -1;
        quantidade = 0;
    }

    //Métodos Principais
    public int mapeamento(){

    }

    @Override
    public void anexar(Object dado){ //É igual ao Enfileirar, lógicamente
        if(!estaCheia()){
            ponteiroFim = avancar(ponteiroFim);
            dados[ponteiroFim] = dado;
            quantidade++;
        } else
            System.err.println("Lista cheia!");
    }

    @Override
    public void atualizar(int indice, Object dado){
        if(!estaVazia()){
            if(indice >= 0 && indice < quantidade){
                int posicaoFisica = mapeamento(indice);
                dados[posicaoFisica] = dado;
            } else {
                System.err.println("Index inválido");
            }
        } else {
            System.err.println("Lista vazia!");
        }
    }

    //Métodos Secundários
    @Override
    public boolean estaCheia(){
        return quantidade == dados.length;
    }

    @Override
    public boolean estaVazia(){
        return quantidade == 0;
    }

    private int avancar(int ponteiro) { //Para a fila circular dar a volta
		return (ponteiro+1)%dados.length;
	}

    @Override
    public String imprimir(){
        String retorno = "[";
        for(int i = ponteiroInicio; i < quantidade+ponteiroInicio; i++){
            if(i == quantidade+ponteiroInicio+1)
                retorno += dados[i%dados.length];
            else 
                retorno += dados[i%dados.length]+", ";
        }
        return retorno + "]";
    }
}