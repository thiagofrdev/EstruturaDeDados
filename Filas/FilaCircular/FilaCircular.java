package Filas.FilaCircular;

public class FilaCircular implements Enfileiravel {
    //Variáveis de instância
    Enfileiravel[] filaCircular;
    int ponteiroInicio;
    int ponteiroFim;
    int quantidade; //Necessário para distinguir entre cheia e vazia

    //Contrutores
    public FilaCircular(){this(10);}

    public FilaCircular(int tamanho){
        filaCircular = new Enfileiravel[tamanho];
        ponteiroInicio = 0;
        ponteiroFim = -1;
        quantidade = 0;
    }

    //Métodos secundários
    @Override
    public boolean estaCheia(){
        // return (ponteiroInicio + filaCircular.length-1) % filaCircular.length == ponteiroFim;
        return quantidade == filaCircular.length;
    }

    @Override
    public boolean estaVazia(){
        return quantidade == 0;
    }

    @Override
    public String imprimir(){
        String retorno = "[";
        for (int i = ponteiroInicio; i != ponteiroFim; i = (i+1)%filaCircular.length){
            retorno += filaCircular[i] + ", ";
        }
        return retorno;
    }
}
