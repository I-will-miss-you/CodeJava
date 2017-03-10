/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author code36u4r60
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TiqueTaque tt = new TiqueTaque();
        ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
        ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);

        
        try {
            tique.getT().join();
            taque.getT().join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
