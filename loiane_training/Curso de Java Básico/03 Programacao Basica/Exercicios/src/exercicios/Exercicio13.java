/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author fonse
 */
public class Exercicio13 {

    /* Exercicio 13 
     * Faça um Programa que pergunte quanto você ganha por hora e o
     * número de horas trabalhadas no mês. Calcule e mostre o total do seu
     * salário no referido mês, sabendo-se que são descontados 11% para o
     * Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
     * programa que nos dê:
     * . salário bruto.
     * a. quanto pagou ao INSS.
     * b. quanto pagou ao sindicato.
     * c. o salário líquido.
     * d. calcule os descontos e o salário líquido, conforme a tabela
     * abaixo:
     * + Salário Bruto : R$ - IR (11%) : R$ - INSS
     * (8%) : R$ - Sindicato ( 5%) : R$ = Salário
     * Liquido : R$
     * Obs.: Salário Bruto - Descontos = Salário Líquido.
    */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Preço por hora: ");
        double precoHora = scan.nextDouble();
        
        System.out.println("Número de horas de trabalho por mês: ");
        int numHoras = scan.nextInt();
        
        double salarioBruto = precoHora * numHoras;
        double impostoRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;
        
        System.out.println("Salário Bruto = " + salarioBruto);
        System.out.println("Imposto de Renda = " + impostoRenda);
        System.out.println("INSS = " + inss);
        System.out.println("Sindicato = " + sindicato);
        System.out.println("Salário Liquido = " + salarioLiquido);
    }
    
}
