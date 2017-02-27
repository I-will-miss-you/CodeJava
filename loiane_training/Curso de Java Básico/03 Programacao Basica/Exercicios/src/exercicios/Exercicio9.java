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

    /**Exercicio 9
     * Faça um Programa que peça a temperatura em graus Farenheit,
     * transforme e mostre a temperatura em graus Celsius.
     * o C = (5 * (F-32) / 9).
     */
    public static void main(String[] args) {
        System.out.print("Teperatura em Farenheit = ");
        float tempF = new Scanner(System.in).nextFloat();
        int tempC = (int)(5 * (tempF -32) / 9);
        System.out.println("Teperatura em Celsius = " + tempC + "ºC");
    }
    
}
