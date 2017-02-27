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
     * Faça um programa que leia 5 números e informe o maior número.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior = Integer.MIN_VALUE, num;

        for (int i = 0; i < 5; i++) {
            System.out.print("Número(" + (i + 1) + ") :");
            num = scan.nextInt();
            if (maior < num) {
                maior = num;
            }
        }

        System.out.println("Maior número inserido: " + maior);
    }

}
