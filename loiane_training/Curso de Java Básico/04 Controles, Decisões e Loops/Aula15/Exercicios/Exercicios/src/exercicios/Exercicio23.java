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
public class Exercicio23 {

    /* Exercicio 23
     * O Hipermercado Tabajara está com uma promoção de carnes que é
     * imperdível. Confira:
     * o Até 5 Kg Acima de 5 Kg
     * o File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
     * o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
     * o Picanha R$ 6,90 por Kg R$ 7,80 por Kg
     * Para atender a todos os clientes, cada cliente poderá levar
     * apenas um dos tipos de carne da promoção, porém não há
     * limites para a quantidade de carne por cliente. Se compra for
     * feita no cartão Tabajara o cliente receberá ainda um desconto
     * de 5% sobre o total a compra. Escreva um programa que peça
     * o tipo e a quantidade de carne comprada pelo usuário e gere
     * um cupom fiscal, contendo as informações da compra: tipo e
     * quantidade de carne, preço total, tipo de pagamento, valor do
     * desconto e valor a pagar.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tipo da carne:");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int tipo = scan.nextInt();

        System.out.println("Quantidade (kg):");
        double qtd = scan.nextDouble();

        double precoKg = 0;
        switch (tipo) {
            case 1:
                System.out.println(qtd + "kg - File Duplo");
                if (qtd < 5) {
                    precoKg = 4.9;
                } else {
                    precoKg = 5.8;
                }
                break;
            case 2:
                System.out.println(qtd + "kg - Alcatra");
                if (qtd < 5) {
                    precoKg = 5.9;
                } else {
                    precoKg = 6.8;
                }
                break;
            case 3:
                System.out.println(qtd + "kg - Picanha");
                if (qtd < 5) {
                    precoKg = 6.9;
                } else {
                    precoKg = 7.8;
                }
                break;
                default:
                    System.out.println("Erro - Não existe este tipo de carne...");
                    System.exit(0);
        }

        double total = qtd * precoKg;
        System.out.println(qtd + "kg * " + precoKg + " = " + total);

        System.out.println("Compra no cartão? digite 1 para sim:");
        int cartao = scan.nextInt();

        if (cartao == 1) {
            double desconto = total * 0.05;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar: " + (total - desconto));
        } else {
            System.out.println("Valor a pagar: " + total);
        }
    }
}
