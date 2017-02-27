/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leituradadosteclado;

import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class LeituraDadosTeclado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();
        System.out.println("Nome completo: " + nomeCompleto);
       
        System.out.println("Digite o seu primeiro nome:");
        String primeiroNome = scan.next();
        System.out.println("Primeiro nome: " + primeiroNome);
         
        System.out.println("Digite a sua idade:");
        int idade = scan.nextInt();
        System.out.println("A sua idade: " + idade);
        
        System.out.println("Digite a sua altura:");
        double altura = scan.nextDouble();
        System.out.println("A sua altura é: " + altura);
         */
        
        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animais de estimação:");
        String nome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();
        
        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Primeiro Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantiudade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem animais de estimação: " + temPet);
    }

}
