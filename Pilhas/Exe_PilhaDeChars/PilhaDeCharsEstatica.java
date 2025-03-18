package Exe_PilhaDeChars;

public class PilhaDeCharsEstatica implements PilhaDeChars {
    //Variáveis Globais
    private char[] pilha;   //Criação da pilha
    private int topo;       //Variável para armazenar o indice de topo

    //Construtores
    public PilhaDeCharsEstatica(){  //Construtor sem parâmetro que inicializa um vetor de pilha com 10 indices, chamando o construtor com parâmetro
        this(10);
    }

    public PilhaDeCharsEstatica(int tamanho){   //Construtor com parâmetro de tamanho
        pilha = new char[tamanho];  //Criação da Pilha
        topo = -1;                  //Indicação do indice de elemento topo
    }

    //Métodos Principais
    @Override
    public void empilhar(char c){
        if (!estaCheia()){
            topo++;
            pilha[topo] = c;
        } else 
            System.out.println("Pilha cheia!");
    }

    @Override
    public char desempilhar(){
        char aux = 0;
        if (!estaVazia()) {
            aux = pilha[topo];
            topo--;
        } else 
            System.out.println("Pilha vazia!");

        return aux;
    }

    @Override
    public char espiar(){
        char aux = 0;
        if (!estaVazia()){
            aux = pilha[topo];
            System.out.println(aux);
        } else 
            System.out.println("Pilha vazia!");

        return aux;
    }

    //Métodos auxiliares
    @Override
    public boolean estaCheia(){
        if (topo == pilha.length - 1)
            return true;    
        else
            return false;
        
    }

    @Override
    public boolean estaVazia(){
        if (topo <= -1 )
            return true;
        else
            return false;
    }

    @Override
    public String imprimir(){
        if (!estaVazia()) {
            System.out.print("[");
            for (int i = 0; topo >= i; i++){
                System.out.print(pilha[i] + " ");
            }
            System.out.println("]");
            return "";
        } else
            return "Pilha vazia!";
    }
}