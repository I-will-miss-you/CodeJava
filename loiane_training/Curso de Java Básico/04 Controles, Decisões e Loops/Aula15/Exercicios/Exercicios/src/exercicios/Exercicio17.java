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
public class Exercicio17 {

    /* Exercicio 17
     * Faça um Programa que peça um número correspondente a um
     * determinado ano e em seguida informe se este ano é ou não bissexto.
     */
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o ano");
        int ano = scan.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("É bissexto.");
        } else {
            System.out.println("Não é bissexto.");
        }   
    }
    
}
