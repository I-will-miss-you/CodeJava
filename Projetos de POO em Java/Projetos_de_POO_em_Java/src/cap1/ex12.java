package cap1;

import anexo.Input;
import java.time.LocalDate;
import java.time.Period;

/**
 * Escrever um programa que permita ao utilizador introduzir duas datas quaiquer (valores inteiros
 * para ano, mês e dia) e determine a sua diferença em anos, meses e dias, apresentando depois o
 * resultado final.
 *
 * @author code36u4r60
 */
public class ex12 {

    public static void main(String[] args) {

        System.out.println("\nData de nascimento do 1 indivíduo: ");
        LocalDate d1 = lerData();

        System.out.println("\nData de nascimento do 2 indivíduo: ");
        LocalDate d2 = lerData();

        Period diff = d1.until(d2);

        System.out.println("Diferença entre as duas datas (YYYY/mm/dd) :"
                + diff.getYears() + " / "
                + diff.getMonths() + " / "
                + diff.getDays());

    }

    public static int lerInt(int min, int max) {
        boolean ok = false;
        int num = 0;
        while (ok != true) {
            num = Input.lerInt();
            if (num >= min && num <= max) {
                ok = true;
            } else {
                System.out.printf("O intervalo de valores aceites é [%d, %d]%n", min, max);
                System.out.print("Novo valor: ");
            }
        }
        return num;
    }

    public static LocalDate lerData() {
        System.out.print("Informe o ano de nascimento: ");
        int ano = lerInt(1900, LocalDate.now().getYear());
        System.out.print("Informe o mês de nascimento: ");
        int mes = lerInt(1, ano == LocalDate.now().getYear() ? LocalDate.now().getMonthValue() : 12);
        System.out.print("Informe o dia de nascimento: ");
        int max = (ano == LocalDate.now().getYear() && mes == LocalDate.now().getMonthValue())
                ? LocalDate.now().getDayOfMonth()
                : LocalDate.of(ano, mes, 1).lengthOfMonth();
        int dia = lerInt(1, max);

        //System.out.println(ano + " / " + mes + " / " + dia);
        return LocalDate.of(ano, mes, dia);
    }
}
