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
public class Exercicio33 {

    /*
     * Criar um vetor A com 10 elementos inteiros. Escreva um programa que
     * imprima cada elemento do vetor A e uma mensagem indicando se o
     * respectivo elemento é um número primo ou não.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        System.out.println("Valores para calcular a tabuada:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
        }
        
        boolean primo;
        String str;
        for (int i = 0; i < vetorA.length; i++) {
            primo = true;
            for (int j = 2; j < vetorA[i]; j++) {
                if(vetorA[i] % j == 0){
                    primo = false;
                    break;
                }
            }
            
            str = primo?"é primo":"não é primo";
            System.out.println("O número "+ vetorA[i]+" "+str);
        }
    }

}
