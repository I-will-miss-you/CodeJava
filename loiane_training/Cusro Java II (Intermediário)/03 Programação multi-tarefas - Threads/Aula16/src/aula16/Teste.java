package aula16;

/**
 *
 * @author code36u4r60
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 600);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 900);

    }

}
