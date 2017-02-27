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
public class Exercicio29 {

    /*
     * Encontrar números primos é uma tarefa difícil. Faça um programa que
     * gera uma lista dos números primos existentes entre 1 e um número
     * inteiro informado pelo usuário.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Até que valor deseja saber os números primos: ");
        int max = scan.nextInt();
        boolean primo;
        for (int i = 1; i < max; i++) {
            primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(i);
            }
        }
    }

}
