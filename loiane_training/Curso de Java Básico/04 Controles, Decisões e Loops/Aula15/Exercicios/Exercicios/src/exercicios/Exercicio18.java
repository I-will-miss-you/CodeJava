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
public class Exercicio18 {

    /* Exercicio 18
     * Faça um Programa que peça um número inteiro e determine se ele é
     * par ou impar. Dica: utilize o operador módulo (resto da divisão).
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("Par.");
        } else {
            System.out.println("Ímpar.");
        } 
    }    
}
