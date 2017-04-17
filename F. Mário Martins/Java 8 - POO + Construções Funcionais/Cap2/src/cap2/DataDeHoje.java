package cap2;
import java.util.Calendar;
/**
 *
 * @author Code36u4r60
 */
public class DataDeHoje {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance();
        System.out.printf("%tT%n",hoje);
        System.out.printf("%1$tY-%1$tm-%1$td%n", hoje);
        System.out.printf("%1$tH-%1$<tM-%1$<tM%n", hoje);
    }
    
}
