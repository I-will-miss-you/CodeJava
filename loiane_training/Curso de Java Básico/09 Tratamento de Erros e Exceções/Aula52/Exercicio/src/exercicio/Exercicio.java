package exercicio;

import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda agenda = new Agenda(2);

        while (true) {
            switch (obterOpcaoMenu()) {
                case 1:
                    addContato(agenda);
                    next();
                    break;
                case 2:
                    existeContato(agenda);
                    next();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Erro desconhecido...");
            }
        }
    }

    public static void existeContato(Agenda agenda) {
        System.out.print("Nome a pesquisar: ");
        try {
            if (agenda.consultaContatoPorNome(scan()) >= 0) {
                System.out.println("Contacto existe....");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addContato(Agenda agenda) {
        System.out.println("Adicionar contacto");
        Contato c = new Contato();
        try {
            System.out.print("Nome: ");
            c.setNome(scan());
            System.out.print("Email: ");
            c.setEmail(scan());
            System.out.print("Telefone: ");
            c.setTelefone(scan());
            agenda.adicionarContato(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(agenda.toString());
        }

    }

    public static int obterOpcaoMenu() {
        System.out.println("Digite a opção desejada: ");
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Pesquisar contato");
        System.out.println("3 - Sair");
        try {
            int op = Integer.parseInt(scan());
            if (op < 1 || op > 3) {
                throw new Exception("Entrada inválida...");
            } else {
                return op;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return obterOpcaoMenu();
    }

    public static String scan() {
        return new Scanner(System.in).nextLine();
    }

    public static void next() {
        System.out.println("Press Enter to continue");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }
}
