/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

/**
 *
 * @author code36u4r60
 */
public class Aula7 {

    interface Num {

        double getValue();
    }

    interface ValorNumerico {

        boolean teste(int n);
    }

    interface ValorNumerico2 {

        boolean teste(int n, int n2);
    }


    public static void main(String[] args) {

        //Expressão lambda utilizada como uma constante
        Num n;
        n = () -> 333.11;
        System.out.println(n.getValue());

        //Utilização da classe math com a estrutura lambda
        Num n2 = () -> Math.random() * 100;
        System.out.println(n2.getValue());
        System.out.println(n2.getValue());

        ValorNumerico isPar = (int i) -> (i % 2) == 0;
        System.out.println(isPar.teste(89));
        System.out.println(isPar.teste(90));

        ValorNumerico2 isDiv = (x, y) -> (x % y) == 0;
        System.out.println(isDiv.teste(10, 2));
        System.out.println(isDiv.teste(10, 3));

        ValorNumerico expressao1 = i -> (i % 2) == 0;
        ValorNumerico2 expressao2 = (int x, int y) -> {
            int w = x + y;
            return w > 1000;
        };

    }

}
