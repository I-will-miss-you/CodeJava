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
public class Exercicio28 {

    /*
     * Os números primos possuem várias aplicações dentro da
     * Computação, por exemplo na Criptografia. Um número primo é aquele
     * que é divisível apenas por um e por ele mesmo. Faça um programa
     * que peça um número inteiro e determine se ele é ou não um número
     * primo.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número: ");
        int num = scan.nextInt();
        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
    }

}
