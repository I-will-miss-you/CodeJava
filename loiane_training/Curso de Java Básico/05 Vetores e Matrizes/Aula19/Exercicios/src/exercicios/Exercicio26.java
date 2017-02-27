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
public class Exercicio26 {

    /*
     * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
     * um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
     * regras de formação: 
     * a) Ci deverá receber 1 quando Ai for maior que Bi;
     * b) Ci deverá receber 0 quando Ai for igual a Bi; 
     * c) Ci deverá receber -1 quando Ai for menor que Bi.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        System.out.println("Valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
        }
        System.out.println("Valores do vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorB[i] = scan.nextInt();
        }

        //Vetor C
        for (int i = 0; i < vetorC.length; i++) {
            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else {
                vetorC[i] = -1;
            }
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
