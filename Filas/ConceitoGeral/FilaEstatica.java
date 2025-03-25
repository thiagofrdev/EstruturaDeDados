package Filas.ConceitoGeral;

public class FilaEstatica implements Enfileiravel{
    //Variáveis de instância
    private Object[] dados;
    private int ponteiroInicio;
    private int ponteiroFim;

    //Construtores
    public FilaEstatica(){this(10);}

    public FilaEstatica(int tamanho){
        dados = new Object[tamanho];    //Criação do array de tamanho "tamanho"
        ponteiroInicio = 0;             //Como é uma Fila simples, começamos em 0
        ponteiroFim = -1;               //Começa em -1 por conta da lógica do "enfileirar()"
    }

    //Métodos Principais
    @Override
    public void enfileirar(Object dado){
        if (!estaCheia()){
            ponteiroFim++;
            dados[ponteiroFim] = dado;
        } else
            System.out.println("A fila está cheia!");
    }

    @Override
    public Object desenfileirar(){
        Object dado = null;
        if (!estaVazia()){
            dado = dados[ponteiroInicio];
            dados[ponteiroInicio] = null;
            ponteiroInicio++;
        } else 
            System.out.println("A fila está vazia!");
        return dado;
    }

    @Override
    public Object verificar(){
        Object dado;
        if (!estaVazia())
            dado = dados[ponteiroInicio];
        else {
            System.out.println("A fila está vazia!");
            dado = "[ ]";
        }
        return dado;
    }

    @Override
    public Object verificarFim(){
        Object dado;
        if (!estaVazia())
            dado = dados[ponteiroFim];
        else {
            System.out.println("A fila está vazia!");
            dado = "[ ]";
        }
        return dado;
    }

    @Override
    public Object verificarElemento(int indice){
        Object dado;
        if (!estaVazia()){
            if (dados[indice] != null)
                dado = dados[indice];
            else {
                System.out.printf("A posição [%d] está vazia!\n", indice);
                dado = "[ ]";
            }
        } else {
            System.out.println("A fila está vazia!");
            dado = "[ ]";
        }
        return dado;
    }

    //Métodos Secundários
    @Override
    public boolean estaCheia(){
        boolean retorno;
        if (ponteiroFim == dados.length - 1) 
            retorno = true;
        else
            retorno = false;
        return retorno;
    }

    @Override
    public boolean estaVazia(){
        boolean retorno;
        if (ponteiroFim == -1) 
            retorno = true;
        else
            retorno = false;
        return retorno;
    }

    @Override
    public String imprimir(){
        String resultado = "[";
        for (int i = ponteiroInicio; i <= ponteiroFim; i++) {
            if (i != ponteiroFim)
                resultado += dados[i] + ", ";
            else
                resultado += dados[i];
        }
        return  resultado + "]";
    }
}