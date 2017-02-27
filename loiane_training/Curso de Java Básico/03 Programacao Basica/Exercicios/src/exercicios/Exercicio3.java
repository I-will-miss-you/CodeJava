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

    /* Exercicio 3
    * Faça um Programa que peça dois números e imprima a soma.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira dois números inteiros.");
        System.out.println("Número 1: ");
        int num1 = scan.nextInt();
        System.out.println("Número 2: ");
        int num2 = scan.nextInt();
        System.out.println(num1 + " " + num2 + " = " + (num1+num2));
    }
    
}
