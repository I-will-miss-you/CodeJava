package exercicio1;

/**
 *
 * @author Code36u4r60
 */
public class ContaEspecial extends ContaBancaria {

    //<editor-fold defaultstate="collapsed" desc="Attributes...">
    private double limite;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor's...">
    public ContaEspecial() {
    }

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(double limite, String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getter's and Setter's...">
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Methods...">
    @Override
    public boolean sacar(double valor) {
        double saldoComLimite = super.getSaldo() + this.limite;
        if ((saldoComLimite - valor) >= 0) {
            super.setSaldo(super.getSaldo() - valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" + "limite=" + limite + ";" + super.toString() + '}';
    }
    //</editor-fold>

}
