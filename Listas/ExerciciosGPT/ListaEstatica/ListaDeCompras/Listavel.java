package Listas.ExerciciosGPT.ListaEstatica.ListaDeCompras;

public interface Listavel {
    //Métodos Principais
    boolean inserir(int posicao, Object dado);
    Object remover(int posicao);
    Object buscar(Object elemeto);
    boolean atualizar(int posicao, Object dado);

    //Métodos Secundários
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}
