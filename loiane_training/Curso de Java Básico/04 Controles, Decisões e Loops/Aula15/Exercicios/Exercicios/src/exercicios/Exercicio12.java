
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio12 {

    /* Exercicio 12
     * Faça um programa para o cálculo de uma folha de pagamento,
     * sabendo que os descontos são do Imposto de Renda, que depende do
     * salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
     * FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
     * a empresa que deposita). O Salário Líquido corresponde ao Salário
     * Bruto menos os descontos. O programa deverá pedir ao usuário o
     * valor da sua hora e a quantidade de horas trabalhadas no mês.
     * o Desconto do IR:
     * o Salário Bruto até 900 (inclusive) - isento
     * o Salário Bruto até 1500 (inclusive) - desconto de 5%
     * o Salário Bruto até 2500 (inclusive) - desconto de 10%
     * o Salário Bruto acima de 2500 - desconto de 20% 
     * Imprima na tela as informações, dispostas conforme o exemplo abaixo. 
     * No exemplo o valor da hora é 5 e a quantidade de hora é 220.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Preço por hora: ");
        float precoHora = input.nextFloat();
        System.out.println("Horas de trabalho:");
        int hTrabalho = input.nextInt();
        
        double salarioBruto = precoHora * hTrabalho;
        
        double percentIR = 0;
        if(salarioBruto <= 0){
            System.out.println("Erro - salário invalido...");
            System.exit(0);
        }else if(salarioBruto <= 900){
            percentIR = 0;
        }else if(salarioBruto > 900 && salarioBruto <= 1500){
            percentIR = 0.05;
        }else if(salarioBruto > 1500 && salarioBruto <= 2500){
            percentIR = 0.1;
        }else{
            percentIR = 0.2;
        }
        

        double ir = salarioBruto * percentIR;
        double inss = salarioBruto * 0.10;
        double fgts = salarioBruto * 0.11;
        double salarioLiquido = salarioBruto - (ir + inss);
        
        System.out.printf("Salário bruto: (%d x %.2f) : R$%.2f \n",hTrabalho,precoHora,salarioBruto);
        System.out.printf(" (-) IR (%.0f%%): R$%.2f\n",percentIR*100,ir);
        System.out.printf(" (-) INSS (10%%): R$%.2f\n",inss);
        System.out.printf("FGTS (11%%): R$%.2f\n",fgts);
        System.out.printf("Total de descontos: R$%.2f\n",(ir+inss));
        System.out.printf("Salário Liquido: R$%.2f\n",salarioLiquido);
    }
    
}
 