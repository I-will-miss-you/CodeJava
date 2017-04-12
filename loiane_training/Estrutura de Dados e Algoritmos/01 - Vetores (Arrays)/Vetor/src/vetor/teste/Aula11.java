package vetor.teste;

import vetor.Lista;

/**
 *
 * @author Code36u4r60
 */
public class Aula11 {

    public static void main(String[] args) {
        Lista<Contato> vetor = new Lista<>(1);

        Contato c1 = new Contato("c1", "123456789", "c1@email");
        Contato c2 = new Contato("c2", "123456789", "c2@email");
        Contato c3 = new Contato("c3", "123456789", "c3@email");

        vetor.adiciona(c3);
    }

}
