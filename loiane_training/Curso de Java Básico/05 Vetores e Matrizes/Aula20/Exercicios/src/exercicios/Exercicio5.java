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

    /*
     * Modifique o programa anterior de maneira a guardar os
     * compromissos de todo o ano, organizados por mês, dia e hora
     * (só 8 horas por dia).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdMesAno = 12, qtdDiasMes = 31, qtdHoraDia = 8;
        String[][][] compromisso = new String[qtdMesAno][qtdDiasMes][qtdHoraDia];

        boolean exit = false;
        boolean erro = false;
        byte op;
        int mes, dia, hora;

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
                        System.out.println(erro ? "Mês inválido...\nMês: " : "Mês: ");
                        mes = scan.nextInt();
                        erro = mes > qtdMesAno || mes <= 0;
                    } while (erro);
                    do {
                        System.out.println(erro ? "Dia inválido...\nDia: " : "Dia: ");
                        dia = scan.nextInt();
                        erro = dia > qtdDiasMes || dia <= 0;
                    } while (erro);
                    do {
                        System.out.println(erro ? "Hora inválido...\nHora: " : "Hora: ");
                        hora = scan.nextInt();
                        erro = hora > qtdHoraDia || hora <= 0;
                    } while (erro);
                    System.out.println("Compromisso: ");
                    compromisso[--mes][--dia][--hora] = scan.next();
                    break;
                case 2:
                    do {
                        System.out.println(erro ? "Mês inválido...\nMês: " : "Mês: ");
                        mes = scan.nextInt();
                        erro = mes > qtdMesAno || mes < 0;
                    } while (erro);
                    do {
                        System.out.println(erro ? "Dia inválido...\nDia: " : "Dia: ");
                        dia = scan.nextInt();
                        erro = dia > qtdDiasMes || dia < 0;
                    } while (erro);
                    do {
                        System.out.println(erro ? "Hora inválido...\nHora: " : "Hora: ");
                        hora = scan.nextInt();
                        erro = hora > qtdHoraDia || hora < 0;
                    } while (erro);
                    System.out.println("Compromisso: " + compromisso[--mes][--dia][--hora]);
                    break;
                default:
                    System.out.println("Opção inválida...");
            }
        }

    }

}
