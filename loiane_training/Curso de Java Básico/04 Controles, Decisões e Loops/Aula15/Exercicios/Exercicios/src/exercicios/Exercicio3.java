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

    /* Exercicio 3
     * Faça um Programa que verifique se uma letra digitada é "F" ou "M".
     * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Seu sexo: Masculo - 'M' ou Femenino - 'F' ?");
        String sexo = input.next();
        
        if(sexo.equalsIgnoreCase("f")){
            System.out.println("Femenino.");
        }else if(sexo.equalsIgnoreCase("m")){
            System.out.println("Masculino.");
        }else{
            System.out.println("Sexo indefenido.");
        }

    }
    
}
