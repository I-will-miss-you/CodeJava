/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author fonse
 */
public class CurtoCircuito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;

        boolean resultado1 = falso & 
                verdadeiro;
        boolean resultado2 = falso && 
                verdadeiro;

        System.out.println(resultado1);
        System.out.println(resultado2);
        
        int resultado = 1 + 1 - 1 + 1 * 1 / 1;

        System.out.println(resultado);
  
    }

}
