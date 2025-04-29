//interger.parseInt
public class Questao4 {
    public static void main(String[] args) {
        int[] array = {1, 8, 5, 3, 7, 10, 2, 6, 4, 9};
        
        sort(Order.ASCENDING, array);        
        System.out.println(imprimir(array));
        
        sort(Order.DESCENDING, array);        
        System.out.println(imprimir(array));
    }

    public static void sort(Order by, int[] data){
        switch (by) {
            case ASCENDING:
                //System.out.println("ASCENDING");
                for(int j = 0; j < data.length-1; j++)
                    for(int i = 0; i < data.length-1; i++)
                        if(data[i] > data[i+1]){
                            int aux = data[i];
                            data[i] = data[i+1];
                            data[i+1] = aux;
                        }                
                break;

            case DESCENDING:
                //System.out.println("DESCENDING");
                for(int j = 0; j < data.length-1; j++)
                    for(int i = 0; i < data.length-1; i++)
                        if(data[i] < data[i+1]){
                            int aux = data[i];
                            data[i] = data[i+1];
                            data[i+1] = aux;
                        }
                break;

            default:
                System.err.println("Erro!");
                break;
        }
    }

    public enum Order{
        ASCENDING,
        DESCENDING;
    }

    public static String imprimir(int[] array){
        String retorno = "[";
        for(int i = 0; i < array.length; i++){
            if(i+1 != array.length)
                retorno += array[i] + ", ";
            else 
                retorno += array[i];
        }
        return retorno + "]";
    }
}
