package cap1;

import anexo.Input;

/**
 * Escrever um programa que calcule o fatorial de um valor inteiro, dado como argumento na invocação
 * do método main(String[] args)
 *
 * @author code36u4r60
 */
public class ex16 {

    public static void main(String[] args) {
        int n;
        if (args.length == 0) {
            n = Integer.parseInt(args[0]);
        } else {
            System.out.println("Valor : ");
            n = Input.lerInt();
        }

        System.out.println("Factorial de " + n + " = " + factorial(n));
    }

    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
