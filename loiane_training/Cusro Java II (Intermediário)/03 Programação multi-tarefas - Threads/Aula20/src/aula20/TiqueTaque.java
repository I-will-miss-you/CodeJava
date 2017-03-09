package aula20;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author code36u4r60
 */
public class TiqueTaque {

    boolean tique;

    synchronized void tique(boolean estaExecutando) {
        if (!estaExecutando) {
            tique = true;
            notify();
            return;
        }
        System.out.print(" Tique");
        tique = true;
        notify();

        while (tique) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(TiqueTaque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    synchronized void taque(boolean estaExecutando) {
        if (!estaExecutando) {
            tique = false;
            notify();
            return;
        }
        System.out.println(" Taque");
        tique = false;
        notify();

        while (!tique) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(TiqueTaque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
