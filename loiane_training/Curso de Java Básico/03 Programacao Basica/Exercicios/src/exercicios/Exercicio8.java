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

    /*Exercicio
     * Faça um Programa que pergunte quanto você ganha por hora e o
     * número de horas trabalhadas no mês. Calcule e mostre o total do seu
     * salário no referido mês.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Valor por hora = ");
        float precoHora = scan.nextFloat();
        System.out.print("Numero de horas de trabalho por mes = ");
        int numHoras = scan.nextInt();
        
        System.out.println("Vencimento mensal = " + (precoHora * numHoras));
    }
    
}
