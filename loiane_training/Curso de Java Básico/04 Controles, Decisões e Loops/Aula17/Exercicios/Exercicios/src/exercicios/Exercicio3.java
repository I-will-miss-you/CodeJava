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
public class Exercicio3 {

    /*
     * Faça um programa que leia e valide as seguintes informações:
     * a. Nome: maior que 3 caracteres;
     * b. Idade: entre 0 e 150;
     * c. Salário: maior que zero;
     * d. Sexo: 'f' ou 'm';
     * e. Estado Civil: 's', 'c', 'v', 'd';
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        boolean erro = false;

        do {
            System.out.println("Nome: ");
            nome = scan.next();
            erro = nome.length() < 3;
            if (erro) {
                System.out.println("No mínimo 3 caracteres...");
            }
        } while (erro);

        do {
            System.out.println("Idade: ");
            idade = scan.nextInt();
            erro = idade < 0 || idade > 150;
            if (erro) {
                System.out.println("Idade tem de ser entre 0 e 150 anos...");
            }
        } while (erro);

        do {
            System.out.println("Salário: ");
            salario = scan.nextDouble();
            erro = salario <= 0;
            if (erro) {
                System.out.println("Salário tem de ser maior que 0...");
            }
        } while (erro);

        do {
            System.out.println("Sexo (M ou F): ");
            sexo = scan.next().toUpperCase();
            erro = !(sexo.equals("M") || sexo.equals("F"));
        } while (erro);

        do {
            System.out.println("Estado Civil");
            estadoCivil = scan.next().toUpperCase();
            switch (estadoCivil) {
                case "S":
                case "C":
                case "V":
                case "D":
                    erro = false;
                    break;
                default:
                    erro = true;
            }
        } while (erro);

        
        System.out.println("Dados: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
        
    }

}
