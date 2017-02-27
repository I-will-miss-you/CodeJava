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
public class Exercicio33 {

    /*
     * Faça um programa que mostre os n termos da Série a seguir:
     * o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
     * Imprima no final a soma da série.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        double soma = 0;
        System.out.print("Informe o termo N= ");
        n = scan.nextInt();
        for (int i = 1, j = 1; i <= n; i++, j += 2) {
            soma += (double) i / j;
            if (i == n) {
                System.out.println(i + "/" + j + " .");
            } else {
                System.out.print(i + "/" + j + " + ");
            }
        }
        System.out.println("Soma = " + soma);
    }

}
