/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakecontinue;

import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class BreakEContinue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Valor de inicio: ");
        int ini = scan.nextInt();
        System.out.println("Valor de limite: ");
        int fim = scan.nextInt();
        
        for (int i = ini; i < fim; i++) {
            if( i % 7 == 0){
                System.out.println("O valor de i é: " + i);
                break;
            }
        }
         */
 /*
        for (int i = 0; i <= 4; i++) {
            rotulo1:
            {
                rotulo2:
                {
                    rotulo3:
                    {
                        if (i == 1) {
                            break rotulo1;
                        }
                        if (i == 2) {
                            break rotulo2;
                        }
                        if (i == 3) {
                            break rotulo3;
                        }
                        System.out.println("Rotulo 3");
                    }
                    System.out.println("Rotulo 2");
                }
                System.out.println("Rotulo 1");
            }
            System.out.println(i);
        }
         */
        System.out.println("Valor de inicio: ");
        int ini = scan.nextInt();
        System.out.println("Valor de limite: ");
        int fim = scan.nextInt();

        for (int i = ini; i < fim; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }
    }

}
