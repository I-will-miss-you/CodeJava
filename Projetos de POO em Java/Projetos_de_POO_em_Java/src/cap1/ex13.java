package cap1;

import anexo.Input;

/**
 * Escrever um programa que apresente ao utilizador um menu vertical com as opções:
 * <ul>
 * <li> 1 - Inserir     </li>
 * <li> 2 - Remover     </li>
 * <li> 3 - Consultar   </li>
 * <li> 4 - Gravar      </li>
 * <li> 5 - Sair        </li>
 * </ul>
 * Em seguida deverá ler um int, que apenas será válido se estiver entre 1 e 5, e aprensentar ao
 * utilizador, textualmente, a opção escolhida(Inserir, Remover, etc.) ou a mensagem "Opção
 * Inválida!". O programa deverá repetir a apresentação do menu até que o utilizador selecione a
 * opção 5. Sair.
 *
 * @author code36u4r60
 */
public class ex13 {

    public static void main(String[] args) {
        int op;
        do {
            op = menu();
            exec_op(op);
        } while (op != 5);
        System.out.println("Fim do programa!!!");
    }

    public static int menu() {
        System.out.println(" ---------------------------");
        System.out.println("|           MENU            |");
        System.out.println(" ---------------------------");
        System.out.println(" 1 - Inserir ");
        System.out.println(" 2 - Remover ");
        System.out.println(" 3 - Consultar ");
        System.out.println(" 4 - Gravar ");
        System.out.println(" 5 - Sair ");
        System.out.print(" #:> ");
        return lerOp(1, 5);
    }

    public static int lerOp(int min, int max) {
        int num = Input.lerInt();
        boolean ok = false;
        while (ok != true) {
            if (num >= min && num <= max) {
                ok = true;
            } else {
                System.out.println("Opção Inválida!");
                System.out.print(" #:> ");
                num = Input.lerInt();
            }
        }
        return num;
    }

    public static void exec_op(int op) {
        switch (op) {
            case 1:
                System.out.println("Inserir");
                break;
            case 2:
                System.out.println("Remover");
                break;
            case 3:
                System.out.println("Consultar");
                break;
            case 4:
                System.out.println("Gravar");
                break;
            case 5:
                System.out.println("Sair");
                break;
        }

    }
}
