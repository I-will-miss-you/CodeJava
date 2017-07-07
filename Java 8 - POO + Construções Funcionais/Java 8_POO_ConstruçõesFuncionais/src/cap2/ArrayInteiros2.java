/*
 * Programa que usa um método auxiliar para ler inteiros válidos e
 * inseri-los num array de inteiros que é devolvido como resultado.
 * Um outro método auxiliar determina o maior elemento de um array
 * com número de elementos dado como parâmetro.
 * O programa usa Arrays.sort() para ordenar o array final.
 */
package cap2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class ArrayInteiros2 {

    public static final int DIM = 100;
    public static Scanner input = new Scanner(System.in);

    public static int lerInteiro(String msg) {
        int num = 0;
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido.");
            }
        }
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int[] lerArray(int num) {
        int[] nums = new int[num];
        int n = 0;
        for (int i = 0; i < num; i++) {
            nums[i] = lerInteiro("Valor " + (i + 1) + ":");
        }
        return nums;
    }

    public static int max(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int soma(int[] nums) {
        int soma = 0;
        for (int i = 0; i < nums.length; i++) {
            soma += nums[i];
        }
        return soma;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dim = lerInteiro("Total de números a ler: ");
        int[] arrayNum = lerArray(dim);
        System.out.println("");
        
        System.out.println("Vetor inserido:");
        printArray(arrayNum);
        
        
        int max = max(arrayNum);
        System.out.println("Maior valor inserido: " + max);

        System.out.println("Vetor Ordenado:");
        Arrays.sort(arrayNum);
        printArray(arrayNum);

        System.out.println("Somatório de todos os valores: " + soma(arrayNum));
        
    }

}
