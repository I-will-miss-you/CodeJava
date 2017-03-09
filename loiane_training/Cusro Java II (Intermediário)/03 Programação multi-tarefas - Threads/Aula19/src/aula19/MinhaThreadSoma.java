/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula19;

/**
 *
 * @author code36u4r60
 */
public class MinhaThreadSoma implements Runnable {

    private String nome;
    private int[] nums;
    private static Calculadora calc = new Calculadora();

    public MinhaThreadSoma(String nome, int[] nums) {
        this.nome = nome;
        this.nums = nums;
        new Thread(this, nome).start();

    }

    @Override
    public void run() {
        System.out.println(this.nome + " iniciada...");
        int soma = calc.somaArray(this.nums);
        System.out.println("Resultado da soma para thread " + this.nome + " é: " + soma);
        System.out.println(this.nome + "terminada...");
    }

}
