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
public class Exercicio31 {

    /*
     * Ler um vetor A com 20 elementos. Separar os elementos pares e
     * ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
     * do vetor B armazene os elementos pares de A e nas posições
     * restantes do vetor B armazene os elementos de A que são ímpares.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int j = 0, k = vetorA.length / 2;

        System.out.println("Valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
            if (vetorA[i] % 2 == 0) {
                vetorB[j++] = vetorA[i];
            } else {
                vetorB[k++] = vetorA[i];
            }
        }

        System.out.print("Vetor A ini: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");

        System.arraycopy(vetorB, 0, vetorA, 0, vetorA.length);

        System.out.print("Vetor A após: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");

    }

}
