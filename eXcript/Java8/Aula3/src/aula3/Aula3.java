package aula3;

/**
 *
 * @author code36u4r60
 */
public class Aula3 {

    public static void main(String[] args) {
        System.out.println("=== Inicio do teste ===");

        //Implementação da classe anomima Runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Estudando a expressão lambda 1");
            }
        };

        Runnable r;
        r = () //lista de argumentos
                -> //Seta
                System.out.println("Estudando a expressão lambda"); //Corpo da expressáo lambda

        Runnable r2 = () -> System.out.println("Estudando a expressão lambda 2");

        r1.run();
        r.run();
        r2.run();
    }

}
