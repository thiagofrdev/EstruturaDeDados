package Pilhas.Exe_InvertendoPalavra;

public class InvetendoPalavra implements Empilhavel {
    //variáveis de Instância
    private char[] pilha;
    private int topo;

    //Construtores
    public InvetendoPalavra(){this(10);}

    public InvetendoPalavra(int tamanho){
        pilha = new char[tamanho];
        topo = -1;
    }

    //Métodos Primários
    public void empilhar(char caractere){
        if(!estaCheia()){
            topo++;
            pilha[topo] = caractere;
        } else 
            System.out.println("A pilah está cheia!");
    }

    public String desempilhar(){
        String retorno = null;
        if(!estaVazia())
            for(int i = topo; i >= 0; i--)
                retorno += pilha[i];
        else
            System.out.println("A pilha está vazia!");
        return retorno;
    }

    public char espiar(){
        char retorno;
        if(!estaVazia())
            retorno = pilha[topo];
        else {
            System.out.println("A pilha está cheia!");
            retorno = ' ';
        }
        return retorno;
    }

    //Métodos Secundários
    public boolean estaCheia(){
        return topo == pilha.length-1;
    }

    public boolean estaVazia(){
        return topo == -1;
    }

    public String imprimir(){
        String retorno = "";
        if(!estaVazia())
            for(int i = topo; i >= 0; i--)
                retorno += pilha[i];
        return retorno;
    }
}