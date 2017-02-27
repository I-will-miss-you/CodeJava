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
public class Exercicio16 {

    /**
     * A série de Fibonacci é formada pela seqüência
     * 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o
     * valor seja maior que 500.
     */
    public static void main(String[] args) {
        int x0 = 0, x1 = 1, aux = x0 + x1;
        
        System.out.println(x0);
        System.out.println(x1);
        System.out.println(aux);
        
        while((aux = x0 + x1) < 500){
            x0 = x1;
            x1 = aux;
            System.out.println(aux);
        }
    }

}
