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
public class Exercicio3 {

    /*
     * Capture do teclado valores para preenchimento de uma matriz M
     * 3x3. Após a captura imprima a matriz criada e encontre a
     * quantidade de números pares, a quantidade de números ímpares.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lin = 3, col = 3;
        int[][] matrix = new int[lin][col];
        int qtdPar = 0, qtdImpar = 0;

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Valor [" + i + "][" + j + "] = ");
                matrix[i][j] = scan.nextInt();
                if (matrix[i][j] % 2 == 0) {
                    qtdPar++;
                } else {
                    qtdImpar++;
                }
            }
        }

        System.out.println("\nMATRIX:");
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < col; j++) {
                System.out.print(" " + matrix1[j]);
            }
            System.out.println("");
        }

           System.out.println("Quantidade de números pares = "+qtdPar);
           System.out.println("Quantidade de números impares = "+qtdImpar);
    }

}
