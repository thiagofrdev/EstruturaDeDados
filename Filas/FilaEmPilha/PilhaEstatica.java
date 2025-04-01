public class PilhaEstatica implements Empilhavel {
    //Variáveis de Instância
    private Object[] pilha;
    private int topo;

    //Construtores
    public PilhaEstatica(){
        this(10);
    }

    public PilhaEstatica(int tamanho){
        pilha = new Object[tamanho];
        topo = -1;
    }

    //Métodos principais
    @Override
    public void empilhar(Object dado){
        if (!estaCheia()){
            topo++;
            pilha[topo] = dado;
        } else 
            System.out.println("Pilha cheia!");
    }

    @Override
    public Object desempilhar(){
        Object retorno = 0;
        if (!estaVazia()) {
            retorno = pilha[topo];
            topo--;
        } else 
            System.out.println("Pilha vazia!");
        return retorno;
    }

    @Override
    public Object espiar(){
        Object retorno = null;
        if (!estaVazia()){
            retorno = pilha[topo];
            System.out.println(retorno);
        } else 
            System.out.println("Pilha vazia!");
        return retorno;
    }
    
    //Métodos Secundários
    @Override
    public boolean estaCheia(){
        return topo == pilha.length-1;
    }

    @Override
    public boolean estaVazia(){
        return topo <= -1;
    }

    @Override
    public String imprimir(){
        String retorno = "[";
        if (!estaVazia()) {
            for (int i = 0; topo >= i; i++){
                retorno += pilha[i] + ", ";
            }
        } else
            System.err.println("Pilha vazia!");
        return retorno.substring(0, retorno.length() - 2) + "]";
    }
}