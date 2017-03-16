
package aula37;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Code36u4r60
 */
public class ClassSimpleDateFormat {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss a z");
        
        Calendar data = new GregorianCalendar(2010,2,20,14,32,25);
        
        System.out.println(sdf.format(data.getTime()));
        
        Date hoje = new Date();
        System.out.println(sdf.format(hoje));
        
        System.out.println("");
        
          SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
        Date d = new Date();
          try {
           d = sdf2.parse("12-11-1984");
        } catch (ParseException ex) {
            Logger.getLogger(ClassSimpleDateFormat.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(sdf2.format(d)); 
        System.out.println(sdf.format(d)); 
    }
    
}
