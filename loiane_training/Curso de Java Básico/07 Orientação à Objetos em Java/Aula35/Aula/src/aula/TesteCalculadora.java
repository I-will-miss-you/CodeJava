package aula;

/**
 *
 * @author Code36u4r60
 */
public class TesteCalculadora {

    public static void main(String[] args) {

        int NR = Calculadora.fatorialNaoRecursivo(10);
        int R = Calculadora.fatorialRecursivo(10);

        System.out.println("Não Rec: " + NR);
        System.out.println("Rec: " + R);

    }

}
