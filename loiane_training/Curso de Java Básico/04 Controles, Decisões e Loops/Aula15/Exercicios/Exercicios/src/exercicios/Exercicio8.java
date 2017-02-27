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
public class Exercicio8 {

    /* Exercicio 8
     * Faça um programa que pergunte o preço de três produtos e informe
     * qual produto você deve comprar, sabendo que a decisão é sempre
     * pelo mais barato.
     */
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        System.out.println("Preço do produto 1:");
        double precoP1 = input.nextDouble();
        System.out.println("Preço do produto 2:");
        double precoP2 = input.nextDouble();
        System.out.println("Preço do produto 3:");
        double precoP3 = input.nextDouble();
        
        if(precoP1 <= precoP2 && precoP1 <= precoP3){
            System.out.println("Compre o produto 1.");
        }else if(precoP2 <= precoP1 && precoP2 <= precoP3){
            System.out.println("Compre o produto 2.");
        }else{
            System.out.println("Compre o produto 3.");
        }
    }
    
}
