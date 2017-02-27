package exercicio1;

import java.util.Calendar;

/**
 *
 * @author Code36u4r60
 */
public class ContaPoupanca extends ContaBancaria {

    //<editor-fold defaultstate="collapsed" desc="Attributes...">
    private int diaRendimento;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor's...">
    public ContaPoupanca(int diarendimento, String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diarendimento;
    }
    
    public ContaPoupanca(int diarendimento) {
        this.diaRendimento = diarendimento;
    }
    
    public ContaPoupanca() {
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getter's and Setter's...">
    public int getDiaRendimento() {
        return diaRendimento;
    }
    
    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Methods...">
    public boolean calcularNovoSaldo(double taxaRendimento) {
        int hoje = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        if (diaRendimento == hoje) {
            super.setSaldo(super.getSaldo() + super.getSaldo() * taxaRendimento);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "ContaPoupanca{" + "diaRendimento=" + diaRendimento + "; " + super.toString() + '}';
    }
    //</editor-fold>

}
