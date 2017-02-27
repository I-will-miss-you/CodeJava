package aula;

/**
 *
 * @author code36u4r60
 */
public class TesteCalculadora {

    static int resultSoma;

    public static void main(String[] args) {

        resultSoma = Calculadora.soma(1, 2);
        //MinhaCalculadora calc = new MinhaCalculadora();
        //calc.soma(1, 2);
        soma2Valores(1, 2);
    }

    static int soma2Valores(int num1, int num2) {
        return Calculadora.soma(num1, num2);
    }

}
