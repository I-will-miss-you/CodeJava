package curso;

/**
 *
 * @author Code36u4r60
 */
public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void infoAluno() {
        System.out.println("Nome Aluno: " + nome);
        System.out.println("Matricula: " + matricula);
        String aprovado = (getMedia() >= 7) ? "Aprovado" : "Não Aprovado";
        System.out.println("Média final: " + getMedia() + ". Aluno " + aprovado + ". ");
    }

    @Override
    public String toString() {
        String info;
        info = "Nome Aluno: " + nome;
        info += "\nMatricula: " + matricula;
        String aprovado = (getMedia() >= 7) ? "Aprovado" : "Não Aprovado";
        info += "\nMédia final: " + getMedia() + ". Aluno " + aprovado + ". ";
        return info;
    }
}
