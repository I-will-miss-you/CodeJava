/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author fonse
 */
public class Exercicio14 {

    /* Exercicio 14
     * Faça um programa que peça o tamanho de um arquivo para download
     * (em MB) e a velocidade de um link de Internet (em Mbps), calcule e
     * informe o tempo aproximado de download do arquivo usando este link
     * (em minutos).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Tamanho do arquivo em MB: ");
        double tamArquivo = scan.nextDouble();
        
        System.out.println("Velocidade do link em Mbps");
        double velInternet = scan.nextDouble();
        
        double tempo = tamArquivo / velInternet;

        System.out.println("Tempo de download: " + tempo);
    }
    
}
