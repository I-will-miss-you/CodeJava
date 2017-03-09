package aula11;

/**
 *
 * @author code36u4r60
 */
public class ExemploPrintf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.printf("%s%n", "Olá, mundo!");
        System.out.printf("%S%n", "Olá, mundo!");

        System.out.printf("%c%n", 'c');
        System.out.printf("%C%n", 'c');

        int valor = 123456789;
        System.out.printf("%d%n", valor);

        double pontoFlutuante = 3.1456789;
        System.out.printf("%f%n", pontoFlutuante);

        String olaMundo = "Olá, mundo!";
        System.out.printf("%20s%n", olaMundo);

        System.out.printf("%-20s%n", olaMundo);

        System.out.printf("%+d%n", valor);

        System.out.printf("%015d%n", valor);

        System.out.printf("%,d%n", valor);

        int valor2 = -123456;
        System.out.printf("% d%n", valor2);
        System.out.printf("% d%n", valor);

        System.out.printf("%.3f%n", pontoFlutuante);

        System.out.printf("R$%10.2f%n", pontoFlutuante);

        testeMaisCompleto();
        
        
        System.out.println("......................");

    }

    private static void testeMaisCompleto() {
        double[] precos = {1000, 123, 765, 23, 234, 23.56, 344.97};

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", (i + 1), precos[i]);
        }
    }

}
