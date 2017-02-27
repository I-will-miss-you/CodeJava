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
public class Exercicio1 {

    /*
     * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 
     * 0-9. Após isso determine o maior número da matriz e a sua posição
     * (linha, coluna).
     */
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        Random rand = new Random();

        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[j] = rand.nextInt(10);
            }
        }

        int maior = 0;
        int lin = 0;
        int col = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maior < matrix[i][j]) {
                    maior = matrix[i][j];
                    lin = i;
                    col = j;
                }
            }
        }

        System.out.println("MATRIX:");
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(" " + matrix1[j]);
            }
            System.out.println("");
        }
        System.out.println("Maior = " + maior);
        System.out.println("Linha = " + lin);
        System.out.println("Coluna = " + col);

    }

}
