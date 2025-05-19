package Listas.ListaEncadeada.Conceito;

import java.lang.StringBuilder;

public class ListaEncadeada<T>{
    //Variáveis de instância
    private No<T> inicio;   //Ponteiro de referência para o próximo nó
    private int qtdElementos = 0;

    //Métodos Principais
    public void inserir(T dado){
        No<T> novoElemento = new No<T>(dado);   //Instanciação de um novo elemento
        novoElemento.setProximo(inicio);
        this.inicio = novoElemento;             //Faz o novo elemento criado ser o primeiro da Lista 
        qtdElementos++;
    }

    //Métodos Secundários
    public int tamanho(){
        return qtdElementos;
    }

    public boolean estaVazia(){
        return qtdElementos == 0;
    }

    public void imprimir(){
        StringBuilder sb = new StringBuilder();
        No<T> no = inicio;

        sb.append("[");
        while (no != null) {
            if (no.getProximo() == null) {
                sb.append(no.getDado());
            } else {
                sb.append(no.getDado()).append(" -> ");
            }       
            no = no.getProximo();     
        }
        sb.append("]");

        System.out.println(sb.toString());
    }
}