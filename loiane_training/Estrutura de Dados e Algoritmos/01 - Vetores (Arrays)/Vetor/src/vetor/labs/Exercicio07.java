package vetor.labs;

import java.util.Scanner;
import java.util.ArrayList;
import vetor.teste.Contato;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio07 extends Exercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //criação das variáveis
        Scanner scan = new Scanner(System.in);

        //cria um vetor com 20 de capacidade
        ArrayList<Contato> lista = new ArrayList<>(20);

        //criar e adicionar 30 contatos
        criarContatosDinamicamente(30, lista);

        //1 - criar um menu para que o usuário escolha a opção
        int opcao = 1;
        while (opcao != 0) {
            opcao = obterOpcaoMenu(scan);
            switch (opcao) {
                case 1:
                    adicionarContatoFinal(scan, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(scan, lista);
                    break;
                case 3:
                    obtemContatoPosicao(scan, lista);
                    break;
                case 4:
                    obtemContato(scan, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(scan, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scan, lista);
                    break;
                case 7:
                    excluirContatoPorPosicao(scan, lista);
                    break;
                case 8:
                    excluirContato(scan, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Usuário digitou 0, programa terminado...");
    }

    private static void imprimirVetor(ArrayList<Contato> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("");
    }

    private static void limparVetor(ArrayList<Contato> lista) {
        lista.clear();
        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
        System.out.println("O tamanho do vetor é de: " + lista.size());
    }

    private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.get(pos);
            lista.remove(contato);
            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirContatoPorPosicao(Scanner scan, ArrayList<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

        try {
            lista.remove(pos);
            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

            if (lista.contains(contato)) {
                System.out.println("Contato existe, seguem dados: ");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice contato encontrado: ");
            pos = lista.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner scan, ArrayList<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado: ");
            pos = lista.indexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = lerInformacao("Entre com o nome: ", scan);
        String telefone = lerInformacao("Entre com o telefone: ", scan);
        String mail = lerInformacao("Entre com o mail: ", scan);

        Contato contato = new Contato(nome, telefone, mail);

        int posicao = lerInformacaoInt("Entre com a posição a adicionar o contato: ", scan);

        try {
            lista.add(posicao, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado");
        }

        System.out.println("Contato adicionado com sucesso! " + contato);
    }

    private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = lerInformacao("Entre com o nome: ", scan);
        String telefone = lerInformacao("Entre com o telefone: ", scan);
        String mail = lerInformacao("Entre com o mail: ", scan);

        Contato contato = new Contato(nome, telefone, mail);

        lista.add(contato);

        System.out.println("Contato adicionado com sucesso! " + contato);
    }

    private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {
        Contato contato;
        for (int i = 0; i < quantidade - 1; i++) {
            contato = new Contato("Contato" + i, "12345" + i, "contato" + i + "@mail.com");
            lista.add(contato);
        }
    }

}
