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
public class Exercicio2 {

    /*
     * Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
     * mesmo tipo e tamanho e com os elementos do vetor A multiplicados
     * por 2, ou seja: B[i] = A[i] * 2.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[8];
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Valor " + (i + 1) + " = ");
            a[i] = scan.nextInt();
            b[i] = a[i] * 2;
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
