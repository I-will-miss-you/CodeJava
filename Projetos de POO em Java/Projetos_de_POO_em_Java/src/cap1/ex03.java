package cap1;

import java.util.Scanner;

/**
 * Sendo N dado pelo utilizador, leia N reais e dê os resultados das suas potências de expoente Exp
 * também introduzido pelo utilizador ( por exemplo, 2^4 para N = 2 e Exp = 4)
 *
 * @author code36u4r60
 */
public class ex03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir: ");
        int qtNum = input.nextInt();
        System.out.print("Valor de Expoente: ");
        int exp = input.nextInt();

        double num;
        for (int i = 0; i < qtNum; i++) {
            System.out.print("Insira um valor real: ");
            num = input.nextDouble();
            System.out.printf("O %.2f elevado a %d = %.2f %n", num, exp, Math.pow(num, exp));
        }
    }

}
