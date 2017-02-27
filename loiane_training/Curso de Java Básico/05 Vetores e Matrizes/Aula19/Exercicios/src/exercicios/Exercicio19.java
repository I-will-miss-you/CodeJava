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

    /*
     * Ler as duas notas bimestrais para um conjunto de 10 alunos.
     * Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
     * tipo real. Escreva um programa que calcule a média aritmética simples
     * das notas informadas armazenando o resultado em um vetor “Result”
     * de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
     * de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
     * estará “aprovado”, caso contrário, a situação do aluno será
     * “reprovado”.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] resultado = new double[notas1.length];

        for (int i = 0; i < notas1.length; i++) {
            System.out.println("Notas do aluno " + (i + 1) + ":");
            
            System.out.print("Nota 1: ");
            notas1[i] = scan.nextInt();
            
            System.out.print("Nota 2: ");
            notas2[i] = scan.nextInt();
            
            resultado[i] = (notas1[i] + notas2[i]) / 2;
        }
        for (int i = 0; i < notas1.length; i++) {
            System.out.println("\nResultado do Aluno "+(i+1)+":");
            System.out.println("Nota 1 = " + notas1[i]);
            System.out.println("Nota 2 = " + notas2[i]);
            System.out.println("Nota Final = " + resultado[i]);
            System.out.println("Aluno " + ((resultado[i]  >= 7)?"Aprovado":"Reprovado"));
        }
        System.out.println("");
    }

}
