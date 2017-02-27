package exercicio2;

/**
 *
 * @author code36u4r60
 */
public abstract class Contribuite {

//<editor-fold defaultstate="collapsed" desc="Attributes...">
    private String nome;
    private double rendaBruta;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Constructor's...">
    public Contribuite() {
    }

    public Contribuite(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getter's and Setter's...">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Methods...">
    
    public abstract double calcularImposto();
    
    @Override
    public String toString() {
        return "Contribuite{" + "nome=" + nome + ", rendaBruta=" + rendaBruta + '}';
    }
//</editor-fold>

}
