//Interface que possui todos os métodos básicos para implementação de uma FILA. Devo usar esses métodos para trabalhar com duas pilhas
public interface FilaEmPilha {
    //Métodos Principais
    void enfileirar(Object dado);
    Object desenfileirar();
    Object verificar();
    
    //Métoros Auxiliares
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}