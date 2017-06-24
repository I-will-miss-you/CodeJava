package cap3;

/**
 * Um seguimenmto de reta é representável por dois pontos de coordenadas reais: o início e ofim do
 * segmento. Desenvolva o código de uma classe {@code Segmento} que implemente os seguintes métodos.
 *
 * <ul>
 * <li> Calcular o comprimento do segmento;
 * <li> Determinar o declive do segmento, cf. <strong>(y2 - y1) / (x2 - x1)</strong>;
 * <li> Determinar se o segmento sobe ou desce a partir do seu início (devolver uma {@code String});
 * <li> Deslocar o segmento <strong>dx</strong> em XX e <strong>dy</strong> no eixo dos YY;
 * <li> Se o segmento for o diâmetro de uma circunferência, determinar qual o perímetro desta.
 * </ul>
 *
 * @author code36u4r60
 */
public class Segmento {

    ///////////////////////////////////////////
    // Variáveis de Instância
    ///////////////////////////////////////////
    private Ponto2D p0;
    private Ponto2D p1;

    ///////////////////////////////////////////
    // Construtores
    ///////////////////////////////////////////
    public Segmento(Ponto2D p0, Ponto2D p1) {
        this.p0 = p0.clone();
        this.p1 = p1.clone();
    }

    public Segmento() {
        this(new Ponto2D(), new Ponto2D());
    }

    public Segmento(Segmento s) {
        this(s.getP0(), s.getP1());
    }

    ///////////////////////////////////////////
    // Getters and Setters
    ///////////////////////////////////////////
    public Ponto2D getP0() {
        return p0;
    }

    public void setP0(Ponto2D p0) {
        this.p0 = p0;
    }

    public Ponto2D getP1() {
        return p1;
    }

    public void setP1(Ponto2D p1) {
        this.p1 = p1;
    }

    ///////////////////////////////////////////
    // Outros métodos
    ///////////////////////////////////////////
    /**
     * Calcular o comprimento
     *
     * @return comprimento
     */
    public double comprimento() {
        return p0.distancia(p1);
    }

    /**
     * Calcular o declive
     *
     * @return declive
     */
    public double declive() {
        return p0.distanciaY(p1) / p0.distanciaX(p1);
    }

    /**
     * Retorna informação sobre o declive do segmento em forma de {@code String}
     *
     * @return {@code String} com informação do declive
     */
    public String getDecliveEmTexto() {
        StringBuilder str = new StringBuilder();
        double declive = declive();
        if (declive > 0) {
            str.append("Declive positivo. Segmento está a subir...");
        } else if (declive < 0) {
            str.append("Declive negativo. Segmento está a descer...");
        } else {
            str.append("Declive é nullo. Segmento está na horizontal...");
        }
        return str.toString();
    }

    /**
     * Desloca todo o segmento
     *
     * @param dx deslocamento em XX
     * @param dy deslocamento em YY
     */
    public void deslocarSegmento(double dx, double dy) {
        p0.incCoord(dx, dy);
        p1.incCoord(dx, dy);
    }

    /**
     * Desloca p ponto de origrm do segmento
     *
     * @param dx deslocamento em XX
     * @param dy deslocamento em YY
     */
    public void deslocarOrigem(double dx, double dy) {
        p0.incCoord(dx, dy);
    }

    /**
     * Desloca o ponto final do segmento
     *
     * @param dx deslocamento em XX
     * @param dy deslocamento em YY
     */
    public void deslocarFim(double dx, double dy) {
        p1.incCoord(dx, dy);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Segmento other = (Segmento) obj;
        return this.p0.equals(other.p0)
                && this.p1.equals(other.p1);
    }

    public Segmento clone() {
        return new Segmento(this);
    }

    @Override
    public String toString() {
        return "Segmento{" + "p0=" + p0 + ", p1=" + p1 + '}';
    }

    public static void main(String[] args) {
        Ponto2D p0 = new Ponto2D();
        Ponto2D p1 = new Ponto2D(500, 500);
        Segmento s1 = new Segmento(p0, p1);

        System.out.format("Comprimento: %.2f%n", s1.comprimento());
        System.out.println("Declive: " + s1.declive());
        System.out.println(s1.getDecliveEmTexto());

        System.out.println("Valores do segemento antes dos deslocamentos: ");
        s1.deslocarSegmento(500, -500);
        System.out.println(s1.toString());
        s1.deslocarOrigem(5000, 5000);
        System.out.println(s1.toString());
        s1.deslocarFim(8000, 8000);
        System.out.println(s1.toString());

        Segmento s2 = new Segmento();
        Segmento s3 = new Segmento(s1);
        System.out.println("Para S1 != S2 validar: S1 == S2: " + s1.equals(s2));
        System.out.println("Para S1 == S3 validar: S1 == s3: " + s1.equals(s3));

    }
}
