package exercicios;

import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio15 {

    /*
     * A série de Fibonacci é formada pela seqüência
     * 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
     * até o n−ésimo termo.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Até que valor deseja calcular a séri de Fibonacci: ");
        int n = scan.nextInt();
        int x0 = 0, x1 = 1, aux;
      
        System.out.println(x1);
        
        for (int i = 1; i < n; i++) {
            aux = x0 + x1;
            x0 = x1;
            x1 = aux;
            System.out.println(aux);
        }
    }

}
