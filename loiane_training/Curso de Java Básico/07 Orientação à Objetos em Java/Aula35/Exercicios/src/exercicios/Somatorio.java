package exercicios;

/**
 *
 * @author Code36u4r60
 */
public class Somatorio {

    public static int somatorio(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return n + somatorio(--n);
    }

}
