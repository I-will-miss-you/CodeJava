package timtec_introjava.cap2;

/**
 *
 * @author code36u4r60
 */
public class JavaATM3 {

    public static void printOutput(int amount, int[] billValues, int[] numberOfBills) {
        System.out.println("Dividir R$ " + amount + " em notas de R$ 100, R$ 50, R$ 20,"
                + " R$ 5, R$ 2, R$ 1");
        for (int i = 0; i < billValues.length; i++) {
            System.out.println("Notas de R$ " + billValues[i] + " : " + numberOfBills[i]);
        }
    }

    public static int[] getBillDistribution(int amount, int[] billValues) {
        int[] numberOfBills = new int[billValues.length];

        for (int i = 0; i < billValues.length; i++) {
            numberOfBills[i] = amount / billValues[i];
            amount %= billValues[i];
        }

        return numberOfBills;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int amout = 53;

        int[] billvalues = {100, 50, 20, 10, 5, 2, 1};

        int[] numberOfBills = getBillDistribution(amout, billvalues);

        printOutput(amout, billvalues, numberOfBills);
    }

}
