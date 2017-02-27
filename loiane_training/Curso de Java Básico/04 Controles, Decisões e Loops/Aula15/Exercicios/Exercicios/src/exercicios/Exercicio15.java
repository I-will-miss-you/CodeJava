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
public class Exercicio15 {

    /* Exercicio 15
     * Faça um Programa que peça os 3 lados de um triângulo. O programa
     * deverá informar se os valores podem ser um triângulo. Indique, caso
     * os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
     * escaleno.
     * o Dicas:
     * o Três lados formam um triângulo quando a soma de quaisquer
     * dois lados for maior que o terceiro;
     * o Triângulo Equilátero: três lados iguais;
     * o Triângulo Isósceles: quaisquer dois lados iguais;
     * o Triângulo Escaleno: três lados diferentes;
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tamanho do lado A: ");
        double ladoA = input.nextDouble();
        System.out.print("Tamanho do lado B: ");
        double ladoB = input.nextDouble();
        System.out.print("Tamanho do lado C: ");
        double ladoC = input.nextDouble();
        
        double ladoAB = ladoA + ladoB;
        double ladoBC = ladoB + ladoC;
        double ladoAC = ladoA + ladoC;
        
        if(ladoC < ladoAB && ladoB < ladoAC && ladoA < ladoBC){
            if(ladoA == ladoB && ladoA == ladoC){
                System.out.println("Triângulo Equilátero.");
            }else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
                System.out.println("Triângulo Isósceles.");
            }else{
                System.out.println("Triângulo Escaleno.");
            }
        }else{
            System.out.println("Não é triângulo...");
        }
        
    }
    
}
