/*
Você está ajudando uma pessoa a organizar suas compras de supermercado. Crie um programa que gerencie uma lista estática de itens, com capacidade para até 10 itens. Seu programa deve permitir:
- Adicionar um item ao final da lista (desde que não esteja cheia).
- Mostrar todos os itens da lista.
- Mostrar quantos itens já foram adicionados.

Requisitos adicionais:
- Se a lista estiver cheia, exiba uma mensagem informando que não é possível adicionar mais itens.
- Se a lista estiver vazia, exiba uma mensagem apropriada ao tentar mostrar os itens.
*/

package Listas.ExerciciosGPT.ListaEstatica.ListaDeCompras;

public class ListaDeComprasMain {
    public static void main(String[] args) {
        ListaDeCompras lista = new ListaDeCompras(8);

        System.out.println(lista.imprimir());
        lista.remover(2);

        lista.inserir(1);
        lista.inserir("Casa");
        lista.inserir(true);
        System.out.println(lista.imprimir());

        lista.remover(1);
        lista.atualizar(0, 'T');
        System.out.println(lista.imprimir());

        System.out.println(lista.buscar('T'));

        lista.atualizar(1, 1+2);
        lista.atualizar(4, 95/5);
        System.out.println(lista.imprimir());
        
        lista.inserir("fulano@gmail.com");
        lista.inserir(9.43);
        lista.inserir('D');
        lista.inserir(false);
        lista.inserir(">");
        lista.inserir("Thiago");
        lista.inserir("teste1");
        System.out.println(lista.imprimir());
    }
}