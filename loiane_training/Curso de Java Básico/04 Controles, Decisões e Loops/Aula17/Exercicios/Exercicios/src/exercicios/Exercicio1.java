package exercicios;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**
 * @author Code36u4r60
 */
public class Exercicio1 {

    /*
     * Faça um programa que peça uma nota, entre zero e dez. Mostre uma
     * mensagem caso o valor seja inválido e continue pedindo até que o
     * usuário informe um valor válido.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota;
        boolean erro = false;

        do {
            System.out.println("Insira uma nota entre 0 e 10: ");
            nota = scan.nextDouble();
            erro = nota < 0 || nota > 10;
        } while (erro);
        System.out.println("Nota: " + nota);
    }

}
