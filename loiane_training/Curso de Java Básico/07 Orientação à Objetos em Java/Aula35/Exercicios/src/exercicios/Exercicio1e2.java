package exercicios;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio1e2 {

    public static void main(String[] args) {
        System.out.println("Fabonnacci:");
        for (int i = 0; i < 12; i++) {
            System.out.println(Fibonacci.fibonacciRec(i));
        }

        System.out.println("Somatório:");
        System.out.println(Somatorio.somatorio(10));
    }

}
