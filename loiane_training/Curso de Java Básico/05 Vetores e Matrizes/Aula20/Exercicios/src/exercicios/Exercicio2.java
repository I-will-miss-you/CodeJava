/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Random;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio2 {

    /*
     * Gere e imprima uma matriz M 10x10 com valores aleatórios entre
     * 0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
     * qual é o maior e o menor valor da coluna 7.
     */
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        Random rand = new Random();

        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[j] = rand.nextInt(10);
            }
        }

        int maiorL5 = 0, menorL5 = 9;
        for (int i = 0; i < matrix[5].length; i++) {
            if (maiorL5 < matrix[5][i]) {
                maiorL5 = matrix[5][i];
            }
            if (menorL5 > matrix[5][i]) {
                menorL5 = matrix[5][i];
            }
        }

        int maiorC7 = 0, menorC7 = 9;
        for (int[] matrix1 : matrix) {
            if (maiorC7 < matrix1[7]) {
                maiorC7 = matrix1[7];
            }
            if (menorC7 > matrix1[7]) {
                menorC7 = matrix1[7];
            }
        }

        System.out.println("MATRIX:");
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(" " + matrix1[j]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Maior valor da linha 5 = " + maiorL5);
        System.out.println("Menor valor da linha 5 = " + menorL5);
        System.out.println("Maior valor da coluna 7 = " + maiorC7);
        System.out.println("Menor valor da coluna 7 = " + menorC7);
    }

}
