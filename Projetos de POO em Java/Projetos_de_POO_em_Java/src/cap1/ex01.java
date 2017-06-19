package cap1;

import java.util.Scanner;

/**
 * Ler um nome e uma idade e imprimir um texto com os resultados.
 *
 * @author code36u4r60
 */
public class ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Idade: ");
        int idade = input.nextInt();

        System.out.println("O " + nome + " tem " + idade + " anos.");
    }

}
