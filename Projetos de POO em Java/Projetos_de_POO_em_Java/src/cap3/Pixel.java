package cap3;

/**
 * Um pixel é um ponto de coordenadas x e y inteiras mas que tem a si associada uma cor de 0 a 255.
 * Crie uma class {@code Pixel} que permita criar <em>pixels</em>, sabendo-se que, para além da
 * usuais operações de consulta, cada pixel deve responder às seguintes mensagens:
 * <ul>
 * <li> int getCor()
 * <li> double getX()
 * <li> double getY()
 * <li> void mudaCor(int nvCor)
 * <li> void desloca(double dx, double dy)
 * <li> void paraBaixo(double val)
 * <li> void paraCima(double val)
 * <li> void paraDireita(double val)
 * <li> void paraEsquerda(double val)
 * <li> Pixel clone()
 * <li> boolean equals(Pixel p)
 * <li> String toString()
 * </ul>
 *
 * @author code36u4r60
 */
public class Pixel {

    ///////////////////////////////////////////
    // Variáveis de Instância
    ///////////////////////////////////////////
    private double x;
    private double y;
    private int cor;

    ///////////////////////////////////////////
    // Construtores
    ///////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="Construtores">
    public Pixel(double x, double y, int cor) {
        this.x = x;
        this.y = y;
        this.cor = (cor >= 0 && cor < 256) ? cor : Math.abs(cor % 255);
    }

    public Pixel() {
        this(0, 0, 0);
    }

    public Pixel(int cor) {
        this(0, 0, cor);
    }

    public Pixel(Pixel p) {
        this(p.getX(), p.getY(), p.getCor());
    }
    //</editor-fold>

    ///////////////////////////////////////////
    // Métedos de Instância
    ///////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
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

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = (cor >= 0 && cor < 256) ? cor : 0;
    }
    // </editor-fold>

    //////////////////////////////////////////
    // Métedos Públicos
    //////////////////////////////////////////
    /**
     * Modifica a Cor
     *
     * @param nvCor nova cor
     */
    public void mudaCor(int nvCor) {
        setCor(nvCor);
    }

    /**
     * Deslocar o pixel para um dada posição
     *
     * @param dx quantidade de pixels à deslocar em x
     * @param dy quantidade de pixels à deslocar em y
     */
    public void deslocarPara(double dx, double dy) {
        setX(dx);
        setY(dy);
    }

    /**
     * Deslocar o pixel para baixo
     *
     * @param val quantidades de pixels à deslocar em y
     */
    public void paraBaixo(double val) {
        deslocarPara(x, y - val);
    }

    /**
     * Deslocar o pixel para cima
     *
     * @param val quantidades de pixels à deslocar em y
     */
    public void paraCima(double val) {
        deslocarPara(x, y + val);
    }

    /**
     * Deslocar o pixel para Direita
     *
     * @param val quantidades de pixels à deslocar em x
     */
    public void paraDireita(double val) {
        deslocarPara(x + val, y);
    }

    /**
     * Deslocar o pixel para Esquerda
     *
     * @param val quantidades de pixels à deslocar em x
     */
    public void paraEsquerda(double val) {
        deslocarPara(x - val, y);
    }

    /**
     * Verifica se os pixels são iguais
     *
     * @param p {@code pixel} a ser comparado
     * @return {@code true} se igual, {@code false} caso contrário
     */
    public boolean equals(Pixel p) {
        if (this == p) {
            return true;
        }
        if (p == null) {
            return false;
        }
        return x == p.getX() && y == p.getY() && cor == p.getCor();
    }

    /**
     * Clona o pixel
     *
     * @return um clone do Pixel
     */
    public Pixel clone() {
        return new Pixel(this);
    }

    @Override
    public String toString() {
        return "Pixel{" + "x=" + x + ", y=" + y + ", cor=" + cor + '}';
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pixel p1 = new Pixel();
        System.out.println("Pixel 1:" + p1.toString());
        Pixel p2 = new Pixel(0);
        System.out.println("Pixel 2:" + p2.toString());
        Pixel p3 = new Pixel(300);
        System.out.println("Pixel 3:" + p3.toString());
        Pixel p4 = new Pixel(50, 60, -500);
        System.out.println("Pixel 4:" + p4.toString());
        Pixel p5 = new Pixel(p3);
        System.out.println("Pixel 5:" + p5.toString());

        // Mudar a cor
        p1.mudaCor(124);
        System.out.println("Muda a cor de p1 para 124: " + p1.toString());

        // Deslocar para
        p1.deslocarPara(50, 50);
        System.out.println("Deslocar p1 para a posição xy(50,50): " + p1.toString());

        // Subir 50 pixels
        p1.paraCima(50);
        System.out.println("Subir 50 pixels: " + p1.toString());

        // Descer 50 pixels
        p1.paraBaixo(50);
        System.out.println("Subir 50 pixels: " + p1.toString());

        // Deslocar para a direita
        p1.paraDireita(50);
        System.out.println("Deslocar para a direita 50 pixels: " + p1.toString());

        // Deslocar para a esquerda
        p1.paraEsquerda(50);
        System.out.println("Deslocar para a esquerda 50 pixels: " + p1.toString());

        // Verifica se os pixels são iguais
        System.out.println("p1 == p2: " + p1.equals(p2));

        Pixel p6 = new Pixel(p1);
        System.out.println("Novo pixel p6: " + p6.toString());
        System.out.println("p1 == p6: " + p1.equals(p6));
    }

}
