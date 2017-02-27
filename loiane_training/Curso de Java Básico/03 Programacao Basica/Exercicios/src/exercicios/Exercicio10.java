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
public class Exercicio10 {

    /**Exercicio 10
     * Faça um Programa que peça a temperatura em graus Celsius,
     * transforme e mostre em graus Farenheit.
     */
    public static void main(String[] args) {
        System.out.print("Teperatura em Celsius = ");
        int tempC = new Scanner(System.in).nextInt();
        float tempF = (float) ((tempC * 1.8) + 32);
        System.out.println("Teperatura em Farenheit = " + tempF + " F");
    }
    
}
