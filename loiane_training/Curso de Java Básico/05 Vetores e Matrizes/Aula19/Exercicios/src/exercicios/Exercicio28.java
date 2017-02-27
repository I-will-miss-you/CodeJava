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
public class Exercicio28 {

    /*
     * Ler um vetor A com 10 elementos e construir um vetor B de mesmo
     * tipo e tamanho e com os mesmos elementos de A, sendo que estes
     * deverão estar invertidos, ou seja, o primeiro elemento de A passa a
     * ser o último de B, o segundo elemento de A passa a ser o penúltimo
     * de B e assim por diante.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        System.out.println("Valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[vetorB.length - i - 1] = vetorA[i];
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
