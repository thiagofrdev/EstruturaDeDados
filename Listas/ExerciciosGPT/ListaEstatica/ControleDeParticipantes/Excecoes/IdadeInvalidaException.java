package Listas.ExerciciosGPT.ListaEstatica.ControleDeParticipantes.Excecoes;

public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem){
        super(mensagem); //Passa a mensagem para a classe Exception
    }
}
