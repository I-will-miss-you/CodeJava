package cap1;

import anexo.Input;

/**
 * Escrever um programa que faça a leitura de uma sequência não vazia de números reais terminada por
 * 0.0 e calcule o seu somatório e o seu produtório com precisão de quatro casa decimais no
 * resultado.
 *
 * @author code36u4r60
 */
public class ex07 {

    public static void main(String[] args) {
        double soma = 0, prod = 1;

        System.out.print("Número real = ");
        double num = Input.lerDouble();
        while (num != 0.0) {
            soma += num;
            prod *= num;
            System.out.print("Número real = ");
            num = Input.lerDouble();
        }

        System.out.printf("Somatório = %.4f%nProdutório = %.4f %n", soma, prod);
    }

}
