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
public class Exercicio15 {

    /*
     * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
     * que defina o percentual de elementos pares e ímpares,
     * respectivamente, armazenados neste vetor.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int qtdPares = 0 , qtdImpares = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Valor " + (i + 1) + " = ");
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                qtdPares++;
            }
        }
        qtdImpares = a.length - qtdPares;
        
        System.out.println("A percentagem de números pares = " + ((double)qtdPares/a.length)*100 + "%");
        System.out.println("A percentagem de números ímpares = " + ((double)qtdImpares/a.length)*100 + "%");

    }

}
