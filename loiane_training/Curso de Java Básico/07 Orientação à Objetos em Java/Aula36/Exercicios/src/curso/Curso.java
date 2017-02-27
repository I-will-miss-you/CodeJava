package curso;

/**
 *
 * @author Code36u4r60
 */
public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso(String nome, String horario, Professor professor, Aluno[] alunos) {
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
        this.alunos = alunos;
    }

    public Curso(Curso c) {
        this(c.nome, c.horario, c.professor, c.alunos);
    }

    public Curso() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public double getMediaTurma() {
        double soma = 0;
        if (alunos != null) {
            for (Aluno aluno : alunos) {
                if (aluno != null) {
                    soma += aluno.getMedia();
                }
            }
            return soma / alunos.length;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        String info = "Nome do Curso = " + nome + "\n";
        info += (professor != null) ? professor.toString() + "\n" : "Professor: Não existe informação.\n";

        if (alunos != null) {
            info += "Alunos:\n";
            for (Aluno aluno : alunos) {
                    info += aluno.toString() + "\n";
                
            }
        }

        info += "\nMédia da turma = " + getMediaTurma();
        return info;
    }

}
