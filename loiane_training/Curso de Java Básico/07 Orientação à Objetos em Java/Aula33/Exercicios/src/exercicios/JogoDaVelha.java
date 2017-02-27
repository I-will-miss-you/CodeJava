package exercicios;

/**
 *
 * @author Code36u4r60
 */
public class JogoDaVelha {

    private char[][] jogoVelha;
    private int jogada;


    public JogoDaVelha() {
        jogoVelha = new char[3][3];
        jogada = 1;
    }

    public char[][] getJogoVelha() {

        return jogoVelha;

    }

    public void setJogoVelha(char[][] jogoVelha) {

        this.jogoVelha = jogoVelha;

    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public boolean validarJogada(int linha, int coluna, char sinal) {
        if (jogoVelha[linha][coluna] == sinal || jogoVelha[linha][coluna] == 'O') {
            return false;
        } else { //jogada válida
            jogoVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }

    public void imprimirTabuleiro() {
        for (char[] jogoVelha1 : jogoVelha) {
            for (int j = 0; j < jogoVelha1.length; j++) {
                System.out.print(jogoVelha1[j] + " | ");
            }
            System.out.println();
        }
    }

    public boolean verificarGanhador(char sinal) {
        if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal)
                || //linha 1
                (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal)
                || //linha 2
                (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal)
                || //linha 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal)
                || //coluna 1
                (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal)
                || //coluna 2
                (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal)
                || //coluna 3
                (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal)
                || //diagonal
                (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)) {  //diagonal inversa
            return true;
        }
        return false;
    }

    public boolean vezJogador1() {
       return jogada % 2 == 1;
    }

}
