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
public class Exercicio23 {

    /*
     * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
     * que verifique se "todos" os elementos do vetor A são pares. Se pelo
     * menos um elemento do vetor não for par o processo de repetição para
     * percorrer os elementos do vetor deve ser encerrado, como sugestão:
     * utilize uma variável do tipo flag para atingir este propósito.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
            
            if(vetorA[i] % 2 != 0){
                break;
            }
        }      
    }

}
