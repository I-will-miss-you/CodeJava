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
public class Exercicio9 {

    /* Exercicio 9
     * Faça um Programa que leia três números e mostre-os em ordem
     * decrescente.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Valor 1:");
        int val1 = input.nextInt();
        System.out.println("Valor 2:");
        int val2 = input.nextInt();
        System.out.println("Valor 3:");
        int val3 = input.nextInt();

        if (val1 <= val2 && val1 <= val2 && val2 <= val3) {
            System.out.println("Ordem crescente: " + val1 + " -> " + val2 + " -> " + val3);
        } else if (val1 <= val2 && val1 <= val3 && val3 <= val2) {
            System.out.println("Ordem crescente: " + val1 + " -> " + val3 + " -> " + val2);
        } else if (val2 <= val1 && val2 <= val3 && val1 <= val3) {
            System.out.println("Ordem crescente: " + val2 + " -> " + val1 + " -> " + val3);
        } else if (val2 <= val1 && val2 <= val3 && val3 <= val1) {
            System.out.println("Ordem crescente: " + val2 + " -> " + val3 + " -> " + val1);
        } else if (val3 <= val1 && val3 <= val2 && val1 <= val2) {
            System.out.println("Ordem crescente: " + val3 + " -> " + val1 + " -> " + val2);
        } else {
            System.out.println("Ordem crescente: " + val3 + " -> " + val2 + " -> " + val1);
        }
    }

}
