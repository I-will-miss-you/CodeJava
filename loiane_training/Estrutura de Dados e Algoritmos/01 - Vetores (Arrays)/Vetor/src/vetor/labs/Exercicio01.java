
package vetor.labs;

import vetor.Lista;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lista<String> lista = new Lista<>(5);
       
       lista.adiciona("A");
       lista.adiciona("B");
       lista.adiciona("C");
       lista.adiciona("D");
       
        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("Y"));
        
               
    }
    
}
