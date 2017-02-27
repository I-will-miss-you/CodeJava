/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio9 {

    /*
     * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
     * um vetor C, onde cada elemento de C é a divisão dos respectivos
     * elementos em A e B, ou seja:
     * C[i] = A[i] / float(B[i]).
     */
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
        int[] a = new int[4];
        int[] b = new int[a.length];
        double[] c = new double[a.length];

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
            c[i] = a[i] / (double)b[i];
        }

        System.out.println("\nVetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }

        System.out.println("\nVetor B:");
        for (int i = 0; i < b.length; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }
        DecimalFormat df = new DecimalFormat("###,###.###");
        System.out.println("\nVetor C:");
        for (int i = 0; i < b.length; i++) {
            System.out.println("C[" + i + "] = " + df.format(c[i]));
        }
    }
    
}
