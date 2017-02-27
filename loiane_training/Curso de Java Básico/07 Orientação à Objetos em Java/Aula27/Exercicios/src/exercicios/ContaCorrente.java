/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author Code36u4r60
 */
public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    public boolean realizarSaque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        if (especial && (limiteEspecial - valorEspecialUsado + saldo) >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    void consultarSaldo() {
        System.out.println("Saldo atual da conta = " + saldo);
    }
    
    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }
}
