/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author fonse
 */
public class Exercicio5 {

    /*
     * Altere o programa anterior permitindo ao usuário informar as
     * populações e as taxas de crescimento iniciais. Valide a entrada e
     * permita repetir a operação.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int popA;
        int popB;
        double taxaA;
        double taxaB;
        int contador = 0;
        boolean erro;
        boolean cont;

        do {
            do {
                System.out.println("População A: ");
                popA = scan.nextInt();
                erro = popA < 0;
                if (erro) {
                    System.out.println("O valor têm de ser superior a zero.");
                }
            } while (erro);

            do {
                System.out.println("Taxa de crescimento da população A ]0 , 100]: ");
                taxaA = scan.nextDouble()/ 100;
                erro = taxaA <= 0 || taxaA > 1;
                if (erro) {
                    System.out.println("O valor têm de ser entre ]0 , 100].");
                }
            } while (erro);

            do {
                System.out.println("População B: ");
                popB = scan.nextInt();
                erro = popB <= 0;
                if (erro) {
                    System.out.println("O valor têm de ser superior a zero...");
                }
            } while (erro);

            do {
                System.out.println("Taxa de crescimento da população B ]0 , 100]: ");
                taxaB = scan.nextDouble()/ 100;
                erro = taxaB <= 0 || taxaB > 1;
                if (erro) {
                    System.out.println("O valor têm de ser entre ]0 , 100].");
                }
            } while (erro);

            while (popA < popB) {
                popA += (int) popA * taxaA;
                popB += (int) popB * taxaB;
                contador++;
            }

            System.out.println("Anos necessários: " + contador);
            System.out.println("População de A: " + popA);
            System.out.println("População de B: " + popB);
            System.out.println("Digite 'S' para continuar...");
            String ch = scan.next();
            cont = ch.equalsIgnoreCase("S");
        } while (cont);

    }

}
