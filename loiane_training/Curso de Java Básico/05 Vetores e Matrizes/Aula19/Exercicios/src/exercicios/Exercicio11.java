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
public class Exercicio11 {

    /*
     * Criar um vetor A com 10 elementos inteiros. Implementar um programa
     * que defina e escreva a quantidade de elementos armazenados neste
     * vetor que são pares.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int nPares = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Valor " + (i + 1) + " = ");
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                nPares++;
            }
        }

        System.out.println("Quatidade de números pares no vetor = " + nPares);
    }

}
