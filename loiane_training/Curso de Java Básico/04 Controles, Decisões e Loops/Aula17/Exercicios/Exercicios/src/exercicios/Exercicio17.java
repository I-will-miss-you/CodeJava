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
public class Exercicio17 {

    /*
     * Faça um programa que calcule o fatorial de um número inteiro
     * fornecido pelo usuário. Ex.: 5!=5.4.3.2.1 = 120
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Calcular o Fatorial de: ");
        int n = scan.nextInt();
        
        int fat = 1;
        System.out.print(n+"!=");
        for (int i = n; i > 0 ; i--) {
            System.out.print( i + " * ");
            fat *= i;
        }
        System.out.println("\b\b = " + fat);
    }
    
}
