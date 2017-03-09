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

    TiqueTaque tt;
    Thread t;

    final int NUM = 5;

    public ThreadTiqueTaque(String nome, TiqueTaque tt) {
        this.tt = tt;
        t = new Thread(this, nome);
        t.start();
    }

    @Override
    public void run() {
        if (t.getName().equalsIgnoreCase("tique")) {
            for (int i = 0; i < NUM; i++) {
                tt.tique(true);
            }
            tt.tique(false);
        } else {
            for (int i = 0; i < NUM; i++) {
                tt.taque(true);
            }
            tt.taque(false);
        }
    }

}
