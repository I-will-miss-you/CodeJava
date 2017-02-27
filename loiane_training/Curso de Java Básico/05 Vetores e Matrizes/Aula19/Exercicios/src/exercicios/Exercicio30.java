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
public class Exercicio30 {

    /*
     * Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
     * que nos vetor B e C serão armazenados o valores pares e ímpares de
     * A, respectivamente.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];
        int j = 0, k = 0;

        System.out.println("Valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 2 == 0) {
                vetorB[j++] = vetorA[i];
            } else {
                vetorC[k++] = vetorA[i];
            }
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");

        System.out.print("Vetor B: ");
        for (int i = 0; i < j; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("");

        System.out.print("Vetor C: ");
        for (int i = 0; i < k; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println("");
    }

}
