package Listas.ConceitoGeral;

public class ListaEstatica implements Lista{
    //Variáveis de instância
    Object[] lista;

    //Contrutores
    public ListaEstatica(){this(10);}

    public ListaEstatica(int tamanho){
        lista = new Object[tamanho];
    }

    //Métotos Principais
    @Override
    public void adicionar(Object elemento){

    }

    public void adicionarPosicao(int idice, Object elemento){
        
    }

    public Object remover(int indice){
        return null;
    }

    public Object obter(int indice){
        return null;
    }
    
    //Métodos Secundários
    @Override
    public boolean estaVazia(){
        return lista[0] == null;
    }

    @Override
    public boolean estaCheia(){
        return lista[lista.length-1] != null;
    }

    @Override
    public String imprimir(){
        String retorno = "[ ";
        for (int i = 0; i < lista.length; i++){
            if (lista[i+1] != null) 
                System.out.print(lista[i] + ", ");
            else
                System.out.print(lista[i]);
        }
        return retorno + " ]";
    }
}