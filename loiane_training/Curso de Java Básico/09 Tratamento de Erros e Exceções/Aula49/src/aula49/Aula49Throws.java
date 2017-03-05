package aula49;

import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Aula49Throws {

    public static void main(String[] args) {

        System.out.println("Entre com um número: ");

        try {
            double num = lerNumero();
            System.out.println("Você digitou: " + num);
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
    }

    public static double lerNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
