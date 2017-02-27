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
public class Exercicio18 {

    /*
     * Ler um vetor A com 10 elementos inteiros correspondentes as idades
     * de um grupo de pessoas. Escreva um programa que determine e
     * escreva idades menor e idades maior idades e suas respectivas posições.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Idade[" + (i) + "] = ");
            idades[i] = scan.nextInt();
        }

        int maior = idades[0], idxMaior = 0, menor = idades[0], idxMenor = 0;
        for (int i = 1; i < idades.length; i++) {
            if (menor > idades[i]) {
                menor = idades[i];
                idxMenor = i;
            } else if (maior < idades[i]) {
                maior = idades[i];
                idxMaior = i;
            }
        }
        System.out.println("\n");
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Idade[" + (i) + "] = " + idades[i]);
        }

        System.out.println(" " + menor + " é a menor das idades e esta na posição " + idxMenor + " do vetor.");
        System.out.println(" " + maior + " é a maior das idades e esta na posição " + idxMaior + " do vetor.");
    }

}
