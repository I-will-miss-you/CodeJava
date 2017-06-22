package cap2;

import anexo.Input;

/**
 * Escrever um programa que leia para um array os vencimentos mensais brutos (ilíquidos) dos
 * funcionários de uma empresa (em número inferior a 100). O programa possui uma tabela de retenção
 * de IRS constante. Pretende-se que o programa crie um array no qual, para o respetivo funcionário
 * cujo vencimento bruto se encontra no array lido, seja introduzida a respetiva retenção de IRS. No
 * final, o programa deve apresentar uma listagem com o vecimento bruto, a retenção de IRS e o
 * vencimento liquido de cada um dos funcionários.
 * <table style="border: 1px solid black;">
 * <caption> Tabela de retenção de IRS </caption>
 * <tr>
 * <th style="border: none;"> Salário ilíquido (€) </th>
 * <th style="border: none;"> Retenção de IRS (%) </th>
 * </tr>
 * <tr>
 * <td style="text-align: center;">0 a 500</td>
 * <td style="text-align: center;">5</td>
 * </tr>
 * <tr>
 * <td  style="text-align: center;">501 a 1000</td>
 * <td  style="text-align: center;">10</td>
 * </tr>
 * <tr>
 * <td  style="text-align: center;">1001 a 2000</td>
 * <td  style="text-align: center;">20</td>
 * </tr>
 * <tr>
 * <td  style="text-align: center;">2001 a 4000</td>
 * <td  style="text-align: center;">30</td>
 * </tr>
 * <tr>
 * <td  style="text-align: center;">4000 a mais</td>
 * <td  style="text-align: center;">40</td>
 * </tr>
 * </table>
 *
 * @author code36u4r60
 */
public class ex08_vencimentos {

    private static final int MAX = 100;

    public static void main(String[] args) {
        System.out.print("Informe o número de funcionarios [0 - " + MAX + "]: ");
        int numSalarios = lerInt(0, MAX);

        System.out.println("Informe os valores de sálario para cada funcionario: ");
        double[] salario = lerDouble(numSalarios, 0, Integer.MAX_VALUE);

        printTabela(salario);

    }

    public static int lerInt(int min, int max) {
        boolean invalido = true;
        int num = 0;
        while (invalido) {
            num = Input.lerInt();
            if (num < min || num > max) {
                System.out.println("O valor inserido está fora dos limites. "
                        + "Deve inserir um valor entre [" + min + " e " + max + "].");
                System.out.print("Digite novamente: ");
            } else {
                invalido = false;
            }
        }
        return num;
    }

    public static double[] lerDouble(int numValores, int min, int max) {
        double[] lista = new double[numValores];
        for (int i = 0; i < numValores; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            lista[i] = lerDouble(min, max);
        }
        return lista;
    }

    public static double lerDouble(int min, int max) {
        boolean invalido = true;
        double num = 0;
        while (invalido) {
            num = Input.lerDouble();
            if (num < min || num > max) {
                System.out.println("O valor inserido está fora dos limites. ");
                System.out.print("Digite novamente: ");
            } else {
                invalido = false;
            }
        }
        return num;
    }

    public static double calcularImposto(double ordenado) {
        double taxa = 0;

        if (ordenado < 0) {
            taxa = 0;
        } else if (ordenado <= 500) {
            taxa = 0.05;
        } else if (ordenado <= 1000) {
            taxa = 0.1;
        } else if (ordenado <= 2000) {
            taxa = 0.2;
        } else if (ordenado <= 4000) {
            taxa = 0.3;
        } else {
            taxa = 0.4;
        }
        return taxa;
    }

    public static void printTabela(double[] salario) {
        double taxa;
        double bruto;
        System.out.println("\tSalário ilíquido\t||\tIRS\t||\tSalário bruto");
        for (double d : salario) {
            taxa = calcularImposto(d);
            bruto = d + d * taxa;
            System.out.println("\t" + d + "\t\t\t||\t" + taxa + "\t||\t" + bruto);
        }

    }
}
