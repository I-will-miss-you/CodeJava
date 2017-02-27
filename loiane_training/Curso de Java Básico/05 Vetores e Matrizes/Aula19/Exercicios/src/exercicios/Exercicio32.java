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
public class Exercicio32 {

    /*
     * Criar um vetor A com 5 elementos inteiros. Escreva um programa que
     * imprima a tabuada de cada um dos elementos do vetor A.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        
        System.out.println("Valores para calcular a tabuada:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
        }
        
        System.out.println("\nTABUADAS:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("\nTabuada do " + vetorA[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println( vetorA[i] + " x " + j + " = " + (vetorA[i] * j));
            }
        }
    }
    
}
