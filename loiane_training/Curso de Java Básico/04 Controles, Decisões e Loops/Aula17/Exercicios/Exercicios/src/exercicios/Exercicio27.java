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
public class Exercicio27 {

    /*
     * O Departamento Estadual de Meteorologia lhe contratou para
     * desenvolver um programa que leia as um conjunto indeterminado de
     * temperaturas, e informe ao final a menor e a maior temperaturas
     * informadas, bem como a média das temperaturas.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Números de temperaturas: ");
        int qtd = scan.nextInt();
        int menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE, soma = 0, aux;
        for (int i = 0; i < qtd; i++) {
            System.out.print("Teperatura " + (i + 1) + " : ");
            aux = scan.nextInt();
            soma += aux;
            if (maior < aux) {
                maior = aux;
            }
            else if (menor > aux) {
                menor = aux;
            }
        }
        int media = soma / qtd;
        System.out.println("Temperatura");
        System.out.println("Max: " + maior);
        System.out.println("Min: " + menor);
        System.out.println("Media: " + media);
    }

}
