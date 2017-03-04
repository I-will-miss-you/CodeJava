package exercicio2;

/**
 *
 * @author code36u4r60
 */
public class PessoaJuridica extends Contribuinte {

//<editor-fold defaultstate="collapsed" desc="Attributes...">
    private String cnpj;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Constructor's...">
    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String nome, double rendaBruta) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getter's and Setter's...">
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Methods...">
    @Override
    public double calcularImposto() {
        return super.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "cnpj=" + cnpj + "; " + super.toString() + '}';
    }

//</editor-fold>
}
