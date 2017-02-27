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
public class Exercicio7 {

    /* Exercicio 7
     * Faça um Programa que calcule a área de um quadrado, em seguida
     * mostre o dobro desta área para o usuário.
     */
    public static void main(String[] args) {
        System.out.print("Informe o comprimento de um lados: ");
        float lado = new Scanner(System.in).nextFloat();
        
        float area = lado * lado;
        
        System.out.println("Dobro da area do quadrado = " + (area * 2));
    }
    
}
