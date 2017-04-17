package vetor.labs;

import vetor.Lista;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista<String> lista = new Lista<>();
        
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        
        System.out.println(lista);
        
        lista.remove("A");
        System.out.println(lista);
        
        lista.remove("E");
        System.out.println(lista);
        
        lista.remove("C");
        System.out.println(lista);
        
    }
    
}
