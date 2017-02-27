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
public class Exercicio19 {

    /*
     * Faça um programa que calcule o mostre a média aritmética de N
     * notas.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Número de notas: ");
        int nNotas = scan.nextInt();

        double soma = 0, media;

        for (int i = 0; i < nNotas; i++) {
            System.out.print("Nota(" + (i + 1) + "):");
            soma += scan.nextDouble();
        }
        
        media = soma/nNotas;
        System.out.println("Média = " + media);
    }

}
