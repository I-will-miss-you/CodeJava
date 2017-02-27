/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.text.DecimalFormat;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio31 {

    /*
     * Um funcionário de uma empresa recebe aumento salarial anualmente:
     * Sabe-se que:
     * . Esse funcionário foi contratado em 1995, com salário inicial de
     * R$ 1.000,00;
     * a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
     * b. A partir de 1997 (inclusive), os aumentos salariais sempre
     * correspondem ao dobro do percentual do ano anterior. Faça um
     * programa que determine o salário atual desse funcionário. Após
     * concluir isto, altere o programa permitindo que o usuário digite o
     * salário inicial do funcionário.
     */
    public static void main(String[] args) {
        int anoIni = 1995 , anoAtual = 2017;
        double salarioIni = 1_000.00 , percAmento = 0.0015;
        double salario = salarioIni + salarioIni * 0.0015; 
        
        DecimalFormat format = new DecimalFormat("###,###.##");
        
        for (int i = anoIni; i < anoAtual; i++) {
        percAmento *= 2;
        salario += salario * percAmento;
        }
        
        System.out.println("Ordenado actual: " + format.format(salario));
    }
    
}
