/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20;

/**
 *
 * @author code36u4r60
 */
public class ThreadTiqueTaque implements Runnable {

    private TiqueTaque tt;
    private Thread t;

    final int NUM = 5;

    public ThreadTiqueTaque(String nome, TiqueTaque tt) {
        this.tt = tt;
        t = new Thread(this, nome);
        t.start();
    }

    @Override
    public void run() {
        if (getT().getName().equalsIgnoreCase("tique")) {
            for (int i = 0; i < NUM; i++) {
                getTt().tique(true);
            }
            getTt().tique(false);
        } else {
            for (int i = 0; i < NUM; i++) {
                getTt().taque(true);
            }
            getTt().taque(false);
        }
    }

    /**
     * @return the tt
     */
    public TiqueTaque getTt() {
        return tt;
    }

    /**
     * @param tt the tt to set
     */
    public void setTt(TiqueTaque tt) {
        this.tt = tt;
    }

    /**
     * @return the t
     */
    public Thread getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(Thread t) {
        this.t = t;
    }

}
