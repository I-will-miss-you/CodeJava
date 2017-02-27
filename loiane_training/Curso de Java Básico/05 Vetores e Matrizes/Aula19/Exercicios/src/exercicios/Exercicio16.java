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
public class Exercicio16 {

    /*
     * Criar um vetor A com 10 elementos inteiros. Escrever um programa
     * que calcule e escreva: a) a soma de elementos armazenados neste
     * vetor que são inferiores a 15; b) a quantidade de elementos
     * armazenados no vetor que são iguais a 15; e c) a média dos
     * elementos armazenados no vetor que são superiores a 15.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int somaMenor = 0 , qtdIguais = 0 , somaMaior = 0 , qtdMaior = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Valor " + (i + 1) + " = ");
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 15) {
                somaMenor += a[i];
            }else if(a[i] == 15){
                qtdIguais++;
            }else{
                somaMaior += a[i];
                qtdMaior++;
            }
        }
        
        System.out.println("Soma dos elementos < 15 = " + somaMenor);
        System.out.println("Quantidade de números == 15 = " + qtdIguais);
        System.out.println("Média dos valores < 15 = " + (somaMaior / (double)qtdMaior));
        
    }

}
