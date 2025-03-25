package Filas.ConceitoGeral;

//Interface que possui todos os meétodos básicos para implementação de uma fila
public interface Enfileiravel {
    //Métodos Principais
    void enfileirar(Object dado);   //Método que acrescenta um elemento ao final da Fila
    Object desenfileirar();         //Método que remove o primeiro elemento da Fila
    Object verificar();             //Método que retorna o prmeiro elemento da Fila
    Object verificarFim();          //Método que retorna o ultimo elemento da Fila
    Object verificarElemento(int indice);     //Método que retorna um elemento específico
    
    //Métoros Auxiliares
    boolean estaCheia();    //Método para verificar de a Fila está cheia
    boolean estaVazia();    //Método para verificar de a Fila está vazia
    String imprimir();      //Método para iprimir a Fila
}
