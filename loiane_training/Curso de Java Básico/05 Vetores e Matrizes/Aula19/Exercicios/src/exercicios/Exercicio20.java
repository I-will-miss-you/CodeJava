/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Code36u5r60
 */
public class Exercicio20 {

    /**
     * Implementar um programa que obtenha a cotação do dólar (U$) em
     * relação ao real (R$) e a seguir armazene em vetor A com 20
     * elementos as seguintes conversões:
     * A[i] = cotação do dolar * i, para todo i variando de 1 até 20
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        System.out.print("Informe a cotação do dólar: ");
        cotacao = scan.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i + 1);
        }
        
        System.out.println("Conversões:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(" $" + (i+1) + " = R$" + vetorA[i]);
        }

    }

}
