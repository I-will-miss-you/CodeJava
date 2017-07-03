package cap3;

/**
 * Classe que implementa os triplos representativos da informação de um produto de uma máquina de
 * venda.
 *
 * @author code36u4r60
 */
public class Produto2 {

    ///////////////////////////////////////////
    // Variáveis de Instância
    ///////////////////////////////////////////
    private String nome;
    private double preco;
    private int qtd;

    ///////////////////////////////////////////
    // Construtores
    ///////////////////////////////////////////
    public Produto2(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public Produto2(Produto2 p) {
        nome = p.getNome();
        preco = p.getPreco();
        qtd = p.getQtd();
    }

    public Produto2() {
    }

    ///////////////////////////////////////////
    // Getters e Setters
    ///////////////////////////////////////////
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    ///////////////////////////////////////////
    // Métedos
    ///////////////////////////////////////////
    @Override
    public String toString() {
        return "Produto2{" + "nome=" + nome + ", preco=" + preco + ", qtd=" + qtd + '}';
    }

    public Produto2 cloneMe() {
        return new Produto2(this);
    }

    public void removeQtd(int q) {
        setQtd(qtd - q);
    }

    public void addQtd(int q) {
        setQtd(qtd - q);
    }
}
