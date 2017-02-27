package exercicios;

import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.setNome(scan.next());

        System.out.println("Entre com o nome do curso");
        aluno.setNomeCurso(scan.next());

        System.out.println("Entre com a matricula");
        aluno.setMatricula(scan.next());


        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.setNomeDisciplinaPos(i, scan.next());
        }

        for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
            for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
                System.out.println("Entre com a nota " + (j + 1));
                aluno.setNomePosIJ(i, j, scan.nextDouble());
            }
        }

        aluno.mostrarInfo();
        
        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
                System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + (aluno.verificarAprovado(i)?" - foi aprovado":" - reprovado"));
        }
    }
}
