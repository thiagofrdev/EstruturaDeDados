package Filas.FilaCircular;

public class FilaCircular implements Enfileiravel {
    //Variáveis de instância
    Object[] filaCircular;
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

    //Métodos principais
    @Override
    public void enfileirar(Object dado){
        if(!estaCheia()){
            avancar(ponteiroFim);
            filaCircular[ponteiroFim] = dado;
            quantidade++;
        } else 
            System.err.println("Fila Cheia!");
    }

    @Override
    public Object desenfileirar(){
        Object retorno = null;
        if(!estaVazia()){
            retorno = filaCircular[ponteiroInicio];
            avancar(ponteiroInicio);
            quantidade--;
        } else
            System.err.println("Fila vazia!");
        return retorno;
    }

    @Override
    public Object verificar(){
        Object retorno = null;
        if(!estaVazia())
            retorno = filaCircular[ponteiroInicio];
        else
            System.err.println("Fila vazia!");
        return retorno;
    }

    //Métodos secundários
    @Override
    public int avancar(int ponteiro){
        return (ponteiro+1)%filaCircular.length;
    }

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
        for (int i = ponteiroInicio; i != ponteiroFim; i = avancar(i)){
            retorno += filaCircular[i] + ", ";
        }
        return retorno;
    }
}
