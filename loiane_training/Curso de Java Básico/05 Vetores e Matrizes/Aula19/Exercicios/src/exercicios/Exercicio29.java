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
public class Exercicio29 {

    /*
     * Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
     * sendo este a junção dos dois outros vetores. Os primeiros 10
     * elementos de C deverão receber os elementos de A e os últimos
     * elementos C deverão receber os elementos de B. Desta forma, C
     * deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length * 2];

        System.out.println("Valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
            vetorC[i] = vetorA[i];
        }
        System.out.println("Valores do vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorB[i] = scan.nextInt();
            vetorC[vetorA.length + i] = vetorB[i];
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

        System.out.print("Vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println("");

    }

}
