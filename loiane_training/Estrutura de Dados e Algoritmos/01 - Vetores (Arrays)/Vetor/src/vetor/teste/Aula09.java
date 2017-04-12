package vetor.teste;

import vetor.Vetor;

/**
 *
 * @author Code36u4r60
 */
public class Aula09 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");
        System.out.println(vetor);
        
        vetor.remove(1);
        System.out.println(vetor);
        
        System.out.println("Remover o elelemnto E:");
        int pos = vetor.busca("E");
        if(pos > -1){
            vetor.remove(pos);
        }else{
            System.out.println("O elemento não existe no vetor");
        }
        System.out.println(vetor);
    }
    

}
