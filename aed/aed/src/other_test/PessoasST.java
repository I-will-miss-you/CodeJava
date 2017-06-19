/*
* Copyright (c) - Pode usar e abusar
 */
package other_test;

import aed.ST;
import entidades.Pessoa;
import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;

/**
 * O objetivo desta classe é testar a class ST do pacote AED usado um Objeto um pouco mais complexo.
 *
 * @see aed.ST
 *
 * @author code36u4r60
 */
public class PessoasST extends ST {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("02508804", "Oliveira", "Luis Oliveira", LocalDate.of(1982, Month.MARCH, 12));
        Pessoa p2 = new Pessoa("35508804", "Lopes", "António Lopes", LocalDate.of(1987, Month.JANUARY, 11));
        Pessoa p3 = new Pessoa("12506004", "Ferreira", "Pedro André Ferreira", LocalDate.of(1994, Month.DECEMBER, 1));
        Pessoa p4 = new Pessoa("09524804", "Rodrigues", "Luis Rodrigues", LocalDate.of(1982, Month.MARCH, 12));
        Pessoa p5 = new Pessoa("12504104", "Salazar", "Catarina Martins Salazar", LocalDate.of(1974, Month.NOVEMBER, 25));

        ST<String, Pessoa> pessoasST = ST();
        pessoasST.put(p1.getIdCard(), p1);
        pessoasST.put(p2.getIdCard(), p2);
        pessoasST.put(p3.getIdCard(), p3);
        pessoasST.put(p4.getIdCard(), p4);
        pessoasST.put(p5.getIdCard(), p5);

        System.out.println("\nprintAll:");
        pessoasST.printAll();

        System.out.println("\nContains \"000001\" ");
        System.out.println(pessoasST.contains("000001"));
        System.out.println("Contains \"000011\" ");
        System.out.println(pessoasST.contains("000011"));

        System.out.println("\nput(\"000001\", null)");
        pessoasST.put("000001", null);
        pessoasST.printAll();

        System.out.println("\nremoveValue(p5)");
        pessoasST.removeValue(p5);
        pessoasST.printAll();

        System.out.println("addNew(p5.getIdCard(), p5)");
        try {
            pessoasST.addNew(p5.getIdCard(), p5);
            System.out.println("1ª - ok");
            pessoasST.addNew(p5.getIdCard(), p5);
            System.out.println("2ª - ok");
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\nprintSortedBy(\"Last Name\")");
        pessoasST.printSortedBy((Comparator<Pessoa>) (Pessoa o1, Pessoa o2) -> {
            return o1.getLastName().compareToIgnoreCase(o2.getLastName());
        });

        System.out.println("\nprintSortedBy(\"Full Name\")");
        pessoasST.printSortedBy((Comparator<Pessoa>) (Pessoa o1, Pessoa o2) -> {
            return o1.getFullName().compareToIgnoreCase(o2.getFullName());
        });

        System.out.println("\ngetList(\"Birth Date\")");
        pessoasST.getList((Comparator<Pessoa>) (Pessoa o1, Pessoa o2) -> {
            return o1.getFullName().compareTo(o2.getFullName());
        }).forEach((e) -> System.out.println(e));
    }

}
