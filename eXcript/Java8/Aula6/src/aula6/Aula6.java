package aula6;

/**
 *
 * @author code36u4r60
 */
public class Aula6 {

    interface Num {

        double getValue();
    }

    interface ValorNumerico {

        boolean teste(int n);
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
        
    }

}
