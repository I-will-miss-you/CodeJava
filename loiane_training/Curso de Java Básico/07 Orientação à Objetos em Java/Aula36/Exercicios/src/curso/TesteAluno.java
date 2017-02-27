
package curso;

/**
 *
 * @author Code36u4r60
 */
public class TesteAluno {

    public static void main(String[] args) {
       
        Aluno aluno = new Aluno();
        
        aluno.setNome("Luana da Silva");
        aluno.setMatricula("12584");
        
        
        double[] notas = new double[4];
        notas[0] = 6;
        notas[1] = 7;
        notas[2] = 8;
        notas[3] = 9;
        
        aluno.setNotas(notas);

        System.out.println(aluno.getMedia());
        
        aluno.infoAluno();
        
        Aluno[] al = new Aluno[3];
        
    }
    
}
