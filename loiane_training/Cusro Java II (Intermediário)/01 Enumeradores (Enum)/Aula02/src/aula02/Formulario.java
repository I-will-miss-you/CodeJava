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
public class Formulario {

    enum Genero {
        FEMININO('F'), MASCULINO('M');

        private char valor;

        private Genero(char valor) {
            this.valor = valor;
        }
    }
    
    private String nome;
    private Genero genero;

}
