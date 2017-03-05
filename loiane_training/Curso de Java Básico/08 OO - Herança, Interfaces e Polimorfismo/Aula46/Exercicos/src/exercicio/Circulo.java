package exercicio;

/**
 *
 * @author code36u4r60
 */
public class Circulo extends Figura2D {

    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return raio * raio * Math.PI;
    }

}
