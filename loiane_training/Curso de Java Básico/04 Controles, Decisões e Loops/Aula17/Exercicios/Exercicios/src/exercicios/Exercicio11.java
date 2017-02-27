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
public class Exercicio11 {

    /*
     * Altere o programa anterior para mostrar no final a soma dos números.
     */
    public static void main(String[] args) {
               
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        
        System.out.println("Valor de início: ");
        int ini = scan.nextInt();
        System.out.println("Valor de fim: ");
        int fim = scan.nextInt();
        
        for (int i = ini; i <= fim; i++) {
            soma += i;
        }
        System.out.println("Soma: " + soma);
    }
    
}
