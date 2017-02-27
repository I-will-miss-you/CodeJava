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
public class Exercicio3 {

    /*
     * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo
     * tipo e tamanho, sendo que cada elemento do vetor B deverá ser o quadrado
     * do respectivo elemento de A, ou seja: B[i] = A[i] * A[I].
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[15];
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Valor " + (i + 1) + " = ");
            a[i] = scan.nextInt();
            b[i] = a[i] * a[i];
        }
        System.out.println("\n Vetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }
        System.out.println("\n Vetor B:");
        for (int i = 0; i < b.length; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }
    }

}
