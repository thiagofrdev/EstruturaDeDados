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
    boolean inserir(Object dado){
        boolean retorno = false;
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
        boolean retorno = false;
        return retorno;
    }
    
    boolean estaVazia(){
        boolean retorno = false;
        return retorno;
    }
    
    String imprimir(){
        String retorno = "";
        return retorno;
    }
}