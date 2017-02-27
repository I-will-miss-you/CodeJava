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
public class Exercicio4 {

    /**
     * Exercicio Faça um Programa que peça as 4 notas bimestrais e mostre a
     * média.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserir 4 notas:");
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        float nota3 = scan.nextFloat();
        float nota4 = scan.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("Media final: " + media);

    }

}
