package timtec_introjava.cap2;

/**
 *
 * @author code36u4r60
 */
public class JavaATM2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int originalAmount = 1245;
        int amount = originalAmount;

        System.out.println("Dividir R$ " + originalAmount + " em notas de R$ 100, R$ 50, R$ 20,"
                + " R$ 5, R$ 2, R$ 1");

        int[] billValues = {100, 50, 20, 10, 5, 2, 1};
        int[] numberOfBills = new int[billValues.length];

        for (int i = 0; i < billValues.length; i++) {

            numberOfBills[i] = amount / billValues[i];
            amount %= billValues[i];

            System.out.println("Notas de R$ " + billValues[i] + " : " + numberOfBills[i]);
        }

    }

}
