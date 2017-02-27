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
     * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
     * mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
     * a) Bi deverá receber 'a' quando Ai for menor que 7; 
     * b) Bi deverá receber 'b' quando Ai for igual a 7; 
     * c) Bi deverá receber 'c' quando Ai for maior que 7 e menor que 10; 
     * d) Bi deverá receber 'd' quando Ai for igual a 10; 
     * e) Bi deverá receber 'e' quando Ai for maior que 10.
     * Sugestão: char B[10];
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        char[] vetorB = new char[vetorA.length];

        System.out.println("Valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
        }

// vetor B
        for (int i = 0; i < vetorB.length; i++) {
            if(vetorA[i] < 7){
                vetorB[i] = 'A';
            }else if(vetorA[i] == 7){
                vetorB[i] = 'B';
            }else if(vetorA[i] > 7 && vetorA[i] < 10){
                vetorB[i] = 'C';
            }else if(vetorA[i] == 10){
                vetorB[i] = 'D';
            }else{
                vetorB[i] = 'E';
            }
        }
      
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");

        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("");
    }

}
