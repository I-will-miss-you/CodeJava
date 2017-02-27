package exercicios;

/**
 *
 * @author Code36u4r60
 */
public class Contador {

    private static int contador = 0;

    public Contador() {
        contador++;
    }

    public static void incrementar() {
        contador++;
    }

    public static void zerar() {
        contador = 0;
    }
    public static int getContador() {
        return contador;
    }
}
