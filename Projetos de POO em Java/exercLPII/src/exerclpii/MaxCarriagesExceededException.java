package exerclpii;

/**
 *
 * @author code36u4r60
 */
public class MaxCarriagesExceededException extends Exception {

    public MaxCarriagesExceededException() {
        super("Número máximo possível de carruagens");
    }

    public MaxCarriagesExceededException(String msg) {
        super(msg);
    }
}
