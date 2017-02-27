package exercicios;

/**
 *
 * @author Code36u4r60
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        jogo.printTabuleiro();
        while (!jogo.existeVencedor()) {
            jogo.trocarJogador();
            jogo.jogar();
            jogo.printTabuleiro();
        }

    }
}
