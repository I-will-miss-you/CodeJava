package aula15;


/**
 *
 * @author code36u4r60
 */
public class MinhaThread extends Thread {

    private String nome;
    private int tempo;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(nome + " terminou a execução...");
    }

}
