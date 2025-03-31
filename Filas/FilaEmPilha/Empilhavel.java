public interface Empilhavel{
    //Métodos principais
    void empilhar(Object dado);
    Object desempilhar();
    Object espiar();

    //Métodos auxiliares
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}