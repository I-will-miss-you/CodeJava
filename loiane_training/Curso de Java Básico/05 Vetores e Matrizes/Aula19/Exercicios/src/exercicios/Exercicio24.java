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
public class Exercicio24 {

    /*
     * Números palíndromos são aqueles que escritos da direita para a
     * esquerda têm o mesmo valor quando escritos da esquerda para a
     * direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
     * programa que verifique se um dado vetor A de 10 elementos inteiros é
     * um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
     * último, se o segundo elemento do vetor é igual ao penúltimo e assim
     * por diante até verificar todos os elementos ou chegar a conclusão que
     * o vetor não é um palíndromo.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
        }

        boolean palindromo = true;
        for (int i = 0; i < vetorA.length / 2; i++) {
            if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        String text = palindromo ? "é palidromo" : "não é palidromo";
        System.out.println("O valor inserido " + text);
    }

}
