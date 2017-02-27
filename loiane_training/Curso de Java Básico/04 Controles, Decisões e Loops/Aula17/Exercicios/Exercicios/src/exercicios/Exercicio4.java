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
public class Exercicio4 {

    /*
     * Supondo que a população de um país A seja da ordem de 80000
     * habitantes com uma taxa anual de crescimento de 3% e que a
     * população de B seja 200000 habitantes com uma taxa de crescimento
     * de 1.5%. Faça um programa que calcule e escreva o número de anos
     * necessários para que a população do país A ultrapasse ou iguale a
     * população do país B, mantidas as taxas de crescimento.
     */
    public static void main(String[] args) {
        int popA = 80_000;
        int popB = 200_000;
        double taxaA = 0.03;
        double taxaB = 0.015;
        int contador = 0;
        
        while(popA < popB){
            popA += (int)popA*taxaA;
            popB += (int)popB*taxaB;
            contador++;
        }
        
        System.out.println("Anos necessários: " + contador);
        System.out.println("População de A: " + popA);
        System.out.println("População de B: " + popB);
    }
    
}
