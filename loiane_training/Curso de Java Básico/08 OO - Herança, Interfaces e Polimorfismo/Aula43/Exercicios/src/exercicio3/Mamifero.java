package exercicio3;

/**
 *
 * @author code36u4r60
 */
public class Mamifero extends Animal {

//<editor-fold defaultstate="collapsed" desc="Attributes...">
    private String alimento;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Constructor's...">
    public Mamifero() {
        super.setCor("Castanho");
        super.setAmbiente("Terra");
        this.alimento = "Mel";
    }

    public Mamifero(String nome, int comprimento, double velocidade) {
        super(nome, comprimento, "Castanho", "Terra", velocidade);
        this.alimento = "Mel";
    }

    public Mamifero(String alimento, String nome, int comprimento, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public Mamifero(String alimento, String nome, int comprimento, int patas, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getter's and Setter's...">
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Methods...">
    @Override
    public String toString() {
        return "Mamifero{" + "alimento=" + alimento + " " + super.toString() + '}';
    }
//</editor-fold>
}
