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

    /*Exercicio 7
     * Faça um Programa que leia três números e mostre o maior e o menor
     * deles.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Valor 1:");
        double val1 = input.nextDouble();
        System.out.println("Valor 2:");
        double val2 = input.nextDouble();
        System.out.println("Valor 3:");
        double val3 = input.nextDouble();
        
        double maior = val1;
        double menor = val1;
        
        if(maior < val2) maior = val2;
        if(maior < val3) maior = val3;
        
        if(menor > val2) menor = val2;
        if(menor > val3) menor = val3;
        
        System.out.println("O maior valor = " + maior);
        System.out.println("O menor valor = " + menor);
        
           
    }

}
