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
public class Exercicio20 {

    /*
     * Faça um programa que peça para n pessoas a sua idade, ao final o
     * programa devera verificar se a média de idade da turma varia entre 0 e
     * 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
     * ou idosa, conforme a média calculada.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas idades vão ser inseridas: ");
        int nIdades = scan.nextInt();

        int soma = 0, media;

        for (int i = 0; i < nIdades; i++) {
            System.out.print("Idade(" + (i + 1) + "): ");
            soma += scan.nextInt();
        }
        media = soma / nIdades;
        
        System.out.println("Média de idades = " + media);
        if(media >= 0 && media <=25)
        {
            System.out.println("Turma jovem.");
        }else if(media > 25 && media <= 60){
            System.out.println("Turma adulta.");
        }else if(media > 60){
            System.out.println("Turma idosa");
        }else{
            System.out.println("Erro - Algo esta mal");
        }
    }

}
