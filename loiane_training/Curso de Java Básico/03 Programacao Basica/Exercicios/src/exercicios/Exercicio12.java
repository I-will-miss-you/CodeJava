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
public class Exercicio12 {

    /* Exercicio 12
     * Tendo como dados de entrada a altura de uma pessoa, construa um
     * algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
     * (72.7*altura) - 58
     */
    public static void main(String[] args) {
        System.out.print("Informe a sua altura (em metros): ");
        double altura = new Scanner(System.in).nextFloat();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Peso ideal = " + pesoIdeal);
    }
    
}
