package exercicio3;

/**
 *
 * @author code36u4r60
 */
public class Animal {

//<editor-fold defaultstate="collapsed" desc="Attributes...">
    private String nome;
    private int comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Constructor's...">
    public Animal() {
        this.patas = 4;
    }

    public Animal(String nome, int comprimento, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = 4;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public Animal(String nome, int comprimento, int patas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getter's and Setter's...">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Methods...">
    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", comprimento=" + comprimento + ", patas=" + patas + ", cor=" + cor + ", ambiente=" + ambiente + ", velocidade=" + velocidade + '}';
    }
//</editor-fold>

}
