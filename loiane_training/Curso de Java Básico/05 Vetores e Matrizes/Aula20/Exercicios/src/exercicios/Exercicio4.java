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
public class Exercicio4 {

    /*
     * Faça um programa para armazenar em uma matriz os
     * compromissos de uma agenda pessoal. Cada dia do mês deve
     * conter 24 horas, onde para cada uma destas 24 horas podemos
     * associar um tarefa específica (compromisso agendado). O
     * programa deve ter um menu onde o usuário indica o dia do mês
     * que deseja alterar e a hora, entrando em seguida com o
     * compromisso, ou então, o usuário pode também consultar a
     * agenda, fornecendo o dia e a hora para obter o
     * compromisso armazenado.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdDiasMes = 31, qtdHoraDia = 24;
        String[][] compromisso = new String[qtdDiasMes][qtdHoraDia];

        boolean exit = false;
        boolean erro = false;
        byte op;
        int dia, hora;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Pesquisar");
            System.out.println("0 - Exit");
            System.out.print("Opção: ");
            op = scan.nextByte();
            switch (op) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    do {
                        System.out.println(erro ? "Dia inválido...\nDia: " : "Dia: ");
                        dia = scan.nextInt();
                        erro = dia > 31 || dia < 0;
                    } while (erro);
                    do {
                        System.out.println(erro ? "Hora inválido...\nHora: " : "Hora: ");
                        hora = scan.nextInt();
                        erro = hora > 24 || hora < 0;
                    } while (erro);
                    System.out.println("Compromisso: ");
                    compromisso[--dia][--hora] = scan.next();
                    break;
                case 2:
                    do {
                        System.out.println(erro ? "Dia inválido...\nDia: " : "Dia: ");
                        dia = scan.nextInt();
                        erro = dia > 31 || dia < 0;
                    } while (erro);
                    do {
                        System.out.println(erro ? "Hora inválido...\nHora: " : "Hora: ");
                        hora = scan.nextInt();
                        erro = hora > 24 || hora < 0;
                    } while (erro);
                    System.out.println("Compromisso: "+compromisso[--dia][--hora]);
                    break;
                default:
                    System.out.println("Opção inválida...");
            }

        }

    }

}
