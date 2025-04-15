package Listas.ExerciciosGPT.ListaEstatica.ControleDeParticipantes.Controle;

import Listas.ExerciciosGPT.ListaEstatica.ControleDeParticipantes.Entidades.Participante;

public class ControleParticipantes {
    //Variáveis de Instância
    private Participante[] lista;
    private int qtdElementos;

    //Construtor
    public ControleParticipantes(){this(50);}

    public ControleParticipantes(int tamanho){
        lista = new Participante[tamanho];
        qtdElementos = 0;
    }

    //Métodos Principais
    boolean inserir(Participante p){
        boolean retorno = false;
        if(!estaCheia()){
            lista[qtdElementos] = p;
            qtdElementos++;
            retorno = true;
        } else System.out.println("Lista cheia!");
        return retorno;
    }

    Object remover(int posicao){
        boolean retorno = false;
        return retorno;
    }
    
    int buscar(String nome){
        int retorno = -1;
        return retorno;
    }
    
    boolean atualizar(int posicao, Object dado){
        boolean retorno = false;
        return retorno;
    }
    
    //Métodos Secundários
    boolean estaCheia(){
        return qtdElementos == lista.length;
    }
    
    boolean estaVazia(){
        return qtdElementos == 0;
    }
    
    String imprimir(){
        String retorno = "";
        if(!estaVazia())
            for(int i = 0; i < qtdElementos; i++){
                System.out.printf(
                    "Participante %d"+
                    "\nNome Completo: " + lista[i].getNome() + " " + lista[i].getSobrenome() +
                    "\nIdade: " + lista[i].getIdade() +
                    "\nVIP: " + lista[i].isVip() +
                    "\n"
                );
            } else retorno = "Lista vazia!";
        return retorno;
    }
}