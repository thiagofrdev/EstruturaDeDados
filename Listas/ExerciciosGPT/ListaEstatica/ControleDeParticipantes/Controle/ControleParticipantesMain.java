/*Controle de participantes em um evento
Você foi contratado para desenvolver o sistema de controle de participantes de um evento. O sistema terá uma lista estática que pode armazenar até 50 nomes. Sua tarefa é implementar um programa que permita:
- Adicionar um novo participante em uma posição específica da lista (o organizador pode querer inserir em ordem alfabética).
- Remover um participante de uma posição específica (caso alguém cancele sua participação).
- Buscar o nome de um participante na lista e retornar a posição.

Requisitos adicionais:
- O sistema deve exibir a lista completa de participantes após cada operação.
- Garanta que nenhuma posição fique "em branco" após uma remoção.
*/

package Listas.ExerciciosGPT.ListaEstatica.ControleDeParticipantes.Controle;

import java.util.Scanner;

import Listas.ExerciciosGPT.ListaEstatica.ControleDeParticipantes.Entidades.Participante;
import Listas.ExerciciosGPT.ListaEstatica.ControleDeParticipantes.Excecoes.IdadeInvalidaException;

public class ControleParticipantesMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Participante p = null;
        ControleParticipantes lista = new ControleParticipantes();

        do {
            System.out.print("Selecione o que quer fazer:\n(1) Adicionar Participante\n(2) Imprimir Lista\nEscolha: ");
            int escolha = scan.nextInt();

            switch(escolha){
                case 1:
                    scan.nextLine();
                    System.out.print("Digite o nome do participante: ");
                    String nome = scan.nextLine();

                    System.out.print("Digite o sobrenome do participante: ");
                    String sobrenome = scan.nextLine();

                    System.out.print("Digite a idade do participante: ");
                    int idade = scan.nextInt();
                    scan.nextLine();

                    System.out.print("O participante é VIP? (true/false) ");
                    boolean vip = scan.nextBoolean();
                    scan.nextLine();
                    
                    try {
                        p = new Participante(nome, sobrenome, idade, vip);
                        lista.inserir(p);
                        System.out.println("Participante criado com sucesso: " + p.getNome() + "\n");
                    } catch (IdadeInvalidaException e) {
                        System.err.println("Erro ao criar participante: " + e.getMessage() + "\n");
                    }
                    break;
                case 2:
                    System.out.println(lista.imprimir());
                    break;
            }
        } while (p != null);
    }
}