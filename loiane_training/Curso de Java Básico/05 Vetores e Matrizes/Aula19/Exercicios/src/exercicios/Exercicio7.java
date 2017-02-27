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
public class Exercicio7 {

    /*
     * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
     * um vetor C, onde cada elemento de C é a subtração dos respectivos
     * elementos em A e B, ou seja:
     * C[i] = A[i] – B[i].
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[a.length];
        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            System.out.print("VetorA[" + (i + 1) + "] = ");
            a[i] = scan.nextInt();
        }

        System.out.println("");

        for (int i = 0; i < b.length; i++) {
            System.out.print("VetorB[" + (i + 1) + "] = ");
            b[i] = scan.nextInt();
        }

        System.out.println("");

        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] - b[i];
        }

        System.out.println("\nVetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }

        System.out.println("\nVetor B:");
        for (int i = 0; i < b.length; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }

        System.out.println("\nVetor C:");
        for (int i = 0; i < b.length; i++) {
            System.out.println("C[" + i + "] = " + c[i]);
        }
    }

}
