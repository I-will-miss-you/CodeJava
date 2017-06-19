package cap1;

import anexo.Input;
import java.util.Random;

/**
 * Escrever um programaque gere um número aleatório entre 1 e 100. O programa dará cinco tentativas
 * ao utilizador para acertar no número gerado. A cada tentativa do utilizador, o programa indicará
 * se o número gerado é maior ou menor do que o número dado pelo utilizador. À terceira tentativa
 * falhada, o utilizador perde. Quer perca quer acerte, o programa deve perguntar ao utilizador se
 * quer continuar a jogar ou não. Se sim, um novo número será gerado e o jogo é retomado.
 *
 * @author code36u4r60
 */
public class ex14 {

    public static void main(String[] args) {
        boolean jogar = true;
        int num, nJogos = 0;
        while (jogar) {
            num = gerarNum(100);
            jogar(num);
            if (++nJogos == 3) {
                System.out.println("Acabaram os seu créditos... insert coin...");
                break;
            }
            jogar = continuar();
        }
    }

    static int gerarNum(int num) {
        return new Random().nextInt(num) + 1;
    }

    public static void jogar(int num) {
        System.out.println("\n\nDeve digitar um número de [1 a 100]. ");
        boolean play = true;
        int tentativas = 1;
        while (play) {
            System.out.print("Tentativa " + tentativas + ": ");
            int aposta = Input.lerInt();
            play = !ganhou(num, aposta);

            if (tentativas++ == 5) {
                System.out.println("Perdeu!!!");
                play = false;
            }
        }
    }

    public static boolean ganhou(int num, int aposta) {
        if (num == aposta) {
            System.out.println("Parabéns, acertou!!!");
            return true;
        }
        System.out.print("Não foi desta... ");
        System.out.println(num > aposta ? "O número é maior" : "O número é menor");
        return false;
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
