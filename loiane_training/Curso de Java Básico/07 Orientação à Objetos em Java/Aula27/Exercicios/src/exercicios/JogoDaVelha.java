/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class JogoDaVelha {

    private final int MAX_LIN = 3;
    private final int MAX_COL = 3;
    private final char[] simbolo = {'X', 'O'};
    private int jogador;
    private int jogadas;
    private boolean vencedor;
    private final char[][] tabuleiro = new char[MAX_LIN][MAX_COL];

    public JogoDaVelha() {
        jogadas = 0;
        jogador = 0;
        vencedor = false;
        for (int i = 0; i < MAX_LIN; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    public void printTabuleiro() {
        for (int i = 0; i < MAX_LIN; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                System.out.print(" | " + tabuleiro[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    public void jogar() {
        int col;
        int lin;
        boolean erro = false;
        Scanner scan = new Scanner(System.in);
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
    }

    public boolean existeVencedor() {
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

        if (vencedor) {
            System.out.println("Parabéns jogador " + (jogador + 1) + "... Você ganhou...");
        } else if (jogadas == 9) {
            System.out.println("\nNão existe vencedor...");
            vencedor = true;
        }

        return vencedor;
    }

    public void trocarJogador() {
        if (jogadas > 0) {
            jogador = jogador == 1 ? 0 : 1;
        }
    }
}
