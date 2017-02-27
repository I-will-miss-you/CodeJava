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
public class Exercicio2 {

    /** Exercicio 2
     * Faça um Programa que peça um número e então mostre a
     * mensagem O número informado foi [número].
     */
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        
        System.out.println("Insira um número inteiro:");
        int num = scan.nextInt();
        System.out.println("Número inserido: " + num);
    }
    
}
