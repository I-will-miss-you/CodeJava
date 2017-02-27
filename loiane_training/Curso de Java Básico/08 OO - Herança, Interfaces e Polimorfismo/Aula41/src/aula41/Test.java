
package aula41;

/**
 *
 * @author Code36u4r60
 */
public class Test {

    public static void main(String[] args) {
        //Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        
        //pessoa.setEndereco("Rua 1, num 1");
        aluno.setEndereco("Rua 2, num 2");
        professor.setEndereco("Rua 3, num 3");
        
        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
        
    }
    
}
