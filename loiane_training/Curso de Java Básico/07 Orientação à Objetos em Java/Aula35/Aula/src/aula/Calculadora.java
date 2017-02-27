
package aula;

/**
 *
 * @author Code36u4r60
 */
public class Calculadora {
    public static int fatorialNaoRecursivo(int num){
        if(num == 0) return 1;
        
        int total = 1;
        for (int i = num; i > 1; i--) {
            total *= i;
        }
        return total;
    }
    
    public static int fatorialRecursivo(int num){
        if(num == 0 || num == 1) return 1;
        return num* fatorialRecursivo(--num);
    }
}
