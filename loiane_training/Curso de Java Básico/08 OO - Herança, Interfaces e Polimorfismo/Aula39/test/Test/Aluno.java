package Test;

import aula39.Pessoa;

/**
 *
 * @author Code36u4r60
 */
public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    //<editor-fold desc="Constructor's...">
    public Aluno() {
    }

    public Aluno(String curso, double[] notas, String nome, String endereco, String telefone, String cpf, String telemovel) {
        super(nome, endereco, telefone, cpf, telemovel);
        this.curso = curso;
        this.notas = notas;
    }
    //</editor-fold>

    //<editor-fold desc="Getter's and Setter's...">
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

    public void verificarAcesso() {
        nomeVisibilidade = "publico";
    }

}
