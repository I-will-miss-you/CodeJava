package cap3;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Uma pequena classe que simula um cronómetro double split. Inicia uma contagem de tempo com START.
 * Faz uma primeira paragem com STOP1 mas continua a contar até fazer a segunda paragem com STOP2.
 * Em seguida, devolve todos os tempos registados: do início ate a primeira paragem; do inicio ate a
 * segunda e entre a primeira e a segunda.
 *
 * O formato para os tempos medidos será mM:sS:msMls.
 *
 * @author code36u4r60
 */
public class CronometroDS {

    ///////////////////////////////////////////
    // Variáveis de Instância
    ///////////////////////////////////////////
    Instant start;
    Instant stop1;
    Instant stop2;

    public void start() {
        start = Instant.now();
        stop1 = Instant.now();
        stop2 = Instant.now();
    }

    public void stop1() {
        stop1 = Instant.now();
    }

    public void stop2() {
        stop2 = Instant.now();
    }

    public String time(Instant start, Instant stop) {
        Duration duracao = Duration.between(start, stop);

        long total = duracao.toMillis();

        int milli = (int) total % 1000;

        total /= 1000;
        int seg = (int) total % 60;

        total /= 60;
        int min = (int) total % 60;

        return min + " M : " + seg + " S : " + milli + " ms.";
    }

    public String resultados() {
        StringBuilder s = new StringBuilder();
        s.append("Tempo Total: ");
        s.append(time(start, stop2));
        s.append("\nTempo Intervalo1: ");
        s.append(time(start, stop1));
        s.append("\nTempo Intervalo2: ");
        s.append(time(stop1, stop2));
        return s.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CronometroDS c = new CronometroDS();
        c.start();
        try {
            Thread.sleep(1000);
            c.stop1();
            System.out.println("Stop 1");
            Thread.sleep(100000);
            c.stop2();
            System.out.println("Stop 2");
        } catch (InterruptedException ex) {
            Logger.getLogger(CronometroDS.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(c.resultados());
    }

}
