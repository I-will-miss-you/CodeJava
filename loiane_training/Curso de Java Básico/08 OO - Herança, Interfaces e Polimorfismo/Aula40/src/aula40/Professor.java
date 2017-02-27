package aula40;

/**
 *
 * @author Code36u4r60
 */
public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;

    //<editor-fold defaultstate="collapsed" desc="Constructor's...">
    public Professor() {
    }

    public Professor(double salario, String nomeCurso, String nome, String endereco, String telefone, String cpf, String telemovel) {
        super(nome, endereco, telefone, cpf, telemovel);
        this.salario = salario;
        this.nomeCurso = nomeCurso;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getter's and Setter's...">
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
//</editor-fold>

    public double calcularSalarioLiquido() {
        return 0;
    }

    @Override
    public String obterEtiquetaEndereco() {
        return "Endereço do professor: " + super.getEndereco();
    }

}
