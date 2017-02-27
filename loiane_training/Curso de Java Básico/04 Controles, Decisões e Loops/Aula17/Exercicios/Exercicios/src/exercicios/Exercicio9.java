/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio9 {

    /**
     * Faça um programa que imprima na tela apenas os números ímpares entre 1 e
     * 50.
     */
    public static void main(String[] args) {

        for (int i = 1; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
