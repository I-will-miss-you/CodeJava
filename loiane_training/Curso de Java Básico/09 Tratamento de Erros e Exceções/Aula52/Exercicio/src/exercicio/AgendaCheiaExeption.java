/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio;

/**
 *
 * @author code36u4r60
 */
public class AgendaCheiaExeption extends Exception{

    @Override
    public String getMessage() {
        return "Agenda já esta cheia.";
    }

    
}
