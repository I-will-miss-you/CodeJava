package timtec_introjava.cap4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author code36u4r60
 */
public class JavaThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Printer p1 = new Printer("Eduardo", 100, 200);
        Printer p2 = new Printer("Mônica", 100, 200);

        p1.start();
        p2.start();

        try {
            p1.join();
            p2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaThreads.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class Printer extends Thread {

    String text;
    int delay, times;

    public Printer(String text, int times, int delay) {
        this.text = text;
        this.times = times;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {

            System.out.println(text);

            try {
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
