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
public class Exercicio32 {

    /*
     * O cardápio de uma lanchonete é o seguinte:
     * o Especificação      Código      Preço
     * o Cachorro Quente    100         R$ 1,20
     * o Bauru Simples      101         R$ 1,30
     * o Bauru com ovo      102         R$ 1,50
     * o Hambúrguer         103         R$ 1,20
     * o Cheeseburguer      104         R$ 1,30
     * o Refrigerante       105         R$ 1,00
     * Faça um programa que leia o código dos itens pedidos e as
     * quantidades desejadas. Calcule e mostre o valor a ser pago por
     * item (preço * quantidade) e o total geral do pedido. Considere
     * que o cliente deve informar quando o pedido deve ser
     * encerrado.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigo, qtd;
        double valorPagar, precoUni, totalPagar = 0;
        boolean next = true;
        String fatura = "";

        System.out.println("Inicie o registo de produtos. Para sair digite no código o valor 0.");
        do {
            System.out.println("Codigo: ");
            codigo = scan.nextInt();

            switch (codigo) {
                case 0:
                    next = false;
                    break;
                case 100:
                    System.out.println("Quantidade: ");
                    qtd = scan.nextInt();
                    precoUni = 1.20;
                    valorPagar = precoUni * qtd;
                    totalPagar += valorPagar;
                    fatura += "Cachorro Quente (" + qtd + " * R$" + precoUni + ") = R$ " + valorPagar + " \n";
                    break;
                case 101:
                    System.out.println("Quantidade: ");
                    qtd = scan.nextInt();
                    precoUni = 1.30;
                    valorPagar = precoUni * qtd;
                    totalPagar += valorPagar;
                    fatura += "Bauru Simples (" + qtd + " * R$" + precoUni + ") = R$ " + valorPagar + " \n";
                    break;
                case 102:
                    System.out.println("Quantidade: ");
                    qtd = scan.nextInt();
                    precoUni = 1.50;
                    valorPagar = precoUni * qtd;
                    totalPagar += valorPagar;
                    fatura += "Bauru com ovo (" + qtd + " * R$" + precoUni + ") = R$ " + valorPagar + " \n";
                    break;
                case 103:
                    System.out.println("Quantidade: ");
                    qtd = scan.nextInt();
                    precoUni = 1.20;
                    valorPagar = precoUni * qtd;
                    totalPagar += valorPagar;
                    fatura += "Hambúrguer (" + qtd + " * R$" + precoUni + ") = R$ " + valorPagar + " \n";
                    break;
                case 104:
                    System.out.println("Quantidade: ");
                    qtd = scan.nextInt();
                    precoUni = 1.30;
                    valorPagar = precoUni * qtd;
                    totalPagar += valorPagar;
                    fatura += "Cheeseburguer (" + qtd + " * R$" + precoUni + ") = R$ " + valorPagar + " \n";
                    break;
                case 105:
                    System.out.println("Quantidade: ");
                    qtd = scan.nextInt();
                    precoUni = 1.00;
                    valorPagar = precoUni * qtd;
                    totalPagar += valorPagar;
                    fatura += "Refrigerante (" + qtd + " * R$" + precoUni + ") = R$ " + valorPagar + " \n";
                    break;
                default:
                    System.out.println("Código de produto inválido...");
            }
        } while (next);

        fatura += "Total a pagar = R$ " + totalPagar;
        System.out.println(fatura);
    }

}
