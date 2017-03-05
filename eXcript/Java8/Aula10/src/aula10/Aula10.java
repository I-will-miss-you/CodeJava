package aula10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author code36u4r60
 */
public class Aula10 {

    public static void filtro(List<String> lista, Predicate<String> condicao) {
        for (String s : lista) {
            if (condicao.test(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {

        List<String> lista1 = Arrays.asList(
                "Santa Catarina", "Parana", "São Paulo",
                "Rio de Janeiro", "Brasilia", "Ceará");

        System.out.println("");
        System.out.println("Estados que iniciam com a letra 's'");
        filtro(lista1, (s) -> s.startsWith("S"));

        System.out.println("");
        System.out.println("Estados que finalizam com a letra 'a'");
        filtro(lista1, (s) -> s.endsWith("a"));

        System.out.println();
        System.out.println("Imprime toda a lista");
        filtro(lista1, (s) -> true);

        System.out.println();
        System.out.println("Não imprime a lista");
        filtro(lista1, (s) -> false);

        System.out.println();
        System.out.println("Imprime os nomes com + de 10 caracteres");
        filtro(lista1, (s) -> s.length() > 10);

        System.out.println();
        System.out.println("Imprime os nome nomes que contenha 'an' no nome");
        filtro(lista1, (s) -> s.contains("an"));

    }

}
