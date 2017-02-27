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
public class Exercicio36 {

    /*
     * Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que
     * calcule o valor de H com N termos.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        double soma = 0;
        System.out.print("Informe o termo N= ");
        n = scan.nextInt();
        System.out.print("H = ");
        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
            if (i == n) {
                System.out.println("1/" + i + " = " + soma);
            } else {
                System.out.print("1/" + i + " + ");
            }
        }

    }

}
