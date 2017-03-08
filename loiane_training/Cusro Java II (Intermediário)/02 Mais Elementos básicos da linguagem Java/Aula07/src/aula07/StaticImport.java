
package aula07;

/**
 *
 * @author code36u4r60
 */

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*;

public class StaticImport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double a = 2;
        double b = 3;
        double c = 4;
        
        System.out.println(Math.pow(a, b));
        
        System.out.println(Math.sqrt(c));
        
        System.out.println(pow(a, b));
        
        System.out.println(sqrt(c));
        

    }
    
}
