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
    public boolean inserir(int posicao, Object dado){
        return false;
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
        return "false";
    }
}
