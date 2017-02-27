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
public class Exercicio11 {

    /*
     * Faça um Programa que peça 2 números inteiros e um número real. Calcule e
     * mostre: 
     * a. o produto do dobro do primeiro com metade do segundo .
     * b. a soma do triplo do primeiro com o terceiro. 
     * c. o terceiro elevado ao cubo.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserir um valor inteiro: ");
        int val1 = scan.nextInt();
        System.out.print("Inserir outro valor inteiro: ");
        int val2 = scan.nextInt();
        System.out.print("Inserir um valor real: ");
        double val3 = scan.nextDouble();

        int resultado1 = (val1 * 2) * (val2 / 2);
        double resultado2 = (val1 * 3) + val3;
        double resultado3 = Math.pow(val3, 3);

        System.out.println("Resultado 1 = " + resultado1);
        System.out.println("Resultado 2 = " + resultado2);
        System.out.println("Resultado 3 = " + resultado3);
    }

}
