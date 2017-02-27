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
public class Exercicio13 {

    /* Exercicio 13
     * Faça um Programa que leia um número e exiba o dia correspondente
     * da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
     * aparecer valor inválido.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um dia da semana (1-7):");
        int diaSemana = input.nextInt();
        
        switch(diaSemana){
            case 1:System.out.println("Domingo");break;
            case 2:System.out.println("Segunda");break;
            case 3:System.out.println("Terca");break;
            case 4:System.out.println("Quarta");break;
            case 5:System.out.println("Quinta");break;
            case 6:System.out.println("Sexta");break;
            case 7:System.out.println("Sábado");break;
            default:System.out.println("Dia da semana inválido.");
        }
    }
    
}
