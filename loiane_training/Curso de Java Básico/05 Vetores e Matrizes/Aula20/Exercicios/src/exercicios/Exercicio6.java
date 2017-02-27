package exercicios;

import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio6 {

    /*
     * Faça um programa para jogar o jogo da velha. O programa deve
     * permitir que dois jogadores façam uma partida do jogo da velha,
     * usando o computador para ver o tabuleiro. Cada jogador vai
     * alternadamente informando a posição onde deseja colocar a sua
     * peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
     * determinar automaticamente quando o jogo terminou e quem foi o
     * vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
     * deve atualizar a situação do tabuleiro na tela.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int MAX_LIN = 3, MAX_COL = 3;
        char[] simbolo = {'X', 'O'};
        int jogador = 1, jogadas = 0;
        int lin, col;
        boolean vencedor = false, erro = false;

        char[][] tabuleiro = new char[MAX_LIN][MAX_COL];
        for (int i = 0; i < MAX_LIN; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                tabuleiro[i][j] = '-';
            }
        }

        while (!vencedor) {
            jogador = jogador == 1 ? 0 : 1;

            for (int i = 0; i < MAX_LIN; i++) {
                for (int j = 0; j < MAX_COL; j++) {
                    System.out.print(" | " + tabuleiro[i][j] + " | ");
                }
                System.out.println("");
            }

            do {
                System.out.println(erro ? "Essa casa já está ocupada... Jogue novamente" : "\nJogador " + (jogador + 1) + " faça a sua jogada: ");
                System.out.print("Linha (1 - 3): ");
                lin = scan.nextInt();
                System.out.print("Coluna (1 - 3): ");
                col = scan.nextInt();
                erro = tabuleiro[lin - 1][col - 1] != '-';
            } while (erro);

            //Atribuir o caracteres a posição do tabuleiro
            tabuleiro[lin - 1][col - 1] = simbolo[jogador];
            jogadas++;

            //Verificar se alguém ganhou
            for (int i = 0; i < MAX_LIN; i++) {
                if (tabuleiro[i][0] != '-' && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][0] == tabuleiro[i][2]) {
                    vencedor = true;
                    break;
                }
                if (tabuleiro[0][i] != '-' && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[0][i] == tabuleiro[2][i]) {
                    vencedor = true;
                    break;
                }
            }
            if (tabuleiro[0][0] != '-' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0] == tabuleiro[2][2]) {
                vencedor = true;
            } else if (tabuleiro[2][0] != '-' && tabuleiro[2][0] == tabuleiro[1][1] && tabuleiro[2][0] == tabuleiro[0][2]) {
                vencedor = true;
            }

            //Resultados 
            if (vencedor) {
                System.out.println("Parabéns jogador " + (jogador + 1) + "... Você ganhou...");
            } else if (jogadas == 9) {
                System.out.println("\nNão existe vencedor...");
                vencedor = true;
            }
        }

    }

}
