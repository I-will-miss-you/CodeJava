package aula38;

/**
 *
 * @author Code36u4ar60
 */
public class Super {

    public static void main(String[] args) {

        //Aluno aluno = new Aluno(curso, notas, nome, endereco, telefone, cpf, telemovel);
        double[] notas = {12, 13, 12, 16};
        Aluno aluno = new Aluno("Inf", notas, "ALuno", "endereco", "telefone", "cpf", "telemovel");

        System.out.println(aluno.getCurso());
        for (double nota : aluno.getNotas()) {
            System.out.println(nota);
        }

    }

}
