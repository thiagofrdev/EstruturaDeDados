package Exe_PilhaInversora;

import java.util.Scanner;

public class PilhaInversoraMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira a frase: ");
        String frase = scan.nextLine();

        PilhaInversora pilha = new PilhaInversoraEstatica(frase);

        pilha.empilhar();
        pilha.imprimir();
    }
}
