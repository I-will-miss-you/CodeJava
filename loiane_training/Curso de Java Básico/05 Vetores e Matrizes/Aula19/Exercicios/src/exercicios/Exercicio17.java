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
public class Exercicio17 {

    /*
     * Ler um vetor A com 10 elementos inteiros correspondentes as idades
     * de um grupo de pessoas. Escreva um programa que determine e
     * escreva a quantidade de pessoas que possuem idade superior a 35
     * anos.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Idade " + (i + 1) + " = ");
            idades[i] = scan.nextInt();
        }

        int qtd = 0;
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 35) {
                qtd++;
            }
        }
        
        System.out.println("Existe "+ qtd +" pessoas com idade superior a 35.");
    }

}
