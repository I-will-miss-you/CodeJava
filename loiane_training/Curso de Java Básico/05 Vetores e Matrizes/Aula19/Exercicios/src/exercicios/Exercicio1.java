package exercicios;

import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio1 {

    /*
     * Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
     * mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
     * seja, B[i] = A[i].
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Valor " + (i+1) +" = ");
            a[i] = scan.nextInt();
            b[i] = a[i];
        }
        System.out.println("\n Vetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }
        System.out.println("\n Vetor B:");
        for (int i = 0; i < b.length; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }
    }

}
