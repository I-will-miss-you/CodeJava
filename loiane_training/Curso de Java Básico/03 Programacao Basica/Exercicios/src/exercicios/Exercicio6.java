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
public class Exercicio6 {

    /* Exercicio 6
    * Faça um Programa que peça o raio de um círculo, calcule e mostre
    * sua área.
     */
    public static void main(String[] args) {
        System.out.println("Informe o raio do circulo: ");
        float raio = new Scanner(System.in).nextFloat();

        double area = Math.PI * raio * raio;

        System.out.println("Area do circulo = " + area);
    }

}
