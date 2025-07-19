package Arvores.ArvoreAVL.Conceito;

public class ArvoreAVL<T extends Comparable<T>> implements Arborizavel<T> {
    private NoTriplo<T> raiz;

    public ArvoreAVL(){
        raiz = null;
    }

    
    public void inserir(T dado){

    }

    public T apagar(T dado){
        return null;
    }

    public void limpar(){

    } 


    public NoTriplo<T> pegarRaiz(){
        return null;
    }

    public boolean existe(T dado){
        return false;
    }

    public String imprimirPreOrdem(){
        return "imprimirPreOrdem";
    }

    public String imprimirEmOrdem(){
        return "imprimirEmOrdem";
    }

    public String imprimirPosOrdem(){
        return "imprimirPosOrdem";
    }
}
