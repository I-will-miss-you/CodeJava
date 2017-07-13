package timtec_introjava.cap4;

import java.util.HashSet;

/**
 *
 * @author code36u4r60
 */
public class JavaCollections2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashSet<String> mySet = new HashSet<>();

        mySet.add("Banana");
        mySet.add("Apple");

        //System.out.println("Banana: " + mySet.contains("Banana")); //True
        //System.out.println("Banana: " + mySet.contains("Orange")); //False
        //
        //mySet.remove("Banana");
        //System.out.println("Banana: " + mySet.contains("Banana")); //False
        //
        mySet.add("Orange");
        for (String fruit : mySet) {
            System.out.println(fruit);
        }

    }

}
