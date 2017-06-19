package cap1;

import java.util.Scanner;

/**
 * Ler 10 inteiros e determinar o maior inteiro introduzido.
 *
 * @author code36u4r60
 */
public class ex02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Inteiro " + (i + 1) + ": ");
            valor = input.nextInt();
            if (valor > maior) {
                maior = valor;
            }
        }

        System.out.println("O maior valor inteiro inserido foi: " + maior);
    }

}
