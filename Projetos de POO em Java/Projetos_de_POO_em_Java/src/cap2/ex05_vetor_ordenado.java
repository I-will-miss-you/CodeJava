package cap2;

import java.util.Arrays;

/**
 * Escrever um programa ao anterior que faça a leitura de N elementos inteiros para um array, mas
 * que os insira de modo a que o array se mantenha sempre ordenado por ordem crescente.
 *
 * @author code36u4r60
 */
public class ex05_vetor_ordenado {

    public static void main(String[] args) {
        int[] lista = {};

        lista = add(lista, 15);
        lista = add(lista, 5);
        lista = add(lista, 8);
        lista = add(lista, 2);
        lista = add(lista, 3);
        lista = add(lista, 1);
        lista = add(lista, 9);
        lista = add(lista, 12);

        System.out.println(Arrays.toString(lista));
    }

    public static int[] add(int[] lista, int valor) {
        if (lista.length == 0) {
            int[] l = new int[1];
            l[0] = valor;
            return l;
        }

        int idx = getPosicao(lista, valor);
        int[] l = realocar(lista);
        for (int i = l.length - 1; i > idx; i--) {
            l[i] = l[i - 1];
        }
        l[idx] = valor;
        return l;
    }

    public static int getPosicao(int[] lista, int valor) {
        for (int i = 0; i < lista.length; i++) {
            if (valor < lista[i]) {
                return i;
            }
        }
        return lista.length;
    }

    public static int[] realocar(int[] lista) {
        int[] l = new int[lista.length + 1];
        System.arraycopy(lista, 0, l, 0, lista.length);
        return l;
    }
}
