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
public class Exercicio16 {

    /* Exercicio 16
     * Faça um programa que calcule as raízes de uma equação do segundo
     * grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
     * b e c e fazer as consistências, informando ao usuário nas seguintes
     * situações:
     *  a. Se o usuário informar o valor de A igual a zero, a equação não é
     * do segundo grau e o programa não deve fazer pedir os demais
     * valores, sendo encerrado;
     *  b. Se o delta calculado for negativo, a equação não possui raizes
     * reais. Informe ao usuário e encerre o programa;
     *  c. Se o delta calculado for igual a zero a equação possui apenas
     * uma raiz real; informe-a ao usuário;
     *  d. Se o delta for positivo, a equação possui duas raiz reais;
     * informe-as ao usuário;
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("A: ");
        double a = input.nextDouble();

        if (a == 0) {
            System.out.println("A equação não é do segundo grau...");
        } else {
            System.out.print("B: ");
            double b = input.nextDouble();
            System.out.print("C: ");
            double c = input.nextDouble();
            
            double delta = (b*b) - (4*a*c);
            if (delta < 0){
                System.out.println("detla negativo");
            }else{
                System.out.println("Delta: " + delta);

                double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2*a);

                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        }
    }

}
