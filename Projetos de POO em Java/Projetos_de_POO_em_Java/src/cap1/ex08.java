package cap1;

import anexo.Input;

/**
 * Escrever um programa que leia um inteiro N e imprima todos os números ímpares inferiores a N
 *
 * @author code36u4r60
 */
public class ex08 {

    public static void main(String[] args) {
        System.out.println("Descobrir todos os números ímpares inferiores a N");
        System.out.print("Inserir um valor inteiro para N = ");
        int n = Input.lerInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

}
