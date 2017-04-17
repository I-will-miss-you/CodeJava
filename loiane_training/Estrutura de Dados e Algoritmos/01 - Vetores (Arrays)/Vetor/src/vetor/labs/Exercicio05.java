package vetor.labs;

import java.util.ArrayList;
import vetor.Lista;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio05 {

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
        System.out.println(arrayList);

        arrayList.clear();
        System.out.println(arrayList);

        Lista<String> lista = new Lista<>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("A");
        lista.adiciona("A");
        System.out.println(lista);
        
        lista.limpar();
        System.out.println(lista);
    }

}
