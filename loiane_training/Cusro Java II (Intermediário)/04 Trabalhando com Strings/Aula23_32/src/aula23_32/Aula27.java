package aula23_32;

/**
 *
 * @author code36u4r60
 */
public class Aula27 {

    public static void main(String[] args) {
        String banana = "banana";
        String ana = "ana";

        System.out.println(banana.indexOf('x'));
        System.out.println(banana.indexOf('b'));
        System.out.println(banana.indexOf('a'));

        System.out.println(banana.indexOf(ana));

        System.out.println(banana.lastIndexOf('a'));
        System.out.println(banana.lastIndexOf(ana));

        System.out.println(banana.contains(ana));
        System.out.println(banana.contains("ceu"));
    }

}
