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
public class Exercicio21 {

    /*
     * Faça um programa que calcule o número médio de alunos por turma.
     * Para isto, peça a quantidade de turmas e a quantidade de alunos para
     * cada turma. As turmas não podem ter mais de 40 alunos.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Número de turmas: ");
        int nTurmas = scan.nextInt();
        int nAlunos, soma = 0, media;

        for (int i = 0; i < nTurmas; i++) {
            System.out.print("Número de alunos da turma " + (1 + i) + ":");
            nAlunos = scan.nextInt();
            if (nAlunos > 40) {
                System.out.println("A turma pode ter no maximo 40 alunos."
                        + " Volte a inserir o número de alunos da turma " + (i + 1) + ".");
                i--;
            } else {
                soma += nAlunos;
            }
        }
        media = soma / nTurmas;
        System.out.println("A média de alunos por turma é de: " + media + " alunos.");
    }

}
