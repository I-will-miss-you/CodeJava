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
public class Exercicio12 {

    /**
     * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
     * qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
     * numero ele deseja ver a tabuada. A saída deve ser conforme o
     * exemplo abaixo:
     * o Tabuada de 5:
     * o 5 X 1 = 5
     * o 5 X 2 = 10
     * o ...
     * o 5 X 10 = 50
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Deseja saber a tabuada do: ");
        int num = scan.nextInt();
        
        System.out.println("Tabuada do " + num + ":");
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(" " + num + " x " + i + " = " + (i*num));
        }
    }
    
}
