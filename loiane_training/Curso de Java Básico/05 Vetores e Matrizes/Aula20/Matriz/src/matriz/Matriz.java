/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author Code36u4r60
 */
public class Matriz {

    public static void main(String[] args) {
        double[][] notaAlunos = new double[3][4];

        notaAlunos[0][0] = 10;
        notaAlunos[0][1] = 7;
        notaAlunos[0][2] = 9;
        notaAlunos[0][3] = 9.5;

        notaAlunos[1][0] = 9;
        notaAlunos[1][1] = 8;
        notaAlunos[1][2] = 7;
        notaAlunos[1][3] = 9;

        notaAlunos[2][0] = 9;
        notaAlunos[2][1] = 8;
        notaAlunos[2][2] = 10;
        notaAlunos[2][3] = 7;

        for (double[] notaAluno : notaAlunos) {
            for (int j = 0; j < notaAluno.length; j++) {
                System.out.print(notaAluno[j] + "   ");
            }
            System.out.println("");
        }

        notaAlunos[1][3] = 8;
        System.out.println("");
        for (double[] notaAluno : notaAlunos) {
            for (int j = 0; j < notaAluno.length; j++) {
                System.out.print(notaAluno[j] + "   ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Calculo da média:");
        double soma;
        for (int i = 0; i < notaAlunos.length; i++) {
            soma = 0;
            for (int j = 0; j < notaAlunos[i].length; j++) {
                soma += notaAlunos[i][j];
            }
            System.out.println("Média do aluno " + (i + 1) + " é = " + (soma / 4));
        }

        //double[] notasAluno1 = {7,8,9,10};
        double[][] notasAlunos2 = {{7,8,9,10},{8,6,7,10}};
        
        System.out.println("");
        for (double[] notaAluno : notasAlunos2) {
            for (int j = 0; j < notaAluno.length; j++) {
                System.out.print(notaAluno[j] + "   ");
            }
            System.out.println("");
        }
        
    }
}
