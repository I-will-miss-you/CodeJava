package vetor.labs;

import java.util.ArrayList;
import vetor.Lista;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(5);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("A");
        System.out.println(arrayList.lastIndexOf("A"));

        
        Lista<String> lista = new Lista<>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("A");
        lista.adiciona("A");
        System.out.println(lista.ultimoIndice("A"));
    }

}
