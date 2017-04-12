package vetor.teste;

import vetor.VetorObjetos;

/**
 *
 * @author Code36u4r60
 */
public class Aula10 {

    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);
        /*
        vetor.adiciona(3);
        vetor.adiciona(4);
        vetor.adiciona(5);
        vetor.adiciona("FIM");
         */

        Contato c1 = new Contato("c1", "123456789", "c1@email");
        Contato c2 = new Contato("c2", "123456789", "c2@email");
        Contato c3 = new Contato("c3", "123456789", "c3@email");
        Contato c4 = new Contato("c1", "123456789", "c1@email");
        Contato c5 = new Contato("c5", "911511611", "c5@email");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
        vetor.adiciona(c4);
        vetor.adiciona(c5);

        System.out.println("Tamanho = " + vetor.tamanho());

        int pos = vetor.busca(c4);
        if (pos > -1) {
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("ELemento não existe no vetor");
        }
        System.out.println(vetor);

        System.out.println(c1.equals(c4));
        System.out.println(c1.equals(c2));

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c5.hashCode());
    }

}
