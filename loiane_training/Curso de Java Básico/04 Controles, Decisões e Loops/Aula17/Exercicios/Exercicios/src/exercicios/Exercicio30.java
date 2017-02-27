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
public class Exercicio30 {

    /*
     * Desenvolva um programa que faça a tabuada de um número qualquer
     * inteiro que será digitado pelo usuário, mas a tabuada não deve
     * necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
     * devem ser informados também pelo usuário, conforme exemplo
     * abaixo:
     * o Montar a tabuada de: 5
     * o Começar por: 4
     * o Terminar em: 7
     * 
     * o Vou montar a tabuada de 5 começando em 4 e terminando em 7:
     * o 5 X 4 = 20
     * o 5 X 5 = 25
     * o 5 X 6 = 30
     * o 5 X 7 = 35
     * 
     * Obs: Você deve verificar se o usuário não digitou o final menor
     * que o inicial.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Montar a tabuada de: ");
        int tabuada = scan.nextInt();

        System.out.print("Começar por: ");
        int ini = scan.nextInt();

        System.out.print("Terminar em: ");
        int fim = scan.nextInt();

        if (fim < ini) {
            System.out.println("O valor de \"inicio\" têm de ser menor que o valor de \"fim\".\n"
                    +"Por isso, tomei a liberdade de trocar os números...");
            int aux = fim;
            fim = ini;
            ini = aux;
        }
        System.out.println("\nVou montar a tabuada de " + tabuada + " começando em "
                + ini + " e terminando em " + fim + ":");

        for (int i = ini; i <= fim; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }

    }

}
