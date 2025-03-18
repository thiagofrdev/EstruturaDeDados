package Exe_PilhaDeChars;

public class PilhaDeCharsMain {
    public static void main(String[] args) {
        PilhaDeChars p1 = new PilhaDeCharsEstatica();
        PilhaDeCharsEstatica p2 = new PilhaDeCharsEstatica(5);

        p1.imprimir();
        p1.espiar();
        p2.imprimir();
        p1.espiar();

        p1.empilhar('a');
        p2.empilhar('a');

        p1.imprimir();
        p1.espiar();
        p2.imprimir();
        p1.espiar();

        p1.empilhar('b');
        p1.empilhar('8');
        p1.empilhar('ç');
        p1.empilhar('#');
        p1.empilhar('%');

        p1.imprimir();
        p1.espiar();

        p1.desempilhar();
        p1.desempilhar();
        p1.empilhar('(');

        p1.imprimir();
        p1.espiar();

        p2.empilhar('(');
        p2.empilhar('A');
        p2.empilhar('&');
        p2.empilhar('9');
        p2.empilhar('r');
        p2.empilhar('T');

        p2.imprimir();
        p2.espiar();
    }    
}