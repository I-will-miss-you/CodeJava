package cap2;

import static anexo.Input.lerString;
//import java.util.Arrays;

/**
 * Escrever um programa que leia uma série de palavras terminada por "zzz" para um array, aceite
 * repetidamente uma palavra até que seja introduzida a palavra "xxx" e verifica se tal palavra
 * existe no array. Caso exista, o programa deverá removê-la.
 *
 * @author code36u4r60
 */
public class ex07_colecao_de_palavras {

    private static int size = 0;

    public static void main(String[] args) {
        String[] lista = lerStrings("zzz", "xxx");
        print(lista);
    }

    public static String[] lerStrings(String contem, String stop) {
        String[] lista = new String[10];

        String palavra = "";
        while (!stop.equalsIgnoreCase(palavra)) {
            System.out.print("Insira uma String: ");
            palavra = lerString();

            if (existe(lista, palavra)) {
                lista = remove(lista, palavra);
                continue;
            }

            if (palavra.equalsIgnoreCase(stop)) {
                continue;
            }
            if (terminaPor(palavra, contem)) {
                lista = add(lista, palavra);
            }
        }

        return lista;
    }

    public static String[] add(String[] lista, String palavra) {
        if (lista.length / 2 == size) {
            lista = realoca(lista);
        }

        lista[size] = palavra;
        size++;
        //System.out.println(Arrays.toString(lista));
        return lista;
    }

    public static String[] realoca(String[] lista) {
        String[] l = new String[lista.length + 10];
        System.arraycopy(lista, 0, l, 0, lista.length);
        return l;
    }

    public static boolean terminaPor(String str, String termino) {
        if (str.length() < termino.length()) {
            return false;
        }

        String s = str.substring(str.length() - termino.length(), str.length());
        return s.equalsIgnoreCase(termino);
    }

    public static void print(String[] lista) {
        System.out.print("[ ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(lista[i] + " , ");
        }
        System.out.println(lista[size - 1] + " ]");
    }

    public static boolean existe(String[] lista, String palavra) {
        for (int i = 0; i < size; i++) {
            //System.out.println(lista[i].equalsIgnoreCase(palavra));
            if (lista[i].equalsIgnoreCase(palavra)) {
                return true;
            }
        }
        return false;
    }

    public static String[] remove(String[] lista, String palavra) {
        int idx = getIdx(lista, palavra);
        //System.out.println(idx);
        if (idx >= 0) {
            for (int i = idx; i < size; i++) {
                lista[i] = lista[i + 1];
            }
            size--;
        }
        //System.out.println(Arrays.toString(lista));
        return lista;
    }

    public static int getIdx(String[] lista, String palavra) {
        for (int i = 0; i < size; i++) {
            if (lista[i].equalsIgnoreCase(palavra)) {
                return i;
            }
        }
        return -1;
    }
}
