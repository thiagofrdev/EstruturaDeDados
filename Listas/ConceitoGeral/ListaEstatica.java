package Listas.ConceitoGeral;

public class ListaEstatica implements Lista{
    //Variáveis de instância
    Object[] lista;
    int qtdElementos;

    //Contrutores
    public ListaEstatica(){this(10);}

    public ListaEstatica(int tamanho){
        lista = new Object[tamanho];
        qtdElementos = 0;
    }

    //Métotos Principais
    @Override
    public void adicionar(Object elemento){
        if(!estaCheia()){
            lista[qtdElementos] = elemento;
            qtdElementos++;
        } else 
            System.out.println("A lista está cheia!");
    }

    public void adicionarPosicao(int indice, Object elemento){
        if(!estaCheia()){
            if(lista[indice] == null){
                lista[indice] = elemento;
                qtdElementos++;
            } else 
                System.out.println("Já existe um elemento nessa posição!");
        } else 
            System.out.println("A lista está cheia!");        
    }

    public Object remover(int indice){
        Object retorno = null;
        if(!estaVazia()){
            if(lista[indice] != null){
                retorno = lista[indice];
                while (indice < lista.length-1) {
                    lista[indice] = lista[indice++];
                    indice++;
                }
                qtdElementos--;
            } else 
                System.out.println("Não existe elemento nessa posição!");
        } else 
            System.out.println("A lista está vazia!");
        return retorno;
    }

    public Object obter(int indice){
        Object retorno = null;
        if(!estaVazia()){
            if(lista[indice] != null)
                retorno = lista[indice];
            else 
                System.out.println("Não existe elemento nessa posição!");
        } else 
            System.out.println("A lista está vazia!");
        return retorno;
    }
    
    //Métodos Secundários
    @Override
    public boolean estaVazia(){
        return qtdElementos == 0;
    }

    @Override
    public boolean estaCheia(){
        return qtdElementos == lista.length;
    }

    @Override
    public String imprimir(){
        String retorno = "[";
        for(int i = 0; i < qtdElementos; i++){
            if(i != qtdElementos-1) 
                retorno += lista[i] + ", ";
            else
                retorno += lista[i];
        }
        return retorno + "]";
    }
}