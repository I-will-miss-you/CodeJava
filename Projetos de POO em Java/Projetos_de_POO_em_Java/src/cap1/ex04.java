package cap1;

import java.util.Scanner;

/**
 * Ler um sequência de inteiros positivos (terminando pelo valor de -1) e determinar a diferença
 * entre o maior e o meno inteiro lido. Imprimie esse valor, bem como o maior e o menor inteiro.
 *
 *
 * @author code36u4r60
 */
public class ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int valor;

        valor = input.nextInt();
        while (valor != -1) {
            if (maior < valor) {
                maior = valor;
            }
            if (menor > valor) {
                menor = valor;
            }
            valor = input.nextInt();
        }

        System.out.println("Maior valor =  " + maior);
        System.out.println("Menor valor = " + menor);
        System.out.println("Diferença entre o maior e o menor valor = " + (maior - menor));
    }

}
