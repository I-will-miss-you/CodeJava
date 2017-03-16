package aula35;

import java.util.Calendar;

/**
 *
 * @author Code36u4r60
 */
public class ClassCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance(); //singleton

        //System.out.println(hoje);
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);

        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.format("Hoje é: %02d/%02d/%d %02d:%02d:%02d %n",
                dia, mes + 1, ano, hora, minutos, segundos);

        hoje.add(Calendar.DAY_OF_MONTH, 16);

        System.out.format("Hoje é: %02d/%02d/%d %02d:%02d:%02d %n",
                hoje.get(Calendar.DAY_OF_MONTH),
                hoje.get(Calendar.MONTH)+1,
                hoje.get(Calendar.YEAR),
                hoje.get(Calendar.HOUR_OF_DAY),
                hoje.get(Calendar.MINUTE),
                hoje.get(Calendar.SECOND));
        
        
    }

}
