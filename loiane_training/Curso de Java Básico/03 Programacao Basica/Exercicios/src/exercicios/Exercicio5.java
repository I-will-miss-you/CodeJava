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
public class Exercicio5 {

    /* Exercicio 5
     * Faça um Programa que converta metros para centímetros.
     */
    public static void main(String[] args) {
        System.out.println("Convert mt em cm:");
        System.out.print("Valor em mt = ");
        float mt = new Scanner(System.in).nextFloat();
        System.out.println("Valor em cm = " + (mt * 100));
    }

}
