package cap2;

import anexo.Input;

/**
 * Escrever um programa que faça a leitura de N valores inteiros para um array e determine qual o
 * maior valor introduzido e aual a sua posição no array
 *
 * @author code36u4r60
 */
public class ex02 {

    public static void main(String[] args) {

        int[] lista = lerArray();
        int id = maior(lista);
        System.out.println("O maior valor é " + lista[id] + " e esta na posição " + (id + 1) + " .");

    }

    public static int[] lerArray() {
        System.out.print("Número de elementos: ");
        int n = Input.lerInt();
        int lista[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + " : ");
            lista[i] = Input.lerInt();
        }
        return lista;
    }

    public static int maior(int[] lista) {
        int ind = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[ind] < lista[i]) {
                ind = i;
            }
        }
        return ind;
    }
}
