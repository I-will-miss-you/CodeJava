package cap1;

import anexo.Input;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Escrever um programa que leia o ano, o mês e o dia de nascimento de uma pessoa e calcule a sua
 * idade atual, indicando ao utilizador a data de nascimento lida, o dia de hoje e a idade que foi
 * calculada.
 *
 * @author code36u4r60
 */
public class ex15 {

    public static void main(String[] args) {
        do {
            LocalDate dataNascimento = lerData();
            LocalDate now = LocalDate.now();
            Period p = dataNascimento.until(now);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd / MM / yyyy");

            System.out.println("A sua da de nascimento: " + dataNascimento.format(formatter));
            System.out.println("Data de hoje: " + now.format(formatter));
            System.out.println("A sua idade: " + p.getYears() + " anos");
        } while (continuar());

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

    public static boolean continuar() {
        System.out.println("Deseja continuar a jogar? [s(sim) ou n(não)]: ");
        boolean ler = true;
        while (ler) {
            String op = Input.lerString();
            if (op.equalsIgnoreCase("s")) {
                return true;
            }
            if (op.equalsIgnoreCase("n")) {
                return false;
            }
            System.out.println("Opção inválida. Digite novamente: ");
        }
        return false;
    }
}
