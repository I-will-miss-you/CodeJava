/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author Code36u4r60      
 */
public class Exercicio6 {

    /*
     * Faça um programa que imprima na tela os números de 1 a 20, um
     * abaixo do outro. Depois modifique o programa para que ele mostre os
     * números um ao lado do outro.
     */
    public static void main(String[] args) {
       
        for (int i = 0; i < 20; i++) {
            System.out.println(i+1);
        }
        
        for (int i = 0; i < 20; i++) {
            System.out.print(i+1 + " ");
        }
        System.out.println("");
    }
    
}
