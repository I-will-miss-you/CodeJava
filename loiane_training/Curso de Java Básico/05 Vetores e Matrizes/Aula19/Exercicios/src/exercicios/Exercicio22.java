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
public class Exercicio22 {

    /*
     * Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
     * 0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
     * para implementar um programa que determine o percentual de
     * números 0's e 1's existentes no vetor A.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtd0 = 0, qtd1 = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);
            if (vetorA[i] == 0) {
                qtd0++;
            } else {
                qtd1++;
            }
        }
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");
        
        System.out.println("Percentagem de 0's = " + (qtd0 * 100 / vetorA.length));
        System.out.println("Percentagem de 1's = " + (qtd1 * 100 / vetorA.length));
        
    }

}
