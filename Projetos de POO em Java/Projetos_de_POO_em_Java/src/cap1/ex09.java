package cap1;

import anexo.Input;
import static anexo.Input.lerInt;
import static java.lang.Math.abs;

/**
 * Escrever um programa que aceite N temperaturas inteiras (pelo menos duas) e determine a média das
 * temperaturas, o dia (2,3,etc) em que se registou a maior variação em valor absoluto relativamente
 * ao dia anterior e qual o valor efetivo (positivo ou negativo) dessa variação. Os resultados devem
 * ser apresentados sob a forma:
 * <ul>
 * <li> A média das N temperaturas foi de ___ graus;
 * <li> A maior variação de temperaturas registou-se entre os dias ___ e ___ e foi de ___ graus;
 * <li> A temperatura entre o dia __ e o dia ___ subio/desceu ___ graus
 * </ul>
 *
 * @author code36u4r60
 */
public class ex09 {

    public static void main(String[] args) {
        System.out.println("Número de temperaturas a ler: ");
        int n = lerInt();

        System.out.print("Temperatura 1: ");
        int temp = lerInt();
        int soma = temp;

        int dia = 0;
        int maiorDiff = 0;
        int tempAnt;
        String txt = "";

        for (int i = 2; i <= n; i++) {
            tempAnt = temp;
            System.out.printf("Temperatura %d : ", i);
            temp = lerInt();
            soma += temp;
            int difReal = temp - tempAnt;
            int difAbs = abs(difReal);

            if (difAbs > maiorDiff) {
                dia = i;
                maiorDiff = difAbs;
                txt = (difReal < 0) ? "desceu" : "subiu";
            }

        }

        System.out.printf("A média das %d temperaturas foi de %.2f graus %n", n, ((double) soma) / n);
        System.out.printf("A maior variação de temperaturas registou-se entre os dias %d e %d e foi de %d %n", dia - 1, dia, maiorDiff);
        System.out.printf("A temperatura entre o dia %d e o dia %d %s %d graus %n", dia - 1, dia, txt, maiorDiff);

    }

}
