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
     * Faça um programa que lê as duas notas parciais obtidas por um aluno
     * numa disciplina ao longo de um semestre, e calcule a sua média. A
     * atribuição de conceitos obedece à tabela abaixo:
     * o Média de Aproveitamento Conceito
     * o Entre 9.0 e 10.0 A
     * o Entre 7.5 e 9.0 B
     * o Entre 6.0 e 7.5 C
     * o Entre 4.0 e 6.0 D
     * o Entre 4.0 e zero E~
     * O algoritmo deve mostrar na tela as notas, a média, o conceito
     * correspondente e a mensagem “APROVADO” se o conceito for
     * A, B ou C ou “REPROVADO” se o conceito for D ou E.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1ª Nota: ");
        double nota1 = input.nextDouble();
        System.out.print("2ª Nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        String conceito;

        if (nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10) {
            System.out.println("Boom! Andas a arrebentar as escalas...");
            conceito = "Erro";
        } else {
            if (media < 4) {
                conceito = "E";
            } else if (media < 6) {
                conceito = "D";
            } else if (media < 7.5) {
                conceito = "C";
            } else if (media < 9) {
                conceito = "B";
            } else {
                conceito = "A";
            }
        }
        switch (conceito) {
            case "A":
            case "B":
            case "C":
                System.out.printf("Media: %.2f : %s -> Aprovado\n", media, conceito);
                break;
            case "D":
            case "E":
                System.out.printf("Media: %.2f : %s -> Reprovado\n", media, conceito);
                break;
        }
    }
}
