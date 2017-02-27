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
public class Exercicio19 {

    /* Exercicio 19
     * Faça um Programa que leia 2 números e em seguida pergunte ao
     * usuário qual operação ele deseja realizar. O resultado da operação
     * deve ser acompanhado de uma frase que diga se o número é:
     * - par ou ímpar;
     * a. positivo ou negativo;
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Número 1: ");
        double num1 = input.nextDouble();
        System.out.println("Número 2: ");
        double num2 = input.nextDouble();

        System.out.println("Operação ( + , - , / , * )");
        String op = input.next();

        double resultado = 0;
        boolean flag = true;

        switch (op) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            default:
                System.out.println("Operação inválida.");
                flag = false;
        }
        
        if(flag){
            System.out.println("Resultado: " + resultado);
            
            if(resultado >= 0){
                System.out.println("Positivo");
            }else{
                System.out.println("Negativo");
            }
            
            if(resultado % 2 == 0){
                System.out.println("Par");
            }else{
                System.out.println("Ímpar");
            }
        }
    }
}
