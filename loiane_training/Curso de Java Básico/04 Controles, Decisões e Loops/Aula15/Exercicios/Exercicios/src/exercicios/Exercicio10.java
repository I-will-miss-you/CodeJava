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

    /* Exercicio 10
     * Faça um Programa que pergunte em que turno você estuda. Peça
     * para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
     * mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
     * Inválido!", conforme o caso.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Em que turno você estuda (M-matutino ou V-Vespertino ou N- Noturno): ");
        String turno = input.next();

        switch (turno) {
            case "m":
            case "M":
                System.out.println("Bom Dia!");
                break;
            case "v":
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "n":
            case "N":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
        }
    }

}
