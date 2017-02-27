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
public class Exercicio25 {

    /*
     * O Sr. Manoel Joaquim expandiu seus negócios para além dos
     * negócios de 1,99 e agora possui uma loja de conveniências. Faça um
     * programa que implemente uma caixa registradora rudimentar. O
     * programa deverá receber um número desconhecido de valores
     * referentes aos preços das mercadorias. Um valor zero deve ser
     * informado pelo operador para indicar o final da compra. O programa
     * deve então mostrar o total da compra e perguntar o valor em dinheiro
     * que o cliente forneceu, para então calcular e mostrar o valor do troco.
     * Após esta operação, o programa deverá voltar ao ponto inicial, para
     * registrar a próxima compra. A saída deve ser conforme o exemplo
     * abaixo:
     * o Lojas Tabajara
     * o Produto 1: R$ 2.20
     * o Produto 2: R$ 5.80
     * o Produto 3: R$ 0
     * o Total: R$ 9.00
     * o Dinheiro: R$ 20.00
     * o Troco: R$ 11.00
     * o ...
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean cont = true;

        do {
            System.out.println("\n\nLojas Tabajara");
            double total = 0, valor = -1;

            for (int i = 0; valor != 0; i++) {
                System.out.print("Produto" + (i + 1) + ": R$ ");
                valor = scan.nextDouble();
                total += valor;
            }
            System.out.println("Total: R$ " + total);
            System.out.print("Dinheiro: R$ ");
            double dinheiro = scan.nextDouble();
            System.out.println("Troco: R$ " + (dinheiro - total));

            System.out.print("Nova compra? S(sim)|N(não): ");
            cont = scan.next().equalsIgnoreCase("s");
        } while (cont);

    }

}
