package cap3;

import anexo.Input;

/**
 * Teste da class {@code Balao}
 *
 * @author code36u4r60
 */
public class BalaoTeste {

    static void menu() {
        System.out.println("------ MENU ------");
        System.out.println("1 - Subir");
        System.out.println("2 - Descer");
        System.out.println("3 - Cor Nova");
        System.out.println("4 - Mudar Direção");
        System.out.println("5 - Print");
        System.out.println("0 - Sair");
        System.out.println("Escolha uma das opção:");
        System.out.print("#:> ");
    }

    static void subir(Balao b) {
        System.out.print("Quantos metros deseja subir: ");
        b.subir(Input.lerInt());
    }

    static void descer(Balao b) {
        System.out.print("Quantos metros deseja descer: ");
        b.descer(Input.lerInt());
    }

    static void mudarCor(Balao b) {
        System.out.print("Degite uma nova cor: ");
        b.mudarCor(Input.lerString());
    }

    static void mudarDirecao(Balao b) {
        System.out.print("Degite uma nova direção: ");
        b.mudarDirecao(Input.lerString());
    }

    static void print(Balao b) {
        System.out.println(b.toString());
    }

    static int lerOp(int min, int max) {
        boolean invalido = true;
        int op = -1;
        while (invalido) {
            op = Input.lerInt();
            if (op >= min && op <= max) {
                invalido = false;
            }
        }
        return op;
    }

    static Balao criarBalao() {
        System.out.println("Cria Balão. Insira os dados.");
        System.out.print("Cor: ");
        String cor = Input.lerString();
        System.out.print("Direção: ");
        String direcao = Input.lerString();
        System.out.print("Altura: ");
        int altura = Input.lerInt();
        return new Balao(cor, direcao, altura);
    }

    static boolean player(Balao b, int op) {
        boolean continuar = true;
        switch (op) {
            case 0:
                continuar = false;
                break;
            case 1:
                subir(b);
                break;
            case 2:
                descer(b);
                break;
            case 3:
                mudarCor(b);
                break;
            case 4:
                mudarDirecao(b);
                break;
            case 5:
                print(b);
                break;
            default:
                System.out.println("Opção inválida...");
                continuar = true;
        }
        return continuar;
    }

    static boolean run(Balao b1, Balao b2) {
        menu();
        int op = lerOp(0, 5);
        if (op == 0) {
            return false;
        }

        System.out.println("Escolha um dos balões [1 ou 2]: ");
        int numB = lerOp(1, 2);

        player(numB == 1 ? b1 : b2, op);

        return true;
    }

    public static void main(String[] args) {
        Balao b1 = criarBalao();
        Balao b2 = criarBalao();
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        boolean run = true;
        while (run) {
            run = run(b1, b2);
        }
    }

}
