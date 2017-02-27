package exercicios;

/**
 *
 * @author Code36u4r60
 */
public class ContaCorrente {

    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double saldo;

//<editor-fold desc="Construtor's...">
    public ContaCorrente(String numero, String agencia, boolean especial, double limiteEspecial, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.saldo = saldo;
    }

    public ContaCorrente() {
    }
//</editor-fold>

//<editor-fold desc="Getter's and Setter's...">   
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
//</editor-fold>  

    public boolean realizarSaque(double valor) {
       //tem saldo na conta
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else { //não tem saldo na conta
            if (especial) {
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= valor) {
                    saldo -= valor;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; //não é especial e não tem saldo suficiente
            }
        }
    }

    public void depositar(double valorDepositado) {
        saldo += valorDepositado;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual da conta = " + saldo);
    }

    public boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }

}
