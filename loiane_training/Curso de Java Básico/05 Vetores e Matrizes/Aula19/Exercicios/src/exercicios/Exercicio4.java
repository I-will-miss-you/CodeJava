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
public class Exercicio4 {

    /*
     * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo
     * tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do
     * respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[15];
        double[] b = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Valor " + (i + 1) + " = ");
            a[i] = scan.nextInt();
            b[i] = Math.sqrt(a[i]);
        }

        DecimalFormat df = new DecimalFormat("###,###.###");
        System.out.println("\nVetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }
        System.out.println("\nVetor B:");
        for (int i = 0; i < b.length; i++) {
            System.out.println("B[" + i + "] = " + df.format(b[i]));
        }
    }

}
