package Listas.ExerciciosGPT.ListaEstatica.ControleDeParticipantes.Controle;

import Listas.ExerciciosGPT.ListaEstatica.ControleDeParticipantes.Entidades.Participante;

public interface Listavel {
    //Métodos Principais
    boolean inserir(Participante p);
    Object remover(int posicao);
    int buscar(String nome, String sobrenome);
    boolean atualizar(int posicao, Participante p);

    //Métodos Secundários
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}