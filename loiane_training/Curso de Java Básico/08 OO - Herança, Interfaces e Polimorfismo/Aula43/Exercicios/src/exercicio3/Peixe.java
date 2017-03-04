package exercicio3;

/**
 *
 * @author code36u4r60
 */
public class Peixe extends Animal {

//<editor-fold defaultstate="collapsed" desc="Attributes...">
    private String caracteristicas;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Constructor's...">
    public Peixe() {
        super.setPatas(0);
        super.setCor("Cinzenta");
        super.setAmbiente("Mar");
        this.caracteristicas = "Barbatanas e Cauda";
    }

    public Peixe(String caracteristicas, String nome, int comprimento, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, cor, ambiente, velocidade);
        this.caracteristicas = caracteristicas;
    }

    public Peixe(String caracteristicas, String nome, int comprimento, int patas, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.caracteristicas = caracteristicas;
    }

    public Peixe(String nome, int comprimento, double velocidade) {
        super(nome, comprimento, 0, "Cinzenta", "Mar", velocidade);
        this.caracteristicas = "Barbatanas e Cauda";
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getter's and Setter's...">
    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Methods...">
    @Override
    public String toString() {
        return "Peixe{" + "caracteristicas=" + caracteristicas + " " + super.toString() + '}';
    }
//</editor-fold>

}
