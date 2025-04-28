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
            System.out.print("Selecione o que quer fazer:\n(1) Adicionar Participante\n(2) Excluir Participante\n(3) Imprimir Lista\nEscolha: ");
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
                    if(!lista.estaVazia()) {
                    System.out.println("Qual pessoa deseja remover?");
                        // Exibe índice e nome de cada participante
                        for (int i = 0; i < lista.getQtdElementos(); i++) {
                            String nomeLista = lista.buscarNomePorPosicao(i);
                            if (nomeLista != null) {
                                System.out.printf("(%d) %s%n", i + 1, nomeLista);
                            } else {
                                System.out.printf("(%d) [Erro ao buscar nome]%n", i + 1);
                            }
                        }

                        System.out.print("Digite o nome: ");
                        int posicaoRemover = scan.nextInt();
                        scan.nextLine();

                        if (posicaoRemover > 0 && posicaoRemover <= lista.getQtdElementos()) {
                            lista.remover(posicaoRemover - 1); // Removendo pelo índice (ajustado para 0-based)
                            System.out.println("Participante removido com sucesso!");
                        } else {
                            System.out.println("Número inválido! Tente novamente.");
                        }
                    } else {
                        System.out.println("A lista está vazia!");
                    }
                    break;
                
                case 3:
                    System.out.println(lista.imprimir());
                    break;
            }
        } while (p != null);
    }
}