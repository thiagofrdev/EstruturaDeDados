//Classe que deve funcionar como uma FILA, mas operando pilhas
public class FilaEmPilhaEstatica implements FilaEmPilha {
    //Variáveis de instância
    Empilhavel pilha1; //Cria só uma variável do tipo Empilhavel, e não um array de pilhas (Empilhavel[] pilha)
    Empilhavel pilha2;
    
    //Construtores
    public FilaEmPilhaEstatica(){this(10);}

    public FilaEmPilhaEstatica(int tamanho){
        pilha1 = new PilhaEstatica(tamanho);    //Pilha principal
        pilha2 = new PilhaEstatica(tamanho);    //Pilha auxiliar
    }

    //Métodos Principais
    @Override
    public void enfileirar(Object dado){
        pilha1.empilhar(dado);
    }

    @Override
    public Object desenfileirar(){
        //e agora??
    }

    @Override
    public Object frente(){

    }

    //Métodos Secundários
    @Override
    public boolean estaCheia(){
        return pilha1.estaCheia();
    }

    @Override
    public boolean estaVazia(){
        return pilha1.estaVazia();
    }

    @Override
    public String imprimir(){
        String retorno = null;
        if(!estaVazia())
            retorno = pilha1.imprimir();
        else
            System.err.println("Fila vazia!");
        return retorno;
    }
}