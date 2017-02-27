/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Date;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        
        livro.nome = "Mastering ExtLS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        
        livro.emprestado = true;
        livro.dataRequisicao = new Date();
        livro.leitorAtual = "Loiane";
        
        System.out.println("Nome do livro = " + livro.nome);
        System.out.println(" " + livro.dataRequisicao);
    }
    
}
