/*
 * Programa que usa Scanner para ler um inteiro válido e
 * inseri-lo num array de inteiros. Inteiros inválidos não
 * geram erro mas são desprezados. O programa lê igualmente
 * o índice onde o inteiro lido vai ser inserido. O array de
 * inteiros é esparso não gerando erros de IndexOutOfBounds. 
 */
package cap2;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class ArrayInteiros {

    public static int lerInteiros(Scanner input, String msg) {
        boolean ok = false;
        int i = 0;
        while (!ok) {
            System.out.print(msg);
            try {
                i = Integer.parseInt(input.nextLine());
                ok = true;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Valor Invalido");
            }
        }
        return i;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>(64);

        for (int i = 1; i <= 64; i++) {
            lista.add(null);
        }

        boolean fim = false;
        int num = 0;
        int index = 0;

        while (!fim) {
            num = lerInteiros(input, "Inteiro (9999 = fim): ");
            if (num != 9999) {
                index = lerInteiros(input, "Indice: ");
                try {
                    lista.set(index, num);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Indice fora dos limites !");
                }
            } else {
                fim = true;
            }
        }
        
        int i = 0;
        for (Integer nm : lista) { 
            if (nm != null) {
                System.out.println(i + ": " + nm);
            }
            i++;
        }
        
    }

}
