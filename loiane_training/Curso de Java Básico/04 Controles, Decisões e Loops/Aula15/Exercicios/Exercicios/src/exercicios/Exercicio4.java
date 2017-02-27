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
public class Exercicio4 {

    /* Exercicio 4
     * Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira uma letra: ");
        String letra = input.next();

        if (letra.length() > 1) {
            System.out.println("Insira uma só letra...");
        } else if (letra.charAt(0) >= '0' && letra.charAt(0) <= '9' ){
            System.out.println("Foi inserido um número...");
        }else {
            String ch = letra.toLowerCase();
            switch (ch) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println("A letra inserida é vogal.");
                    break;
                default:
                    System.out.println("A letra inserida é consoante.");
            }
        }

    }

}
