/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3;

import static java.lang.Math.atan;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Um número <strong>complexo</strong>, na sua forma retangular, representa-se por z = a + bi e
 * possui uma parte a e uma parte imaginária, sendo a e b números reais que os coeficientes a e
 * imagário do número. Outra forma de representar números complexos designa-se por representação
 * polar tendo a forma de z = r(cos&theta; + sen&theta;i), sendo r = sqrt(a*a + b*b), r.cos&theta; =
 * a, r.sen&theta; = b, e sendo o valor de &theta; = arctan b/a. Desenvolver uma classe
 * {@code ComplexoR} com os seguintes métodos de instância:
 * <ul>
 * <li> Cálculo da soma de dois complexos z + w = (a + bi) + (c + di) = (a + c) + (b + d)i, dando um
 * novo número complexo como resultado;
 * <li> Cálculo do produto de dois complexos z * w = (a + bi) * (c + di) = (ac - db) + (bc + ad)i,
 * dando um novo número complexo como resultado;
 * <li> Cálculo do conjugado de um complexo, sendo conjugado (a + bi) = a - bi;
 * <li> Cálculo da representação polar do complexo, devolvendo-a com {@code String}
 * <li> Método {@code toString()}.
 * </ul>
 *
 * @author code36u4r60
 */
public class ComplexoR {

    ///////////////////////////////////////////
    // Variáveis de Instância
    ///////////////////////////////////////////
    double a;
    double b;

    ///////////////////////////////////////////
    // Construtores
    ///////////////////////////////////////////
    public ComplexoR(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public ComplexoR() {
        this(0, 0);
    }

    public ComplexoR(ComplexoR c) {
        this(c.a, c.b);
    }

    ///////////////////////////////////////////
    // Getters and Setters
    ///////////////////////////////////////////
    /**
     * Consulta a parte Imaginária
     *
     * @return valor da parte Imaginária
     */
    public double getImg() {
        return b;
    }

    public void setImg(double b) {
        this.b = b;
    }

    /**
     * Consulta a parte Real
     *
     * @return valor da parte Real
     */
    public double getReal() {
        return a;
    }

    public void setReal(double a) {
        this.a = a;
    }

    ///////////////////////////////////////////
    // Outros Método
    ///////////////////////////////////////////
    /**
     * Cálculo da soma de dois complexos z + w = (a + bi) + (c + di) = (a + c) + (b + d)i, dando um
     * novo número complexo como resultado.
     *
     * @param c ComplexoR
     * @return novo número complexo
     */
    public ComplexoR calc(ComplexoR c) {
        return new ComplexoR(a + c.getReal(), b + c.getImg());
    }

    /**
     * Cálculo do produto de dois complexos z * w = (a + bi) * (c + di) = (ac - db) + (bc + ad)i,
     * dando um novo número complexo como resultado.
     *
     * @param c ComplexoR
     * @return novo número complexo
     */
    public ComplexoR produto(ComplexoR c) {
        double r = a * c.getReal() - b * c.getImg();
        double i = b * c.getReal() + a * c.getImg();
        return new ComplexoR(r, i);
    }

    /**
     * Cálculo do conjugado de um complexo, sendo conjugado (a + bi) = a - bi.
     *
     * @return novo número complexo
     */
    public ComplexoR conjugado() {
        return new ComplexoR(a, -b);
    }

    /**
     * Calculo do raio polar: r = sqrt(a*a + b*b)
     *
     * @return valor do raio
     */
    public double raio() {
        return sqrt(pow(a, 2) + pow(b, 2));
    }

    /**
     * Calculo de Teta: &theta; = arctan b/a
     *
     * @return valor de &theta;
     */
    public double teta() {
        return atan(b / a);
    }

    public String getPolar() {
        StringBuilder s = new StringBuilder();
        s.append("CplxPolar = ")
                .append(raio())
                .append(" (cos ")
                .append(String.format("%.2f", teta()))
                .append(" + sen ")
                .append(String.format("%.2f", teta()))
                .append(") i\n");
        return s.toString();
    }

    public String toString2() {
        StringBuilder str = new StringBuilder();
        str.append("Cpla = ");
        str.append(a);
        str.append(b >= 0 ? " +" : " ");
        str.append(b).append("i");
        return str.toString();
    }

    @Override
    public String toString() {
        return "ComplexoR{" + "a=" + a + ", b=" + b + '}';
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ComplexoR c1 = new ComplexoR(1, 1);
        ComplexoR c2 = new ComplexoR(5, -5);

        System.out.println(c1.getPolar());

        System.out.println(c1);
        System.out.println(c1.toString2());
    }

}
