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
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro livro = new Livro();
        
        livro.nome = "Mastering ExtLS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        
        System.out.println("Nome do livro = " + livro.nome);
    }
    
}
