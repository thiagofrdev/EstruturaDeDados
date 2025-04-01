/*
 * TODA PILHA É UMA LISTA
 * TODA FILA É UMA LISTA
 * LISTAS NÃO SÃO PILHAS, NEM LISTAS
 */

package Listas.Aula31032025;

public interface Listavel {
    void inserir(int indice, Object dado);      //Create - insert
    void anexar(Object dado);                   //Create - append  
    Object selecionar(int indice);              //Read - select
    Object[] selecionarTodos();                 //Read - selectAll
    boolean existe(Object dado);                //Read - exists
    //int primeiraOcorrencia(Object dado);        //Read - fristOcurrency
    //int ultimaOcorrencia(Object dado);        //Read - lastOcurrency
    void atualizar(int indice, Object dado);    //Uptade
    Object apagar(int indice);                  //Delete
    void limpar();                              //Delete

    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}
