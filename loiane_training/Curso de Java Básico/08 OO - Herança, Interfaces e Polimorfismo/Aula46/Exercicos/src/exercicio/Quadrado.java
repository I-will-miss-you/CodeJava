package exercicio;

/**
 *
 * @author code36u4r60
 */
public class Quadrado extends Figura2D {

    private int lado;

    public Quadrado() {
    }
    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

}
