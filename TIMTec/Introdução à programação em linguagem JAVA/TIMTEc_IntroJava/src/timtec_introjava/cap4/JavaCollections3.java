package timtec_introjava.cap4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author code36u4r60
 */
public class JavaCollections3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<String, Integer> myBooks = new HashMap<>();

        myBooks.put("Ender's Game", 4);
        myBooks.put("Ringworld", 3);
        myBooks.put("Heir to the Empire", 5);

        /*
        for (String title : myBooks.keySet()) {
            System.out.println(title);
        }

        for (Integer score : myBooks.values()) {
            System.out.println(score);
        }

        for (String title : myBooks.keySet()) {
            System.out.println(title + " é nota " + myBooks.get(title));
        }

        for (Entry<String, Integer> entry : myBooks.entrySet()) {
            System.out.println(entry.getKey() + " é nota " + entry.getValue());
        }

        System.out.println(myBooks.containsKey("Ringworld")); //True
        System.out.println(myBooks.containsKey("Crusoe")); //False

        myBooks.remove("Ringworld");
        System.out.println(myBooks.containsKey("Ringworld")); //False
         */
        System.out.println(myBooks.containsValue(5)); //True
        System.out.println(myBooks.containsValue(2)); //False
    }

}
