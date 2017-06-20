package cap2;

import java.util.Arrays;

/**
 * Declarar, inicializar e imprimir os elementos de um array
 *
 * @author code36u4r60
 */
public class ex01 {

    public static void main(String[] args) {
        int[] lista = {12, 2, 45, 66, 7, 25, 99};

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }

        //outra forma
        System.out.println(Arrays.toString(lista));

    }

}
