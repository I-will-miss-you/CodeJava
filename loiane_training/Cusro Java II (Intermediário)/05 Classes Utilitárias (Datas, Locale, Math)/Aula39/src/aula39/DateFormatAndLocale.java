package aula39;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Code36u4r60
 */
public class DateFormatAndLocale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date hoje = new Date();
        System.out.println(Locale.getDefault());

        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado);

        Locale.setDefault(new Locale("en", "US"));
        hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);
        hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
        System.out.println(hojeFormatado);
        hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateTimeInstance(
                DateFormat.MEDIUM, DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);
        
        System.out.println(hojeFormatado);
        
      String data = "Mar 16, 2017 6:01 PM";
        try {
            Date newDate = DateFormat.getDateInstance().parse(data);
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(newDate);
            
            System.out.println(newDate);
        } catch (ParseException ex) {
            Logger.getLogger(DateFormatAndLocale.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }

}
