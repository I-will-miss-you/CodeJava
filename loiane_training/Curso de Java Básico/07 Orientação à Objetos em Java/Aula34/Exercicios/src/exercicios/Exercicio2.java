/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author fonse
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        print(Calculadora.somar(5, 10));
     
        print(Calculadora.subtrair(5, 10));
        
        print(Calculadora.multiplicar(5, 10));
        
        print(Calculadora.dividir(5, 10));
    
        print(Calculadora.elevarPotencia(5, 10));
        
        print(Calculadora.fatorial(5));
    }
    
    public static void print(double val){
        System.out.println(val);
    }
}
