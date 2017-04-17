package vetor.labs;

import java.util.Scanner;
import vetor.Lista;
import vetor.teste.Contato;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //criação das variáveis
        Scanner scan = new Scanner(System.in);

        //cria um vetor com 20 de capacidade
        Lista<Contato> lista = new Lista<>(20);

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

    private static void imprimirVetor(Lista<Contato> lista) {
        for (int i = 0; i < lista.tamanho(); i++) {
            System.out.println(lista.obtem(i));
        }
        System.out.println("");
    }

    private static void limparVetor(Lista<Contato> lista) {
        lista.limpar();
        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    private static void imprimeTamanhoVetor(Lista<Contato> lista) {
        System.out.println("O tamanho do vetor é de: " + lista.tamanho());
    }

    private static void excluirContato(Scanner scan, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);
            lista.remove(contato);
            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirContatoPorPosicao(Scanner scan, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

        try {
            lista.remove(pos);
            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

            if (lista.contem(contato)) {
                System.out.println("Contato existe, seguem dados: ");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice contato encontrado: ");
            pos = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner scan, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado: ");
            pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, seguem dados: ");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = lerInformacao("Entre com o nome: ", scan);
        String telefone = lerInformacao("Entre com o telefone: ", scan);
        String mail = lerInformacao("Entre com o mail: ", scan);

        Contato contato = new Contato(nome, telefone, mail);

        int posicao = lerInformacaoInt("Entre com a posição a adicionar o contato: ", scan);

        try {
            lista.adiciona(posicao, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado");
        }

        System.out.println("Contato adicionado com sucesso! " + contato);
    }

    private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = lerInformacao("Entre com o nome: ", scan);
        String telefone = lerInformacao("Entre com o telefone: ", scan);
        String mail = lerInformacao("Entre com o mail: ", scan);

        Contato contato = new Contato(nome, telefone, mail);

        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso! " + contato);
    }

    protected static String lerInformacao(String msg, Scanner scan) {
        System.out.println(msg);
        return scan.nextLine();
    }

    protected static int lerInformacaoInt(String msg, Scanner scan) {
        boolean entradaValida = false;
        int num = 0;
        while (!entradaValida) {
            try {
                System.out.println(msg);
                String entrada = scan.nextLine();

                num = Integer.parseInt(entrada);

                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente");
            }
        }
        return num;
    }

    protected static int obterOpcaoMenu(Scanner scan) {
        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {
            System.out.println("Digite a opção desejada: ");
            System.out.println(" 1: Adiciona contato no final do vetor");
            System.out.println(" 2: Adiciona contato em uma posição específica");
            System.out.println(" 3: Obtém contato de uma posição específica");
            System.out.println(" 4: Busca contato");
            System.out.println(" 5: Consulta último índece do contato");
            System.out.println(" 6: Verifica se contato existe");
            System.out.println(" 7: Excluir por posição");
            System.out.println(" 8: Excluir contato");
            System.out.println(" 9: Verifica tamanho do vetor");
            System.out.println("10: Excluir todos os contatos do vetor");
            System.out.println("11: Imprime vetor");
            System.out.println(" 0: Sair");

            entrada = scan.nextLine();

            try {
                opcao = Integer.parseInt(entrada);
                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente\n\n");
            }
        }
        return opcao;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
        Contato contato;
        for (int i = 0; i < quantidade - 1; i++) {
            contato = new Contato("Contato" + i, "12345" + i, "contato" + i + "@mail.com");
            lista.adiciona(contato);
        }
    }

}
