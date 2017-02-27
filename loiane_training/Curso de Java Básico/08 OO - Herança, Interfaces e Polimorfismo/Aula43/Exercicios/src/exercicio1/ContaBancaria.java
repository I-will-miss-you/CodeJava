package exercicio1;

/**
 *
 * @author Code36u4r60
 */
public class ContaBancaria {

    //<editor-fold defaultstate="collapsed" desc="Attributes...">
    private String nomeCliente;
    private String numConta;
    private double saldo;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor's...">
    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getter's and Setter's...">
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Methods...">
    public boolean sacar(double valor) {
        if(saldo - valor >= 0 ){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + '}';
    }
//</editor-fold>
}


