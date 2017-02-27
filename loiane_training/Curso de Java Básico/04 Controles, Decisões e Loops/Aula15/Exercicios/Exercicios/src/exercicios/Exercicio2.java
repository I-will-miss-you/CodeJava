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
public class Exercicio2 {

    /* Exercicio 2
     * Faça um Programa que peça um valor e mostre na tela se o valor é
     * positivo ou negativo.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira um valor: ");
        double val = scan.nextDouble();
        
        if(val < 0){
            System.out.println("O valor inserido é negativo.");
        }else if(val > 0){
            System.out.println("O valor inserido é positivo.");
        }else{
            System.out.println("O valor inserido é nulo.");
        }
    }
    
}
