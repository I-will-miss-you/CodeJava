package cap3;

/**
 * <p>
 * Um retângulo de base paralela ao eixo dos XX é representável por dois pontos de coordenadas
 * reais, que são os extremos da sua diagonas. Desenvolva uma classe {@code Rectangulo} com métodos
 * que realizem as seguintes operações:
 * <ul>
 * <li> Calcular os comprimentos da base, da altura e da diagonal;
 * <li> Calcular o perímetro do retângulo;
 * <li> Calcular a área do retângulo;
 * <li> Realizar o deslocamento do retângulo em XX e em YY.
 * </ul>
 *
 * @author code36u4r60
 */
public class Rectangulo {

    ///////////////////////////////////////////
    // Variáveis de Instância
    ///////////////////////////////////////////
    private Ponto2D pOrigem;
    private Ponto2D pLimite;

    ///////////////////////////////////////////
    // Construtores
    ///////////////////////////////////////////
    public Rectangulo(double x0, double y0, double x1, double y1) {
        this(new Ponto2D(x0, y0), new Ponto2D(x1, y1));
    }

    public Rectangulo(Ponto2D pOrigem, Ponto2D pLimite) {
        this.pOrigem = pOrigem;
        this.pLimite = pLimite;
    }

    public Rectangulo() {
        pOrigem = new Ponto2D();
        pLimite = new Ponto2D();
    }

    ///////////////////////////////////////////
    // Getters e Setters
    ///////////////////////////////////////////
    public Ponto2D getpOrigem() {
        return pOrigem;
    }

    public void setpOrigem(Ponto2D pOrigem) {
        this.pOrigem = pOrigem;
    }

    public Ponto2D getpLimite() {
        return pLimite;
    }

    public void setpLimite(Ponto2D pLimite) {
        this.pLimite = pLimite;
    }

    ///////////////////////////////////////////
    // Operações
    ///////////////////////////////////////////
    public void deslocarOrigem(double x, double y) {
        pOrigem.incCoord(x, y);
    }

    public void deslocarFim(double x, double y) {
        pOrigem.incCoord(x, y);
    }

    public double comprimentoBase() {
        return Math.abs(pOrigem.distanciaX(pLimite));
    }

    public double comprimentoAltura() {
        return Math.abs(pOrigem.distanciaY(pLimite));
    }

    public double comprimentoDiagonal() {
        return Math.abs(pOrigem.distancia(pLimite));
    }

    public double perimetro() {
        return comprimentoBase() * 2 + comprimentoAltura() * 2;
    }

    public double area() {
        return comprimentoBase() * comprimentoAltura();
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "pOrigem=" + pOrigem + ", pLimite=" + pLimite + '}';
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(0, 0, 10, 10);
        r.deslocarOrigem(5, 5);
        System.out.println("Base: " + r.comprimentoBase());
        System.out.println("Alrura: " + r.comprimentoAltura());
        System.out.println("Diagonal: " + r.comprimentoDiagonal());
        System.out.println("Perimetro: " + r.perimetro());
        System.out.println("Area: " + r.area());
        System.out.println(r.toString());
    }

}
