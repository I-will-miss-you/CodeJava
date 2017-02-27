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
public class Exercicio10 {

    /*
     * Faça um programa que receba dois números inteiros e gere os
     * números inteiros que estão no intervalo compreendido por eles.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Valor de início: ");
        int ini = scan.nextInt();
        System.out.println("Valor de fim: ");
        int fim = scan.nextInt();
        
        for (int i = ini; i <= fim; i++) {
            System.out.println(i);
        }
    }
    
}
