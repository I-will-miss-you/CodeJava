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
public class Exercicio37 {

    /*
     * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
     * mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial
     * do elemento correspondente em A.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[15];
        long[] vetorB = new long[vetorA.length];

        System.out.println("Valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = 1;
            for (int j = vetorA[i]; j > 0; j--) {
                vetorB[i] *= j;
            }
        }

        System.out.println("\n Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("A[" + i + "] = " + vetorA[i]);
        }
        System.out.println("\n Vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("B[" + i + "] = " + vetorB[i]);
        }
    }

}
