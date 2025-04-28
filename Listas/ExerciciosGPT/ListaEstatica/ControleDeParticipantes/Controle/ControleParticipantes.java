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
    public boolean inserir(Participante p){
        boolean retorno = false;
        if(!estaCheia()){
            lista[qtdElementos] = p;
            qtdElementos++;
            retorno = true;
        } else System.out.println("Lista cheia!");
        return retorno;
    }

    public Object remover(int posicao){
        Object retorno = null;
        if(!estaVazia()){
            if(lista[posicao] != null){
                retorno = lista[posicao];
                for (int i = posicao; i < qtdElementos; i++)
                    lista[posicao] = lista[posicao+1];
                    lista[posicao+1] = null;
            } else System.out.println("Não há nada nessa posição!");
        } else System.out.println("Lista vazia!");
        return retorno;
    }
    
    public int buscarPosicaoPorNome(String nome){
        int retorno = -1;
        if(!estaVazia())
            for(int i = 0; i < qtdElementos; i++)
                if(nome == lista[i].getNome())
                    retorno = i;
        else System.out.println("Lista vazia!");
        return retorno;
    }

    public String buscarNomePorPosicao(int posicao){
        String retorno = null;
        if(!estaVazia())
            if (posicao >= 0 && posicao < qtdElementos)
                return lista[posicao].getNome();
        else System.out.println("Lista vazia!");
        return retorno;
    }
    
    public boolean atualizar(int posicao, Object dado){
        boolean retorno = false;
        return retorno;
    }
    
    //Métodos Secundários
    public boolean estaCheia(){
        return qtdElementos == lista.length;
    }
    
    public boolean estaVazia(){
        return qtdElementos == 0;
    }
    
    public String imprimir(){
        String retorno = "";
        if(!estaVazia())
            for(int i = 0; i < qtdElementos; i++){
                System.out.printf(
                    "\nParticipante %d"+
                    "\nNome Completo: " + lista[i].getNome() + " " + lista[i].getSobrenome() +
                    "\nIdade: " + lista[i].getIdade() +
                    "\nVIP: " + lista[i].isVip() +
                    "\n", i+1
                );
            } else retorno = "Lista vazia!";
        return retorno;
    }

    public int getQtdElementos(){
        return qtdElementos;
    }
}