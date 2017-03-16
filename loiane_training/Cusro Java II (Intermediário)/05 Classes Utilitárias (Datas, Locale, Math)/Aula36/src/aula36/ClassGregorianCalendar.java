
package aula36;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Code36u4r60
 */
public class ClassGregorianCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar hoje1 = Calendar.getInstance();
        
        GregorianCalendar hoje = new GregorianCalendar();
        imprimirData(hoje);
        
        System.out.println(hoje.isLeapYear(2020));
        
        GregorianCalendar hoje2 = new GregorianCalendar(2017,2,15);
        imprimirData(hoje2);
    }
    
    private static void imprimirData(Calendar c){
                System.out.format("Hoje é: %02d/%02d/%d %02d:%02d:%02d %n",
                c.get(Calendar.DAY_OF_MONTH),
                c.get(Calendar.MONTH)+1,
                c.get(Calendar.YEAR),
                c.get(Calendar.HOUR_OF_DAY),
                c.get(Calendar.MINUTE),
                c.get(Calendar.SECOND));
    }
}
