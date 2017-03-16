
package aula34;

import java.util.Date;

/**
 *
 * @author Code36u4r60
 */
public class ClassDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date hoje = new Date();
        System.out.println(hoje);
        
        System.out.println("Milisegundos desde 1 Jan 1970 " + hoje.getTime());
        
        System.out.println(hoje.getDate());
    }
    
}
