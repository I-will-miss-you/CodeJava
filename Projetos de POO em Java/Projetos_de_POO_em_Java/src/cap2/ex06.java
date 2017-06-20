package cap2;

import anexo.Input;
import static anexo.Input.lerInt;
import java.util.Arrays;

/**
 * Escrever um programa que faça a leitura de N elementos inteiros para um array, receba dois
 * índices válidos do array lido e crie um array apenas com os elementos entre esse dois índices.
 * Usar um métedo auxiliar.
 *
 * @author code36u4r60
 */
public class ex06 {

    public static void main(String[] args) {
        int lista[] = lerArray();

        System.out.print("Indice inicio: ");
        int ini = lerInt();
        System.out.print("Indice fim: ");
        int fim = lerInt();
        int[] newList = subList(lista, ini, fim);

        System.out.println(Arrays.toString(newList));
    }

    public static int[] subList(int[] lista, int ini, int fim) {
        if (lista.length == 0) {
            System.out.println("Lista está vazia...");
            return null;
        }
        if (ini > fim || ini < 0 || fim > lista.length - 1) {
            System.out.println("O intervalo de valor não é valido");
            return null;
        }
        int[] sub = new int[fim - ini + 1];
        for (int i = ini, j = 0; i <= fim; i++, j++) {
            sub[j] = lista[i];
        }
        return sub;
    }

    public static int[] lerArray() {
        System.out.print("Número de elementos: ");
        int n = Input.lerInt();
        int lista[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + i + " : ");
            lista[i] = Input.lerInt();
        }
        return lista;
    }

}
