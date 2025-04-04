package Pilhas.Exe_InvertendoPalavra;

import java.util.Scanner;

public class InvertendoPalavraMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira uma palavra: ");
        String palavra = scan.nextLine();

        Empilhavel p1 = new InvetendoPalavra(palavra.length());

        for(int i = 0; i <= palavra.length()-1; i++){
            p1.empilhar(palavra.charAt(i));
        }

        System.out.println("Topo: " + p1.espiar());
        System.out.println("Palavra Invertida: " + p1.imprimir());
    }
}