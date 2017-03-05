
package aula52;

/**
 *
 * @author code36u4r60
 */
public class DivisaoNaoExata extends Exception {

    private int num;
    private int dem;

    public DivisaoNaoExata(int num, int dem) {
        this.num = num;
        this.dem = dem;
    }

    @Override
    public String toString() {
        return "Resultado de "+ num + "/" + dem + "não é um inteiro";
    }
}
