package cap1;

import anexo.Input;

/**
 * Escrever um programa que calcule o fatorial de um valor inteiro.
 *
 * @author code36u4r60
 */
public class ex16 {

    public static void main(String[] args) {
        System.out.print("Valor : ");
        int n = Input.lerInt();
        System.out.println("Factorial de " + n + " = " + factorial(n));
    }

    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
