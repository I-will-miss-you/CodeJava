package cap1;

import java.time.LocalDateTime;
import java.time.Month;
import static java.time.temporal.ChronoUnit.MILLIS;

/**
 * Escreva um programa que use um métedo auxiliar que aceite duas datas e determine a sua diferença
 * em dias, horas, minutos e segundos. O resultado do métedo deverá ser uma string.
 *
 * @author code36u4r60
 */
public class ex11 {

    public static String difDatas(LocalDateTime start, LocalDateTime end) {
        long diff = start.until(end, MILLIS);

        long millis = diff % 1000;

        diff /= 1000;
        long seg = diff % 60;

        diff /= 60;
        int min = (int) diff % 60;

        diff /= 60;
        int horas = (int) diff % 24;

        int dias = (int) diff / 24;

        return dias + " dias, " + horas + " horas, " + min + " minutos, " + seg + " segundos, " + millis + " milisegundos";
    }

    public static void main(String[] args) {
        LocalDateTime strat = LocalDateTime.of(2014, Month.FEBRUARY, 8, 12, 20, 33, 1);
        LocalDateTime end = LocalDateTime.of(2014, Month.MARCH, 10, 22, 12, 15, 4);
        System.out.println(difDatas(strat, end));
    }

}
