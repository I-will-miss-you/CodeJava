package aula21;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author code36u4r60
 */
public class MinhaThread implements Runnable {

    private String nome;
    private boolean estaSuspensa;
    private boolean foiTerminada;

    public MinhaThread() {
    }

    public MinhaThread(String nome) {
        this.nome = nome;
        estaSuspensa = false;
        new Thread(this, nome).start();
        //Thread t = new Thread(this,nome);
        //t.start();
    }

    @Override
    public void run() {
        System.out.println("Executando " + this.nome);

        
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + nome + ", " + i);
                Thread.sleep(500);
                synchronized(this){
                    while(estaSuspensa){
                        wait();
                    }
                    if(this.foiTerminada){
                        break;
                    }
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread " + this.nome + "terminada");
    }

    
    void suspend(){
        this.estaSuspensa = true;
    }
    
    synchronized void resume(){
        this.estaSuspensa = false;
        notify();
    }
    
    synchronized void stop(){
        this.foiTerminada = true;
        notify();
    }
    
}
