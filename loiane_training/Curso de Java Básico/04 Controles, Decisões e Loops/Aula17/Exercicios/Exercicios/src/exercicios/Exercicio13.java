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

    /*
     * Faça um programa que peça dois números, base e expoente, calcule e
     * mostre o primeiro número elevado ao segundo número. Não utilize a
     * função de potência da linguagem.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Base:");
        double base = scan.nextDouble();
        System.out.print("Potência: ");
        int pot = scan.nextInt();

        double resultado = 1;
        for (int i = 0; i < pot; i++) {
            resultado *= base;
        }
        System.out.println("Resultado:" + resultado);
    }

}
