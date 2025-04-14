package AltoritimosDeOrdenacao.Aula14042025;

public class AlgoritimoBoubbleSort {
    public static void main(String[] args) {
        int[] arrayBoubble = {4,5,2,9,7,3,6,1,8};
        int passagens = 0;

        while(passagens < arrayBoubble.length){
            for(int i = 0; i < arrayBoubble.length-1; i++){
                if(arrayBoubble[i] > arrayBoubble[i+1]){
                    int aux = arrayBoubble[i+1];
                    arrayBoubble[i+1] = arrayBoubble[i];
                    arrayBoubble[i] = aux;
                }
            }
            passagens++;
        }
        for(int i = 0; i < arrayBoubble.length; i++){
            System.out.print(arrayBoubble[i]+" ");
        }
    }
}

/*
public class Ordenação{
    int dados[] = new {6,8,3,1,9,0,2,5};
    
    public void bubbleSort(){
    
    }
}

*/
