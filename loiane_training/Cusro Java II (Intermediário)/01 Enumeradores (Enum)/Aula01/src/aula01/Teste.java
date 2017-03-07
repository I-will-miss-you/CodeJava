/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

/**
 *
 * @author code36u4r60
 */
public class Teste {

    public static void main(String[] args) {
        usandoConstantes();
        System.out.println("");
        usandoEnum();
    }

    private static void usandoConstantes() {
        int segunda = DiaSemanaConstantes.SEGUNDA;
        int terca = DiaSemanaConstantes.TERCA;
        int quarta = DiaSemanaConstantes.QUARTA;
        int quinta = DiaSemanaConstantes.QUINTA;
        int sexta = DiaSemanaConstantes.SEXTA;
        int sabado = DiaSemanaConstantes.SABADO;
        int domingo = DiaSemanaConstantes.DOMINGO;

        System.out.println("Teste utilizando constantes no Java");
        printDiaSemana(segunda);
        printDiaSemana(terca);
        printDiaSemana(quarta);
        printDiaSemana(quinta);
        printDiaSemana(sexta);
        printDiaSemana(sabado);
        printDiaSemana(domingo);

    }

    private static void printDiaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                throw new AssertionError();
        }
    }

    private static void usandoEnum() {
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;
        
        System.out.println("Teste utilizando ENUM no Java");
        printDiaSemanaEnum(segunda);
        printDiaSemanaEnum(terca);
        printDiaSemanaEnum(quarta);
        printDiaSemanaEnum(quinta);
        printDiaSemanaEnum(sexta);
        printDiaSemanaEnum(sabado);
        printDiaSemanaEnum(domingo);
    }

    private static void printDiaSemanaEnum(DiaSemana dia) {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Segunda-feira");
                break;
            case TERCA:
                System.out.println("Terça-feira");
                break;
            case QUARTA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sabado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
            default:
                throw new AssertionError();
        }
    }
}
