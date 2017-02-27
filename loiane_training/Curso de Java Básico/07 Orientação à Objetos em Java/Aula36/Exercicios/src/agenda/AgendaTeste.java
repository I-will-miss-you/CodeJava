package agenda;

import java.util.Scanner;

/**
 *
 * @author Code36u4r60
 */
public class AgendaTeste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome da agenda: ");
        Agenda agenda = new Agenda(scan.nextLine());
        
        Contato[] contatos = new Contato[3];
        for (int i = 0; i < 3; i++) {
            contatos[i] = receberDados();
            System.out.println("");
        }
        agenda.setContatos(contatos);
        agenda.printAgenda();
        
    }

    public static Contato receberDados() {
        Scanner scan = new Scanner(System.in);
        Contato c = new Contato();
        System.out.print("Nome: ");
        c.setNome(scan.nextLine());
        System.out.print("Telefone: ");
        c.setTelefone(scan.nextLine());
        System.out.print("Email: ");
        c.setEmail(scan.nextLine());
        return c;
    }

}
