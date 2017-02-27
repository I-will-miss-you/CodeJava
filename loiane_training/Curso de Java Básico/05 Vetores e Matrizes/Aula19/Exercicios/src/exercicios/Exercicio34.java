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
public class Exercicio34 {

    /*
     * Criar um vetor A com 10 elementos inteiros. Escreva um programa que
     * imprima cada elemento do vetor A e a relação de todos os pares de 0
     * até o respectivo elemento.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        System.out.println("Valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
        }
        
        
        for (int i=0; i<vetorA.length; i++){
            System.out.println("\nAnalizando o número " + vetorA[i]);  
            for (int j=2; j<vetorA[i]; j++){
                if (j % 2 == 0){
                    System.out.println(j + " é par");
                }
            }
        }
        
        
        
    }

}
