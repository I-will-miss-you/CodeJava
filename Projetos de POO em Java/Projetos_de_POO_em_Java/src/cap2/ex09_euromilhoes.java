package cap2;

import anexo.Input;
import java.util.Arrays;
import java.util.Random;

/**
 * Escrever um programa que simule o jogo do Euromilhões. O programa gera aleatoriamente uma chave
 * contendo cinco números (de 1 a 50) e duas estrelas (1 a 12). Em seguida são pedidos ao utilizador
 * cinco números e duas estrelas (a aposta). O programa deverá depois apresentar a chave gerada e o
 * número de números e de estrelas certas na aposta do utilizador. Devem, naturalmente ser usados
 * arrays para guardar os dados.
 *
 * @author code36u4r60
 */
public class ex09_euromilhoes {

    public static void main(String[] args) {
        int[] num = gerarNumeros(5, 50);
        int[] estrelas = gerarNumeros(2, 12);

        System.out.println("A sua aposta: \nDigite 5 números de 1-50: ");
        int[] numAposta = lerNumeros(5, 50);
        System.out.println("Agora digite 2 \"estrelas\" de 1-12: ");
        int[] estrelasAposta = lerNumeros(2, 12);
        System.out.println("Obrigado pelo sua aposta");

        System.out.println("Clique \"Enter\" para saber se ganhou...");
        Input.lerString();

        System.out.println("\n\nNúmeros sortedos: ");
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(estrelas));
        System.out.println("\nOs seus números: ");
        System.out.println(Arrays.toString(numAposta));
        System.out.println(Arrays.toString(estrelasAposta));

        System.out.println("\nVoce acertou " + qtdAcertos(num, numAposta)
                + " números e " + qtdAcertos(estrelas, estrelasAposta) + " estrelas...");

    }

    static int qtdAcertos(int[] secreto, int[] apostas) {
        int contador = 0;
        for (Integer i : apostas) {
            if (existe(secreto, i)) {
                contador++;
            }
        }
        return contador;
    }

    static int[] lerNumeros(int qtd, int max) {
        int contador = 0;
        int[] lista = new int[qtd];
        int aux = 0;
        boolean notOk = true;
        while (contador < qtd) {
            System.out.print("Insira o seu " + (contador + 1) + " número: ");
            aux = lerNumero(max);
            if (existe(lista, aux)) {
                System.out.println("Esse número já foi selecionado.");
            } else {
                lista[contador] = aux;
                contador++;
            }

        }
        return lista;

    }

    static int lerNumero(int max) {
        int num = 0;
        boolean invalido = true;
        while (invalido) {
            num = Input.lerInt();
            if (num < 1 || num > max) {
                System.out.println("Número invalido, o intervalo de valores aceites é de [1 - " + max + "].");
                System.out.print("Digite novamente: ");
            } else {
                invalido = false;
            }
        }
        return num;
    }

    static int[] gerarNumeros(int n, int max) {
        int contador = 0;
        int[] lista = new int[n];
        int aux;
        while (contador < n) {
            aux = gerarNum(max);
            if (!existe(lista, aux)) {
                lista[contador] = aux;
                contador++;
            }
        }
        return lista;
    }

    static int gerarNum(int num) {
        return new Random().nextInt(num) + 1;
    }

    static boolean existe(int[] lista, int num) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == num) {
                return true;
            }
        }
        return false;
    }

}
