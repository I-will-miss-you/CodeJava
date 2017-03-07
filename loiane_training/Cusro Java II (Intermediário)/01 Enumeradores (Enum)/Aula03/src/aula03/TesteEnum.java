/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author code36u4r60
 */
public class TesteEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiaSemana[] dias = DiaSemana.values();
        
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
        }
        
        System.out.println("");
        
        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia);
        }
        
        
    }
    
}
