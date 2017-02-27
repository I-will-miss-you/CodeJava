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
public class Exercicio21 {

    /* Exercicio 21
     * Um posto está vendendo combustíveis com a seguinte tabela de
     * descontos:
     * . Álcool:
     * a. até 20 litros, desconto de 3% por litro
     * b. acima de 20 litros, desconto de 5% por litro
     * Gasolina:
     * c. até 20 litros, desconto de 4% por litro
     * d. acima de 20 litros, desconto de 6% por litro Escreva um
     * algoritmo que leia o número de litros vendidos, o tipo de
     * combustível (codificado da seguinte forma: A-álcool, Ggasolina),
     * calcule e imprima o valor a ser pago pelo cliente
     * sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
     * do litro do álcool é R$ 1,90.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Número de litros vendidos");
        int litros = scan.nextInt();
        System.out.println("Tipo de combustível (A - Álcool, G - gasolina)");
        String combust = scan.next();

        double total = 0;
        double desconto = 0;
        boolean erro = false;

        if (combust.equalsIgnoreCase("A")) {
            double preco = 1.90;
            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
            total = preco * litros;
            total -= total * desconto;
        } else if (combust.equalsIgnoreCase("G")) {
            double preco = 2.50;
            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
            total = preco * litros;
            total -= total * desconto;
        } else {
            System.out.println("Erro no tipo de combustivel...");
            erro = true;
        }

        if (!erro) {
            System.out.println("Valor a pagar: " + total);
        }
    }

}
