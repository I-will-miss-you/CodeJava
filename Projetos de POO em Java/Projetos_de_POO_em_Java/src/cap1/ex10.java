package cap1;

import anexo.Input;
import java.time.LocalTime;

/**
 * Escreva um programa que determine a data e hora do sistema, realize a leitura de um número
 * inteiro dado pelo utilizador, seja tal valor X, e realize um ciclo com X milhões de incremetos
 * unitárioa de uma dada vriável. O programa deverá, em seguida, determinar a hora do sistema após a
 * realização de tal ciclo e calcular o total de milissegundos que tal ciclo demorou a executar.
 *
 * @author code36u4r60
 */
public class ex10 {

    public static void main(String[] args) {

        System.out.print("Insira um valor inteiro: ");
        //int num = 1_000_000 * Input.lerInt();
        int num = Input.lerInt();

        System.out.println(num);

        LocalTime start = LocalTime.now();
        double x = 0;
        for (int i = 0; i < num; i++) {
            x++;
        }
        LocalTime end = LocalTime.now();

        double diffTime = end.toNanoOfDay() - start.toNanoOfDay();
        System.out.println("A operação demorou " + diffTime + " milisegundos.");
        System.out.println("Valor de x = " + x + ".");
    }

}
