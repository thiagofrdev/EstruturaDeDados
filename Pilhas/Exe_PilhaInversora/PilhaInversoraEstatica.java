package Exe_PilhaInversora;

public class PilhaInversoraEstatica implements PilhaInversora {
    //Parâmetros de instância
    private String pilha[];
    private int tamanho;
    private String texto;

    //Construtores
    public PilhaInversoraEstatica(String texto){
        this.texto = texto;
        for (int i = 0; i < texto.length(); i++)
            if (texto.charAt(i) == ' ')
                tamanho++;
        pilha = new String[tamanho];
    }

    //Métodos Principais
    @Override
    public void empilhar(){
        
    }

    //Métodos Auxiliares
    @Override
    public String imprimir(){
        System.out.println("Quantidade de elementos: " + pilha.length);
        for(int i = 0; i < pilha.length; i++ ){
            System.out.print(pilha[i]);
        }
        return "";
    }
}
