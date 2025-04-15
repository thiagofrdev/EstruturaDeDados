package AltoritimosDeOrdenacao.Aula14042025;

public class AlgoritimoBubbleSort {
    public static void main(String[] args) {
        int[] array = {4,5,2,9,7,3,6,1,8};
        int passagens = 0;

        //InsertionSort
        for(int i = 1; i < array.length-1; i++){
            
        }

        /*BubbleSort
        while(passagens < array.length){
            for(int i = 0; i < array.length-1; i++){
                if(array[i] > array[i+1]){
                    int aux = array[i+1];
                    array[i+1] = array[i];
                    array[i] = aux;
                }
            }
            passagens++;
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }*/
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
        for(int j = 1; i < dados.length; j++){
            int pivo = j;
            for(int i = pivo-1; i > 0; i--){
                if(dados[pivo] < dados[i])
                    troca(pivo, i);
                else
                    break;
            }
        }
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