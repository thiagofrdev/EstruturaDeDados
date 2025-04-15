package Listas.ExerciciosGPT.ListaEstatica.ControleDeParticipantes.Controle;

public interface Listavel {
    //Métodos Principais
    boolean inserir(Object dado);
    Object remover(int posicao);
    boolean buscar(Object dado);
    boolean atualizar(int posicao, Object dado);

    //Métodos Secundários
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}