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
public class Exercicio22 {

    /*
     * Faça um programa que calcule o valor total investido por um
     * colecionador em sua coleção de CDs e o valor médio gasto em cada
     * um deles. O usuário deverá informar a quantidade de CDs e o valor
     * para em cada um.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o número de CD's: ");
        int ncds = scan.nextInt();
        double total = 0;
        double media;
        
        for (int i = 0; i < ncds; i++) {
            System.out.print("Preço do Cd(" + (i+1) + "): ");
            total += scan.nextInt();
        }
        media = total/ncds;
        System.out.println("Valor total da coleção: " + total);
        System.out.println("Preço médio dos cds: " + media);        
    }
    
}
