package exercicio2;

/**
 *
 * @author code36u4r60
 */
public class PessoaFisica extends Contribuinte {
    
//<editor-fold defaultstate="collapsed" desc="Attributes...">

    private String cpf;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Constructor's...">
    public PessoaFisica() {
    }

    public PessoaFisica(String cpf, String nome, double rendaBruta) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getter's and Setter's...">
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Methods...">
    @Override
    public double calcularImposto() {
        double renda = super.getRendaBruta();
        if (renda <= 1400) {
            return 0;
        }
        if (renda > 1400 && renda <= 2100) {
            return (renda * 0.1) - 100;
        }
        if (renda > 2100 && renda <= 2800) {
            return (renda * 0.15) - 270;
        }
        if (renda > 2800 && renda <= 3600) {
            return (renda * 0.25) - 500;
        }
        return (renda * 0.3) - 700;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "cpf=" + cpf + "; " + super.toString() + '}';
    }
//</editor-fold>    
}
