/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio11 {

    /* Exercicio 11
     * As Organizações Tabajara resolveram dar um aumento de salário aos
     * seus colaboradores e lhe contraram para desenvolver o programa que
     * calculará os reajustes.
     * 
     * Faça um programa que recebe o salário de um colaborador e o
     *   reajuste segundo o seguinte critério, baseado no salário atual:
     *  - salários até R$ 280,00 (incluindo) : aumento de 20%
     *  - salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
     *  - salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
     *  - salários de R$ 1500,00 em diante : aumento de 5%
     * 
     * Após o aumento ser realizado, informe na tela:
     *  - salário antes do reajuste;
     *  - percentual de aumento aplicado;
     *  - valor do aumento;
     *  - novo salário, após o aumento.
     */
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Salário: ");
        double salario = input.nextDouble();
        double aumento = 0;
        
        if(salario <= 0){
            System.out.println("Erro no valor do salário...");   
        }else if(salario <= 280){
            aumento = 0.2; 
        }else if(salario > 280 && salario <= 700){
            aumento = 0.15;
        }else if(salario > 700 && salario <= 1500){
            aumento = 0.10;
        }else{
            aumento = 0.05;
        }
        
        System.out.println("O seu salário antes do aumento: " + salario);
        double valor_aumento = salario * aumento; 
        salario += valor_aumento;
        System.out.println("Salário atual: " + salario);
        System.out.println("Foi aumentado em: " + valor_aumento);
        System.out.println("Percentagem de aumento: " + aumento);

    }
    
}
