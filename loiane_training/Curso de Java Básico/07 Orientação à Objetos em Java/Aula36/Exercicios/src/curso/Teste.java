package curso;

import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class Teste {

    public static void main(String[] args) {
        Curso curso = new Curso(inserirDadosCurso());
        System.out.println(curso.toString());
    }

    public static Curso inserirDadosCurso() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nInformação do curso: ");
        Curso c = new Curso();
        System.out.print("Entre com o nome do curso: ");
        c.setNome(scan.nextLine());
        System.out.print("Entre com o horário do curso: ");
        c.setHorario(scan.nextLine());

        System.out.println("\nInformação do professor: ");
        c.setProfessor(inserirDadosProfessor());
        
        System.out.println("\nInformação dos alunos: ");
        Aluno[] alunos = new Aluno[2];
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno " + (i+1) + ": ");
            alunos[i] = inserirDadosAluno();
        }
        c.setAlunos(alunos);

        return c;
    }

    public static Professor inserirDadosProfessor() {
        Scanner scan = new Scanner(System.in);
        Professor p = new Professor();

        System.out.print("Nome: ");
        p.setNome(scan.nextLine());

        System.out.print("Departamento: ");
        p.setDepartamento(scan.nextLine());

        System.out.print("Email: ");
        p.setEmail(scan.nextLine());

        //System.out.println(p.toString());
        return p;
    }

    public static Aluno inserirDadosAluno() {
        Scanner scan = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.print("Nome: ");
        a.setNome(scan.nextLine());

        System.out.print("Número de Aluno: ");
        a.setMatricula(scan.nextLine());

        double[] notas = new double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i+1)+": ");
            notas[i] = scan.nextDouble();
        }
        
        a.setNotas(notas);
        
        return a;
    }

}
