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
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "01234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.valorEspecialUsado = 0;
        conta.saldo = -10;

        boolean saque = conta.realizarSaque(300);
        System.out.println(saque ? "Saque efetuado com sucesso. Saldo atual = "
                + conta.saldo : "Não foi possivel realizar o saque. Saldo insuficiente.");
        saque = conta.realizarSaque(300);
        System.out.println(saque ? "Saque efetuado com sucesso. Saldo atual = "
                + conta.saldo : "Não foi possivel realizar o saque. Saldo insuficiente.");

                System.out.println(conta.verificarUsoChequeEspecial()?"Está sendo usudo":"Nao está sendo usudo");
        
        conta.depositar(550);
        conta.consultarSaldo();
        
        System.out.println("O cheque especial, " + (conta.verificarUsoChequeEspecial()?"está sendo usado":"não está sendo usado"));

    }

}
