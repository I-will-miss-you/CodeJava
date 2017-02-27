
package matrizirregular;

import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class MatrizIrregular {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Número de pessoa a ser entrevistadas: ");
        int numEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        int qtdFilhos;

        for (int i = 0; i < nomesFilhos.length; i++) {

            System.out.print("Números de filhos: ");
            qtdFilhos = scan.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.print("Nome do " + (j + 1) + "º filho: ");
                nomesFilhos[i][j] = scan.next();
            }
        }

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("\nA pessoa " + (i + 1) + " tem " + nomesFilhos[i].length + " filhos");
            for (String nomesFilho : nomesFilhos[i]) {
                System.out.println(nomesFilho);
            }
        }

    }

}
