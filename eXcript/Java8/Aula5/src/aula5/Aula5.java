package aula5;

/**
 *
 * @author code36u4r60
 */
public class Aula5 {

    interface Num {

        double getValue();
    }

    public static void main(String[] args) {

        Num n;
        n = () -> 333.11;
        System.out.println(n.getValue());
    }

}
