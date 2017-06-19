package anexo;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Input {

    public static String lerString() {
        Scanner input = new Scanner(in);
        boolean ok = false;
        String txt = "";
        while (!ok) {
            try {
                txt = input.nextLine();
                ok = true;
            } catch (InputMismatchException e) {
                out.println("Texto Inválido");
                out.print("Novo valor: ");
                input.nextLine();
            }
        }
        return txt;
    }

    public static int lerInt() {
        Scanner input = new Scanner(in);
        boolean ok = false;
        int i = 0;
        while (!ok) {
            try {
                i = input.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                out.println("Inteiro Inválido");
                out.print("Novo valor: ");
                input.nextLine();
            }
        }
        return i;
    }

    public static double lerDouble() {
        Scanner input = new Scanner(in);
        boolean ok = false;
        double d = 0.0;
        while (!ok) {
            try {
                d = input.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {
                out.println("Valor real Inválido");
                out.print("Novo valor: ");
                input.nextLine();
            }
        }
        return d;
    }

    public static float lerFloat() {
        Scanner input = new Scanner(in);
        boolean ok = false;
        float f = 0.0f;
        while (!ok) {
            try {
                f = input.nextFloat();
                ok = true;
            } catch (InputMismatchException e) {
                out.println("Valor real Inválido");
                out.print("Novo valor: ");
                input.nextLine();
            }
        }
        return f;
    }

    public static boolean lerBoolean() {
        Scanner input = new Scanner(in);
        boolean ok = false;
        boolean b = false;
        while (!ok) {
            try {
                b = input.nextBoolean();
                ok = true;
            } catch (InputMismatchException e) {
                out.println("Booleano Inválido");
                out.print("Novo valor: ");
                input.nextLine();
            }
        }
        return b;
    }

    public static short lerShort() {
        Scanner input = new Scanner(in);
        boolean ok = false;
        short s = 0;
        while (!ok) {
            try {
                s = input.nextShort();
                ok = true;
            } catch (InputMismatchException e) {
                out.println("Short Inválido");
                out.print("Novo valor: ");
                input.nextLine();
            }
        }
        return s;
    }

}
