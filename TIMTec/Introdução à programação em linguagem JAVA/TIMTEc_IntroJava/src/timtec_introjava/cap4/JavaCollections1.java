package timtec_introjava.cap4;

import java.util.ArrayList;

/**
 *
 * @author code36u4r60
 */
public class JavaCollections1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        int numOfElements = (int) (Math.random() * 100);

        for (int i = 0; i < numOfElements; i++) {
            myList.add(i);
        }

        for (Integer integer : myList) {
            System.out.println(integer);
        }
    }

}
