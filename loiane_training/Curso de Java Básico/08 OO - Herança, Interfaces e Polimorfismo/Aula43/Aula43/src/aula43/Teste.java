/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula43;

/**
 *
 * @author fonse
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("Ciência da Computação");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);
        System.out.println(aluno);

        /*
        String s1 = "afdsdfsdf";
        String s2 = "afdsdfsdf";
        System.out.println(s1.equals(s2));

        
        
        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Ciência da Computação");
        double[] notas2 = {9, 8, 6, 7};
        aluno2.setNotas(notas2);
        System.out.println(aluno.equals(aluno2));
*/
    }

}
