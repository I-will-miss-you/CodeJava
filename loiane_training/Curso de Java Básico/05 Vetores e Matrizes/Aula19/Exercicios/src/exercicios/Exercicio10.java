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
public class Exercicio10 {

    /*
     * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
     * mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
     * ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
     * seja: B[i] := A[i] % 2.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Valor " + (i + 1) + " = ");
            a[i] = scan.nextInt();
            b[i] = a[i] % 2;
        }

        System.out.println("\nVetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }
        System.out.println("\nVetor B:");
        for (int i = 0; i < b.length; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }
    }

}
