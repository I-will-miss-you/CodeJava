
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class Aluno {

    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];

    public void inserirDados() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        nome = scan.nextLine();

        System.out.print("Nome do curso: ");
        nomeCurso = scan.nextLine();

        System.out.print("Código da matricula: ");
        matricula = scan.next();

        inserirDisciplinas();
        inserirNotas();
    }

    public void inserirDisciplinas() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nomeDisciplinas.length; i++) {
            System.out.print("Nome da disciplina " + (i + 1) + " : ");
            nomeDisciplinas[i] = scan.next();
        }
    }

    public void inserirNotas() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Obtendo notas da disciplina " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print("Nota " + (j + 1) + " : ");
                notasDisciplinas[i][j] = scan.nextDouble();
            }
        }
    }

    void printAlunoInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    void printAprovadoInfo() {
        for (int i = 0; i < nomeDisciplinas.length; i++) {
            if (verificarAprovado(i)) {
                System.out.println("Disciplina " + nomeDisciplinas[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + nomeDisciplinas[i] + " - reprovado");
            }
        }
    }

    boolean verificarAprovado(int indice) {
        return obterMedia(indice) >= 7;
    }

    double obterMedia(int indice) {
        double soma = 0;
        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }
        double media = soma / 4;
        return media;
    }
}
