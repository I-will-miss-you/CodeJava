package exercicios;

/**
 *
 * @author Code36u4r60
 */
public class Calculadora {

    
    public static double somar(double val1 , double val2) {
        return val1+val2;
    }

    public static double subtrair(double val1, double val2){
        return val1-val2;
    }
    
    public static double multiplicar(double val1 , double val2){
        return val1*val2;
    }
    
    public static double dividir(double val1 ,double val2){
        return val1/val2;
    }
    
    public static double elevarPotencia(double val1 , int val2){
        double result = 1;
        for (int i = 0; i < val2; i++) {
            result *= val1;
        }
        return result;
    }
    
    public static int fatorial(int val){
        int result = val;
        for (int i = val - 1 ; i > 1; i--) {
            result *= i;
        }
        return result;
    }
}
