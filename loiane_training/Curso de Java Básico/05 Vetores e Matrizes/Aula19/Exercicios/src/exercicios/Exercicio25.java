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
public class Exercicio25 {

    /*
     * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
     * mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
     * a) Bi deverá receber 1 quando Ai for par; 
     * b) Bi deverá receber 0 quando Ai for ímpar.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] % 2 == 0 ? 1 : 0;
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");
        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("");
    }

}
