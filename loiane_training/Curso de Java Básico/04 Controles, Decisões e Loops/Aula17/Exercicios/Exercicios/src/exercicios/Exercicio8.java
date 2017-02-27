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
public class Exercicio8 {

    /**
     * Faça um programa que leia 5 números e informe a soma e a média
     * dos números.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, soma = 0;
        double media;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Número(" + (i + 1) + ") :");
            num = scan.nextInt();
            soma += num;
        }
        
        media = soma / 5.0;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
    
}
