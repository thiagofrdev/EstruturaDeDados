package AltoritimosDeOrdenacao.Aula14042025;

public class AlgoritimoBubbleSort {
    public static void main(String[] args) {
        int[] arrayBubble = {4,5,2,9,7,3,6,1,8};
        int passagens = 0;

        while(passagens < arrayBubble.length){
            for(int i = 0; i < arrayBubble.length-1; i++){
                if(arrayBubble[i] > arrayBubble[i+1]){
                    int aux = arrayBubble[i+1];
                    arrayBubble[i+1] = arrayBubble[i];
                    arrayBubble[i] = aux;
                }
            }
            passagens++;
        }
        for(int i = 0; i < arrayBubble.length; i++){
            System.out.print(arrayBubble[i]+" ");
        }
    }
}

/*
public class Ordenação{
    int dados[] = new {6,8,3,1,9,0,2,5};

    public voic imprimirTela(){
        for (int dado: dados)
            System.out.print(dado + " ");

        System.out.println(""); 
    }

    public void selectionSort(){
        for(int j = 0; j < dado.length; j++){
            int menor = j;
            for(int i = 1+j; i < dado.length; i++){
                if (dados[menor] > dados[i])
                    menor = 1;
            }
            troca(j, menor);
        }
    }

    public void insertionSort(){

    }

    public void bubbleSort(){
        for (int j = 0; j < dados.lenght-1; i++){
            for(int i = 0; i < dados.lenght-1-j; i++){
                if(dados[i] > dados[i+1]){
                    troca(i, i+1);
                }
            }
        }
    }

    private troca(int indice1, int indice2){
        int temp = dados[indice1]
        dados[indice1] = dados[indice2];
        dados[indice2] = temp;
    }
}
*/