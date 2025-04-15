package Listas.ExerciciosGPT.ListaEstatica.ListaDeCompras;

public class ListaDeCompras implements Listavel{
    //Variáveis de Instância
    Object[] lista;
    int qtdElementos;

    //Construtor
    public ListaDeCompras(){this(10);}

    public ListaDeCompras(int tamanho){
        lista = new Object[tamanho];
        qtdElementos = 0;
    }

    //Métodos Principais
    public boolean inserir(Object dado){
        boolean retorno = false;
        if(!estaCheia()){
            lista[qtdElementos] = dado;
            retorno = true;
            qtdElementos++;
        } else retorno = false;
        return retorno;
    }

    public Object remover(int posicao){
        return false;
    }

    public Object buscar(Object elemeto){
        return false;
    }

    public boolean atualizar(int posicao, Object dado){
        return false;
    }

    //Métodos Secundários
    public boolean estaCheia(){
        return qtdElementos == lista.length;
    }

    public boolean estaVazia(){
        return qtdElementos == 0;
    }

    public String imprimir(){
        String retorno = "[";
        for(int i = 0; i < qtdElementos; i++)
            retorno += lista[i] + ", ";
        retorno.substring(0, retorno.length()-2);
        return retorno += "]";
    }
}
