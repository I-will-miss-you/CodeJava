/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopfor;

/**
 *
 * @author Code36u4r60
 */
public class LoopFor {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("Valor de i: " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("I = " + i + " ; j = " + j);
        }

        int count = 0;
        for (; count < 10;) {
            System.out.println("valor de count: " + count);
            count += 2;
        }

        for (int cont = 0; cont < 10; cont += 2) {
            System.out.println("valor de cont: " + cont);
        }

        int soma = 0;
        for (int i = 1; i < 5; soma += i++);
        System.out.println("Valor da soma = " + soma);
    }

}
