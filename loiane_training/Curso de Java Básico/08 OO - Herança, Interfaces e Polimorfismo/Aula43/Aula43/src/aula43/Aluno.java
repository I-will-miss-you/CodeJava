package aula43;

import java.util.Arrays;
/**
 *
 * @author Code36u4r60
 */
public class Aluno {
    private String curso;
    private double[] notas;

    //<editor-fold defaultstate="collapsed" desc="Constructor's...">
    public Aluno() {
    }

    public Aluno(String curso, double[] notas, String nome, String endereco, String telefone, String cpf, String telemovel) {
        //super(nome, endereco, telefone, cpf, telemovel);
        this.curso = curso;
        this.notas = notas;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getter's and Setter's...">
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    //</editor-fold>

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void verificarAcesso(){  
     //this.nomeVisibilidade = "OLKJHGF";
    }
    
    public String obterEtiquetaEndereco() {
        return "Endereço do aluno: "; //+ super.getEndereco();
    }

    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }
/*
    @Override
    public String toString() {
        String str = curso + "\n";
        for (double nota : notas) {
            str += nota + " ";
        }
        return str;
    }
    */

    @Override
    public String toString() {
        return "Aluno{" + "curso=" + curso + ", notas=" + Arrays.toString(notas)+ '}';
    }
    
}
