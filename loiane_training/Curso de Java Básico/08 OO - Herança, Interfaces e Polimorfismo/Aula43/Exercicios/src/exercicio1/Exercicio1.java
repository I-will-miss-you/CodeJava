package exercicio1;

import java.util.Calendar;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio1 {

    public static void main(String[] args) {
        //testeContaBancaria();
        //testeContaPoupanca();
        testeContaEspecial();
    }

    public static void testeContaBancaria() {
        System.out.println("\nTeste - Construtor");
        ContaBancaria conta = new ContaBancaria("NomeCliente", "numConta", 123.45);
        System.out.println(conta);

        System.out.println("\nTeste  - set");
        conta.setNomeCliente("Cliente");
        conta.setNumConta("num123");
        conta.setSaldo(18);
        System.out.println(conta);

        System.out.println("\nTeste - get");
        System.out.println(conta.getNomeCliente());
        System.out.println(conta.getNumConta());
        System.out.println(conta.getSaldo());

        System.out.println("\nTeste - sacar");
        //System.out.println(conta.sacar(15));
        System.out.println(conta.sacar(1500));
        System.out.println(conta);

        System.out.println("\nTeste - depositar");
        conta.depositar(1500);
        System.out.println(conta);
    }

    public static void testeContaPoupanca() {
        System.out.println("\nTeste - Construtor");
        ContaPoupanca conta = new ContaPoupanca(0, "nomeCliente", "numConta", 123.45);
        System.out.println(conta);

        System.out.println("\nTeste  - set");
        conta.setNomeCliente("Cliente");
        conta.setNumConta("num123");
        conta.setSaldo(18);
        conta.setDiaRendimento(12);
        System.out.println(conta);

        System.out.println("\nTeste - get");
        System.out.println(conta.getNomeCliente());
        System.out.println(conta.getNumConta());
        System.out.println(conta.getSaldo());
        System.out.println(conta.getDiaRendimento());

        System.out.println("\nTeste - sacar");
        //System.out.println(conta.sacar(15));
        System.out.println(conta.sacar(1500));
        System.out.println(conta);

        System.out.println("\nTeste - depositar");
        conta.depositar(1500);
        System.out.println(conta);

        System.out.println("\n Teste - novo saldo");
        conta.calcularNovoSaldo(10);
        System.out.println(conta);
        conta.setDiaRendimento(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        conta.calcularNovoSaldo(10);
        System.out.println(conta);
    }

    public static void testeContaEspecial() {
        System.out.println("\nTeste - Construtor");
        ContaEspecial conta = new ContaEspecial(2000,"NomeCliente", "numConta", 123.45);
        System.out.println(conta);

        System.out.println("\nTeste  - set");
        conta.setNomeCliente("Cliente");
        conta.setNumConta("num123");
        conta.setSaldo(18);
        
        System.out.println(conta);

        System.out.println("\nTeste - get");
        System.out.println(conta.getNomeCliente());
        System.out.println(conta.getNumConta());
        System.out.println(conta.getSaldo());

        System.out.println("\nTeste - sacar");
        //System.out.println(conta.sacar(1500));
        System.out.println(conta.sacar(5500));
        System.out.println(conta);

        System.out.println("\nTeste - depositar");
        conta.depositar(1500);
        System.out.println(conta);
    }
}
