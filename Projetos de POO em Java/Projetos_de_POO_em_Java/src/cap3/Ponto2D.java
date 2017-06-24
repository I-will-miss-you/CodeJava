package cap3;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Classe que implementa um Ponto2D.
 *
 * @author code36u4r60
 */
public class Ponto2D {

    ///////////////////////////////////////////
    // Variáveis de Instância
    ///////////////////////////////////////////
    private double x;
    private double y;

    ///////////////////////////////////////////
    // Construtores
    ///////////////////////////////////////////
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D() {
        this(0, 0);
    }

    public Ponto2D(Ponto2D p) {
        this(p.getX(), p.getY());
    }

    //</editor-fold>
    ///////////////////////////////////////////
    // Getters and Setters
    ///////////////////////////////////////////
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    //</editor-fold>

    ///////////////////////////////////////////
    // Getters and Setters
    ///////////////////////////////////////////
    /**
     * Incremento das coordenadas
     *
     * @param x eixo dos xx
     * @param y eixo dos yy
     */
    public void incCoord(double x, double y) {
        setX(this.x + x);
        setY(this.y + y);
    }

    /**
     * Decremento das coordenadas
     *
     * @param x eixo xx
     * @param y eixo yy
     */
    public void decCoord(double x, double y) {
        setX(this.x - x);
        setY(this.y - y);
    }

    /**
     * Soma as coordenadas do parâmetro ao ponto recetor
     *
     * @param p ponto 2d
     */
    public void somaPonto(Ponto2D p) {
        setX(x + p.getX());
        setY(y + p.getY());
    }

    /**
     * Soma os valores parâmetros e devolve um novo ponto
     *
     * @param x eixo dos xx
     * @param y eixo dos yy
     * @return novo {@code Ponto2D}
     */
    public Ponto2D somaPonto(double x, double y) {
        return new Ponto2D(this.x + x, this.y + y);
    }

    /**
     * Determina se um ponto é simétrico (distância do eixo dos XX o mesmo que do eixo dos YY)
     *
     * @return (@code true) se for simétrico. {@code false} caso contrário.
     */
    public boolean simetrico() {
        return Math.abs(x) == Math.abs(y);
    }

    /**
     * Verifica de ambas as coordenadas são positivas
     *
     * @return {@code true} se coordenadas forem positivas. {@code false} caso contrário.
     */
    public boolean coordPos() {
        return x > 0 && y > 0;
    }

    /**
     * Verifica se os pontos são iguais
     *
     * @param p {@code Ponto2D} a comparar
     * @return return{@code true} se forem iguais. {@code false} caso contrário.
     */
    public boolean equals(Ponto2D p) {
        return p == null ? false : x == p.getX() && y == p.getY();
    }

    /**
     * Cria uma cópia do ponto {@code this}
     *
     * @return um novo {@code Ponto2D}
     */
    public Ponto2D clone() {
        return new Ponto2D(this);
    }

    /**
     * Distância a um outro ponto no eixo dos XX O calculo será realizado: {@code p} - (@code this)
     *
     * @param p {@code Ponto2D}
     * @return Distância absoluta
     */
    public double distanciaX(Ponto2D p) {
        return p.x - x;
    }

    /**
     * Distância a um outro ponto no eixo dos YY O calculo será realizado: {@code p} - (@code this)
     *
     * @param p {@code Ponto2D}
     * @return Distância absoluta
     */
    public double distanciaY(Ponto2D p) {
        return p.y - y;
    }

    /**
     * Distância a um outro ponto
     *
     * @param p {@code Ponto2D}
     * @return Distância absoluta
     */
    public double distancia(Ponto2D p) {
        return sqrt(pow(distanciaX(p), 2) + pow(distanciaY(p), 2));
    }

    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        //Construtores
        Ponto2D p1 = new Ponto2D();
        System.out.println("P1: " + p1.toString());
        Ponto2D p2 = new Ponto2D(500, 500);
        System.out.println("P2: " + p2.toString());
        Ponto2D p3 = new Ponto2D(-500, 500);
        System.out.println("P3: " + p3.toString());
        Ponto2D p4 = new Ponto2D(p3);
        System.out.println("P4: " + p4.toString());

        //Getters and Setters
        System.out.println("\nGet x: " + p1.getX());
        p1.setY(9000);
        System.out.println("Set p1.y = 9000 -> " + p1.getY());

        //Incremento das coordenadas
        System.out.println("\nP2 antes de se incrementar 500 em x e em y : " + p2.toString());
        p2.incCoord(500, 500);
        System.out.println("P2 novo valor: " + p2.toString());

        //Decremento das coordenadas
        System.out.println("\nP2 antes de se decrementar 500 em x e em y : " + p2.toString());
        p2.decCoord(400, 250);
        System.out.println("P2 novo valor: " + p2.toString());

        //Soma Ponto somaPonto(Ponto2D p)
        System.out.println("\nValores de p2 antes de soma a p4: " + p2.toString());
        System.out.println("Valore de p4: " + p4.toString());
        p2.somaPonto(p4);
        System.out.println("Valores de p2 após soma de p4: " + p2.toString());

        //Soma Ponto somaPonto(double x, double y)
        Ponto2D p5 = p2.somaPonto(5000, 5000);
        System.out.println("\nValores de P5: " + p5.toString());

        //Simetrico
        System.out.println("\nP2 é simétrico? " + p2.simetrico() + ". Valores de P2 = " + p2.toString());
        System.out.println("P4 é simétrico? " + p4.simetrico() + ". Valores de P4 = " + p4.toString());

        //Coordenadas são positivas
        System.out.println("\nCoordenadas P2 são positivas? " + p2.coordPos() + ". Valores de P2 = " + p2.toString());
        System.out.println("Coordenadas P4 são positivas? " + p4.coordPos() + ". Valores de P4 = " + p4.toString());

        //Clone
        Ponto2D p6 = p2.clone();
        System.out.println("\nP6 é um clone de P2. P2: " + p2.toString() + " P6: " + p6.toString());

        //Equals
        System.out.println("\nP2 == p6 = " + p2.equals(p6));
        System.out.println("p2 == p3 = " + p2.equals(p3));

        //Distancia em XX
        System.out.println("Distancia em XX de p2 -> p3: " + p2.distanciaX(p3));
        System.out.println("Distancia em YY de p2 -> p3: " + p2.distanciaY(p3));
        System.out.println("Distancia de p2 -> p3: " + p2.distancia(p3));
    }
}
