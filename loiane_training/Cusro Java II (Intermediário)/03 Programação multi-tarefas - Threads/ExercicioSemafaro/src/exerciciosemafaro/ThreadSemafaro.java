/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosemafaro;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author code36u4r60
 */
public class ThreadSemafaro implements Runnable {

    private CorSemafaro cor;
    private boolean parar;
    private boolean corMudou;

    public ThreadSemafaro() {
        this.cor = CorSemafaro.VERMELHO;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!parar) {
            try {
                /*
                switch (this.cor) {
                    case VERMELHO:
                        Thread.sleep(3000);
                        break;

                    case AMARELO:
                        Thread.sleep(1000);
                        break;
                    case VERDE:
                        Thread.sleep(5000);
                        break;
                    default:
                        break;
                }
                 */
                Thread.sleep(this.cor.getTempoEspera());
                //mudar a cor
                mudarCor();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSemafaro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private synchronized void mudarCor() {
        switch (this.cor) {
            case VERMELHO:
                this.cor = CorSemafaro.VERDE;
                break;
            case AMARELO:
                this.cor = CorSemafaro.VERMELHO;
                break;
            case VERDE:
                this.cor = CorSemafaro.AMARELO;
                break;
            default:
                break;
        }
        this.corMudou = true;
        notify();
    }

    public synchronized void desligarSemafaro() {
        this.parar = true;
    }

    public synchronized void esperaCorMudar() {
        while (!this.corMudou) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSemafaro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.corMudou = false;
    }

    public CorSemafaro getCor() {
        return cor;
    }

}
