/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Code36u4r60
 */
public class Arrays {

    public static void main(String[] args) {

        double tempDia001 = 31.3;
        double tempDia002 = 32.0;
        double tempDia003 = 33.7;
        double tempDia004 = 34.0;
        double tempDia005 = 33.3;

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.3;

        System.out.println("Teperatura do dia 1: " + temperaturas[0]);
        System.out.println("Teperatura do dia 3: " + temperaturas[3]);

        System.out.println("Tamanho do array: " + temperaturas.length);
        /*
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Teperaturas do dia " + (i + 1) + ": " + temperaturas[i]);
        }
        */
        
        for (double temperatura : temperaturas) {
            System.out.println(temperatura);
        }
    }

}
