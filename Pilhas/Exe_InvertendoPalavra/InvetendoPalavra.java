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
    public void empilhar(){

    }

    public char desempilhar(){
        return ' ';
    }

    public char espiar(){
        return ' ';
    }

    //Métodos Secundários
    public boolean estaCheia(){
        return true;
    }

    public boolean estaVazia(){
        return true;
    }

    public String imprimir(){
        return "";
    }
}