public class FilaEmPilhaEstatica implements FilaEmPilha {
    //Variáveis de instância
    Empilhavel[] pilha1;
    Empilhavel[] pilha2;
    
    //Construtores
    public FilaEmPilhaEstatica(){this(10);}

    public FilaEmPilhaEstatica(int tamanho){
        pilha1 = new PilhaEstatica[tamanho];
        pilha2 = new PilhaEstatica[tamanho];
    }

    //Métodos Principais
    public void enfileirar(Object dado){
        pilha1.empilhar(dado);
    }

    public Object desenfileirar(){
        //e agora??
    }

    @Override
    public Object frente(){

    }
    //Métodos Secundários
}
