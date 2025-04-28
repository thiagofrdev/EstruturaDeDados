/*
Defina uma interface em Java com as operações necessárias (nome da operação, parâmetros de entrada e tipo de retorno(se necessário)) e a descrição destas operações, para implementar um organizador de receitas culinárias, utilizando a estrutura de dados do tipo Lista. É necessário a gerência de uma lista de receitas com ingredientes, modos de preparo e categorias como "favoritas" ou "testadas".
*/

public interface Listavel {
    //Métodos Principais
    boolean inserir(ListaDeReceita receita);
    ListaDeReceita verificar();
    boolean atualizar(int posicao, ListaDeReceita receita);
    ListaDeReceita remover(int posicao);
    
    //Métodos Secundários
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
}