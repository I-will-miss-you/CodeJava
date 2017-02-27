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
public class Exercicio5 {

    /* Exercicio 5
     * Faça um programa para a leitura de duas notas parciais de um aluno.
     * O programa deve calcular a média alcançada por aluno e apresentar:
     * o A mensagem "Aprovado", se a média alcançada for maior ou
     * igual a sete;
     * o A mensagem "Reprovado", se a média for menor do que sete;
     * o A mensagem "Aprovado com Distinção", se a média for igual a
     * dez.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean erro = false;

        System.out.println("Nota 1: ");
        double nota1 = input.nextDouble();
        if (nota1 > 10 || nota1 < 0) {
            erro = true;
        }

        System.out.println("Nota 2:");
        double nota2 = input.nextDouble();
        if (nota2 > 10 || nota2 < 0) {
            erro = true;
        }

        if (erro) {
            System.out.println("Erro em uma ou mais notas inseridas.");
        } else {
            double media = (nota1 + nota2) / 2;
            if (media == 10) {
                System.out.println("Aluno aprovado com distinção.");
            } else if (media >= 7) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado..");
            }
        }
    }

}
