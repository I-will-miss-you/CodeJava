package aula21;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author code36u4r60
 */
public class Teste {

    public static void main(String[] args) {

        MinhaThread t1 = new MinhaThread("#1");
        MinhaThread t2 = new MinhaThread("#2");

        System.out.println("Pausando a Thread #1");
        t1.suspend();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Pausando a Thread #1");
        t2.suspend();

        System.out.println("Resumindo a Thread #1");
        t1.resume();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Resumindo a Thread #2");
        t2.resume();

        
        System.out.println("Terminando a Thread #2");
        t2.stop();
    }

}
