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
public class Exercicio36 {

    /*
     * Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que
     * cada elemento do vetor A é formado pela potência de base 2 elevado
     * ao expoente igual a posição do respectivo elemento, ou seja:
     * A[i] = 2^i. Sugestão int A[11];
     */
    public static void main(String[] args) {
        double[] vetorA = new double[11];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Math.pow(2, i);
        }

        System.out.println("\n Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("A[" + i + "] = " + vetorA[i]);
        }
    }

}
