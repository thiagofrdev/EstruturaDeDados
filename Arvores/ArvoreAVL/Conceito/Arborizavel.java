package Arvores.ArvoreAVL.Conceito;

public interface Arborizavel<T> {
   void inserir(T dado);
   T apagar(T dado);
   void limpar();   
   
   NoTriplo<T> pegarRaiz();
   boolean existe(T dado);
   String imprimirPreOrdem();
   String imprimirEmOrdem();
   String imprimirPosOrdem();
}
