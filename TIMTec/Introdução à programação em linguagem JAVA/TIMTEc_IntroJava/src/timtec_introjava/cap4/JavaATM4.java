package timtec_introjava.cap4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author code36u4r60
 */
public class JavaATM4 {

    public static void printOutput(int amount, Map<Integer, Integer> distribution) {
        System.out.println("Dividir R$ " + amount + " em notas de R$ 100, R$ 50, R$ 20,"
                + " R$ 5, R$ 2, R$ 1");
        for (Entry<Integer, Integer> e : distribution.entrySet()) {
            System.out.println("Notas de R$ " + e.getKey() + " : " + e.getValue());
        }
    }

    public static Map<Integer, Integer> getBillDistribution(int amount, List<Integer> billValues) {
        HashMap<Integer, Integer> distribution = new HashMap<>();

        for (int value : billValues) {
            int bills = amount / value;
            if (bills > 0) {
                distribution.put(value, bills);
            }
            amount %= value;
        }

        return distribution;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int amout = 535;

        List<Integer> billvalues = Arrays.asList(100, 50, 20, 10, 5, 2, 1);

        Map<Integer, Integer> distribution = getBillDistribution(amout, billvalues);

        printOutput(amout, distribution);
    }

}
