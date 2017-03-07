/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author code36u4r60
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.DOMINGO;
        System.out.println(dia.toString() + " - " + dia.getValor());
        
        Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
    }

}
