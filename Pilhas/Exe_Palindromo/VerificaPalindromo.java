package Pilhas.Exe_Palindromo;

public class VerificaPalindromo implements Empilhavel{
    char[] pilha;
    int topo;

    public VerificaPalindromo(){this(10);}

    public VerificaPalindromo(int tamanho){
        pilha = new char[tamanho];
        topo = -1;
    }

    public boolean palindromo(){
        String teste1, teste2 = "";
        if(!estaVazia()){

        }
    }

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
