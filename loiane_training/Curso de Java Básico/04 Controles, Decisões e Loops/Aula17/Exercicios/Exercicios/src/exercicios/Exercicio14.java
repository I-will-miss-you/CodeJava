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
public class Exercicio14 {

    /*
     * Faça um programa que peça 10 números inteiros, calcule e mostre a
     * quantidade de números pares e a quantidade de números impares.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num , pares = 0, impares = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Número(" + (i+1) +"): ");
            num = scan.nextInt();            
            
            if( num % 2 == 0){
                pares++;
            }else{
                impares++;
            }
            
        }
        
        System.out.println("Némros pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }
    
}
