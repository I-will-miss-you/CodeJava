/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author fonse
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("Valor1 é 1 AND Valor2 é 2 -> " + resultado1);

        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("Valor1 é 1 OR Valor2 é 2 -> " + resultado2);

        boolean verdadeiro = true;

        boolean falso = false;

        System.out.println(verdadeiro && falso);

        System.out.println(verdadeiro || falso);

        System.out.println(verdadeiro ^ falso);

        System.out.println(!verdadeiro);
    }

}
