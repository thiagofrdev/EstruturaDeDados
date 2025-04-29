public class Questao2 {
    public static void main(String[] args) {
        System.out.println(decToBin(10));
        System.out.println(decToBin(35));
        System.out.println(decToBin(255));
    }

    public static String decToBin(int decimal){
        Pilha ordenacao = new Pilha(decimal);
        String retorno = "";

        do{
            int modulo = decimal%2;
            ordenacao.empilhar(modulo);
            decimal /= 2;
        } while (decimal != 0);
        
        for(int i = 0; i < ordenacao.tamanho(); i++){
            retorno += ordenacao.desempilhar();
        }

        return retorno;
    }

    public static class Pilha{
        //Variáveis de Instância
        int[] pilha;
        int topo = -1;
        int qtdElementos;

        //Construtores
        public Pilha(){this(10);}
        public Pilha(int decimal){
            pilha = new int[definirTamanho(decimal)];
        }

        //Métodos Principais
        public void empilhar(int numero){
            if(!estaCheia()){
                // for(int i = 0; i < pilha.length; i++){
                    topo++;
                    pilha[topo] = numero;
                    qtdElementos++;
                //}
            } else System.err.println("Pilha Cheia!");
        }

        public int desempilhar(){
            int retorno = -1;
            // for(int i = topo; i >= 0; i--){
                retorno = pilha[topo];
                topo--;
                qtdElementos--;
            //}
            return retorno;
        }

        //Métodos Secundários
        public boolean estaCheia(){
            return topo == pilha.length-1;
        }

        public String imprimir(){
            String retorno = "[";
            for(int i = 0; i < pilha.length; i++){
                if(i+1 != pilha.length)
                    retorno += pilha[i] + ", ";
                else
                    retorno += pilha[i];
            }
            return retorno + "]";
        }

        //Métodos auxiliares
        private int definirTamanho(int numero){
            int retorno = 0;
            do{
                numero /= 2;
                retorno++;
            } while (numero != 0);
            return retorno;
        }

        public int tamanho(){
            return pilha.length;
        }
    }

    // public static int pilha(int numero){
    //     int[] pilha = null;
    //     int definirTamanhoPilha = numero.definirTamanho();

    //     public pilha(int definirTamanho){
    //         pilha = new int[definirTamanho];
    //     }

    //     private void empilhar(int numero){}

    //     public int definirTamanho(){
    //         int definirTamanho = 0;
    //         do{
    //             numero /= 2;
    //             definirTamanho++;
    //         } while (definirTamanho != 0);
    //         return definirTamanho;
    //     }
    // }
}
