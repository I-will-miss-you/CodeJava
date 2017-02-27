/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.nome = "João";
        contato.endereco = "Av Paulista, 1000";
        contato.email="mail@mail.com";
        
        contato.telefone = new String[5];
        contato.telefone[0] = "99999-9999";
        contato.telefone[1] = "99999-9998";
        contato.telefone[2] = "99999-9997";
        
    }
    
}
