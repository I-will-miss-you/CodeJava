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
public class Exercicio1 {

    /* Exercicio 1
     * Faça um Programa que peça dois números e imprima o maior deles.
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int val1 = scan.nextInt();
        System.out.print("Insira o segundo valor: ");
        int val2 = scan.nextInt();

        int maior;
        //maior = (val1 > val2) ? val1 : val2;
        if (val1 > val2) {
            maior = val1;
        } else {
            maior = val2;
        }

        System.out.println("O maior valor inserido foi : " + maior);
    }

}
