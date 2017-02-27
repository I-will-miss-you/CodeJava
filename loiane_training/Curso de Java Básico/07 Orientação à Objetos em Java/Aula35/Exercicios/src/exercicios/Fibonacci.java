
package exercicios;

/**
 *
 * @author Code36u4r60
 */
public class Fibonacci {
    public static int fibonacciRec(int n){
        if(n == 0 || n == 1) return n;
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }
}
