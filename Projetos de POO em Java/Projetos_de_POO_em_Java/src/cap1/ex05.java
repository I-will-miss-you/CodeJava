package cap1;

import anexo.Input;

/**
 *
 * @author code36u4r60
 */
public class ex05 {

    /**
     * Escrever um programa qeue aceite N classificações (números reais) entre 0 e 20 e determinar a
     * sua média (usar printf() para os resultados). A partir deste deve usar-se a classe Input
     * apresentada no Anexo do final do livro, que apresenta vantagens relativamente à utilização
     * direta de Scanner. Os métodos de Input são lerInt(), lerDouble(), lerString(), etc...
     * procurando-se alguma distinção dos métedos de Scanner
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Total de notas a ler: ");
        int qtdNotas = Input.lerInt();

        double soma = 0;
        for (int i = 1; i <= qtdNotas; i++) {
            System.out.printf("Nota %d : ", i);
            soma += Input.lerDouble();
        }

        double media = soma / qtdNotas;
        System.out.printf("Média final = %.2f %n", media);
    }

}
