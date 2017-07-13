package timtec_introjava.cap4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author code36u4r60
 */
public class JavaATM3 {

    public static void printOutput(int amount, List<Integer> billValues, List<Integer> numberOfBills) {
        System.out.println("Dividir R$ " + amount + " em notas de R$ 100, R$ 50, R$ 20,"
                + " R$ 5, R$ 2, R$ 1");
        for (int i = 0; i < billValues.size(); i++) {
            System.out.println("Notas de R$ " + billValues.get(i) + " : " + numberOfBills.get(i));
        }
    }

    public static List<Integer> getBillDistribution(int amount, List<Integer> billValues) {
        ArrayList<Integer> numberOfBills = new ArrayList<>();

        for (int value : billValues) {
            numberOfBills.add(amount / value);
            amount %= value;
        }

        return numberOfBills;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int amout = 1553;

        List<Integer> billvalues = Arrays.asList(100, 50, 20, 10, 5, 2, 1);

        List<Integer> numberOfBills = getBillDistribution(amout, billvalues);

        printOutput(amout, billvalues, numberOfBills);
    }

}
