package aula33;

/**
 *
 * @author Code36u4r60
 */
public class Calculadora {

    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int some(int[] vetorInteiros) {
        int soma = 0;
        for (int vetorInteiro : vetorInteiros) {
            soma += vetorInteiro;
        }
        return soma;
    }
}
