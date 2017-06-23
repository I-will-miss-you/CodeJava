package cap3;

/**
 * <p>
 * Desenvolva uma classe que represente a estrutura e o funcionamento de um <strong>balão</strong>
 * (de ar ou hélio, como quiser), sabendo-se que cada balão deve ter como atributos uma cor(sob a
 * forma de texto), a sua direção atual(sob a forma de texto) e a altura a que se encontra do
 * solo(sempre maior ou igual a 0).</p>
 * <p>
 * Pretende-se desenvolver os contrutores entendidos como adequados e um conjunto de métodos de
 * intância que permitam saber o estado do balão a cada momento(determinar o valor de cada um dos
 * seus atributos), mudar a sua cor, mudar a sua direção e controlar a sua altura. Para controlar a
 * altura do balão devem ser programados métodos para subir x metros e para descer y metros(note-se
 * que subir pode ser até ao infinito, mas descer só pode ser até à altura 0).</p>
 * <p>
 * Vrie várias instâncias da classe {@code Balao}, ponha-as em "voo" e teste-as. Escreva e teste
 * também uma classe {@code BalaoTeste} que se comporte como um programa principal interativo em
 * cujo método {@code main()} são criadas e manipuladas as várias intâncias criadas.</p>
 *
 *
 * @author code36u4r60
 */
public class Balao {

    ///////////////////////////////////////////
    // Variáveis de Instância
    ///////////////////////////////////////////
    private String cor;
    private String direcao;
    private int altura;

    ///////////////////////////////////////////
    // Construtores
    ///////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="Construtores">
    public Balao(String cor, String direcao, int altura) {
        this.cor = cor == null ? "??" : cor;
        this.direcao = direcao == null ? "??" : direcao;
        this.altura = altura < 0 ? 0 : altura;
    }

    public Balao() {
        this("??", "??", 0);
    }

    public Balao(Balao b) {
        this(b.getCor(), b.getDirecao(), b.altura);
    }
    // </editor-fold>

    ///////////////////////////////////////////
    // Métedos de Instância
    ///////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public String getCor() {
        return cor;
    }

    private void setCor(String cor) {
        this.cor = (cor == null) ? "??" : cor;
    }

    public String getDirecao() {
        return direcao;
    }

    private void setDirecao(String direcao) {
        this.direcao = direcao == null ? "??" : direcao;
    }

    public int getAltura() {
        return altura;
    }

    private void setAltura(int altura) {
        this.altura = altura < 0 ? 0 : altura;
    }
    //</editor-fold>

    //////////////////////////////////////////
    // Métedos Públicos
    //////////////////////////////////////////
    public void mudarCor(String cor) {
        setCor(cor);
    }

    public void mudarDirecao(String direcao) {
        setDirecao(direcao);
    }

    public void subir(int metros) {
        setAltura(altura + metros);
    }

    public void descer(int metros) {
        setAltura(altura - metros);
    }

    public void subirDescer(String movimento, int metros) {
        if (movimento.equalsIgnoreCase("subir")) {
            subir(metros);
        } else if (movimento.equalsIgnoreCase("descer")) {
            descer(metros);
        } else {
            System.out.println("Movimento inválido");
        }
    }

    @Override
    public String toString() {
        return "Balao{" + "cor=" + cor + ", direcao=" + direcao + ", altura=" + altura + '}';
    }

    public boolean equals(Balao b) {
        if (this == b) {
            return true;
        }
        if (b == null) {
            return false;
        }
        return cor.equalsIgnoreCase(b.getCor())
                && direcao.equalsIgnoreCase(b.getDirecao())
                && altura == b.getAltura();
    }

    public Balao cloneMe() {
        return new Balao(this);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Testar contrutores
        Balao b1 = new Balao();
        System.out.println("B1: " + b1.toString());
        Balao b2 = new Balao("Azul", "Norte", 500);
        System.out.println("B1: " + b2.toString());
        Balao b3 = new Balao(null, null, -5000);
        System.out.println("B1: " + b3.toString());
        Balao b4 = new Balao(b2);
        System.out.println("B1: " + b4.toString());

        //Mudar Cor
        System.out.println("Cor do balão b2: " + b2.getCor());
        b2.mudarCor("Vermelho");
        //b2.mudarCor(null);
        System.out.println("Nova cor de b2: " + b2.getCor());

        //Mudar Direcao
        System.out.println("Direção de b2: " + b2.getDirecao());
        b2.mudarDirecao("Leste");
        //b2.mudarDirecao(null);
        System.out.println("Nova direção de b2: " + b2.getDirecao());

        //Subir
        System.out.println("Altura de b2: " + b2.getAltura());
        b2.subir(500);
        //b2.subir(-50000);
        System.out.println("Nova altura de b2: " + b2.getAltura());

        //Descer
        System.out.println("Altura de b2: " + b2.getAltura());
        b2.descer(500);
        //b2.descer(50000);
        System.out.println("Nova altura de b2: " + b2.getAltura());

        //Subir Descer
        System.out.println("Teste do metedo subirDescer");
        System.out.println("Altura de b2: " + b2.getAltura());
        b2.subirDescer("subir", 100);
        System.out.println("Nova altura de b2 após subir: " + b2.getAltura());
        b2.subirDescer("descer", 500);
        System.out.println("Nova altura de b2 após descer: " + b2.getAltura());
        b2.subirDescer(" ", 500);
        System.out.println("Nova altura de b2 após uma entra inválida: " + b2.getAltura());

        //Equals
        System.out.println("b1 é igual a b1: " + b1.equals(b1));
        System.out.println("b1 é igual a b2: " + b1.equals(b2));
        System.out.println("b2 é igual a b4: " + b2.equals(b4));
        //Clone
        b4 = b2.cloneMe();
        System.out.println("Após Clone");
        System.out.println("b2 = " + b2.toString());
        System.out.println("b4 = " + b4.toString());
        System.out.println("b2 é igual a b4: " + b2.equals(b4));

    }

}
