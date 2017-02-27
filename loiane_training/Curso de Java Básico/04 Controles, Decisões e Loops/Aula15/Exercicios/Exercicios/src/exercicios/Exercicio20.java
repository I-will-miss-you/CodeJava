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
public class Exercicio20 {

    /* Exercicio 20
     * Faça um programa que faça 5 perguntas para uma pessoa sobre um
     * crime. As perguntas são:
     * a. "Telefonou para a vítima?"
     * b. "Esteve no local do crime?"
     * c. "Mora perto da vítima?"
     * d. "Devia para a vítima?"
     * f. "Já trabalhou com a vítima?" 
     * O programa deve no final emitir uma classificação sobre 
     * a participação da pessoa no crime. Se a pessoa responder 
     * positivamente a 2 questões ela deve ser classificada como 
     * "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
     * Caso contrário, ele será classificado como "Inocente".
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("S(sim) ou N(não)");
        System.out.println("Telefonou para a vítima?");
        String resp1 = input.next();
        System.out.println("Esteve no local do crime?");
        String resp2 = input.next();
        System.out.println("Mora perto da vítima?");
        String resp3 = input.next();
        System.out.println("Devia para a vítima?");
        String resp4 = input.next();
        System.out.println("Já trabalhou com a vítima?");
        String resp5 = input.next();

        int contador = 0;
        if (resp1.equalsIgnoreCase("s")) {
            contador++;
        }
        if (resp2.equalsIgnoreCase("s")) {
            contador++;
        }
        if (resp3.equalsIgnoreCase("s")) {
            contador++;
        }
        if (resp4.equalsIgnoreCase("s")) {
            contador++;
        }
        if (resp5.equalsIgnoreCase("s")) {
            contador++;
        }

        switch (contador) {
            case 5:
                System.out.println("Assassino");
                break;
            case 4:
            case 3:
                System.out.println("Cúmplice");
                break;
            case 2:
                System.out.println("Suspeita");
                break;
            default:
                System.out.println("Inocente");
        }
    }

}
