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
public class ContatoNaoExisteException extends Exception{

    private String nomeContato;

    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return "Contato " + nomeContato + " não exite na agenda.";
    }
    
    
    
    
}
