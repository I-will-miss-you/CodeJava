/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriztridimensional;

/**
 *
 * @author Code36u4r60
 */
public class MatrizTridimensional {

    public static void main(String[] args) {

        int[][][] matrizTridimensional = new int[3][3][3];

        for (int i = 0; i < matrizTridimensional.length; i++) {
            for (int j = 0; j < matrizTridimensional[i].length; j++) {
                for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
                    System.out.println("i = " + i + " - j = " + j + " - k = " + k);
                    matrizTridimensional[i][j][k] = i + j + k;
                }
            }
        }

        int somaTotal = 0 , somaPares = 0 , somaImpares = 0;
        for (int[][] matrizTridimensional1 : matrizTridimensional) {
            for (int[] item : matrizTridimensional1) {
                for (int k = 0; k < item.length; k++) {
                    somaTotal += item[k];
                    if (item[k] % 2 == 0) {
                        somaPares += item[k];
                    } else {
                        somaImpares += item[k];
                    }
                }
            }
        }

        System.out.println("Soma Total = " + somaTotal);
        System.out.println("Soma dos Pares = " + somaPares);
        System.out.println("Soma dos Impares = " + somaImpares);
        
        
    }

}
