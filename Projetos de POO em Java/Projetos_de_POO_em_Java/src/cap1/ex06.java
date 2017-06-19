package cap1;

import static anexo.Input.lerDouble;
import static java.lang.Math.PI;

/**
 *
 * @author code36u4r60
 */
public class ex06 {

    /**
     * Escrever um programa que leia sucessivas vezes o raio (real) de um círculo e calcule a área e
     * o périmetro respetivos com grande precisão (cinco casa decimais). Usar print() para os
     * resultados. O programa apenas deverá terminar com a leitura de um raio = 0.0.
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.print("Valor do raio = ");
        double raio = lerDouble();
        while (raio > 0.0) {
            System.out.printf("Área = %.5f%nPerimetro = %.5f %n", 2 * PI * raio * raio, 2 * PI * raio);
            System.out.print("\nValor do raio = ");
            raio = lerDouble();
        }
    }

}
