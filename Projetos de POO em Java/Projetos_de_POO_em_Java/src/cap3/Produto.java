package cap3;

/**
 * Um <strong>produto</strong> de um daddo <i>stock</i> de produtos possuias seguintes
 * características de informação:
 * <ul>
 * <li> código;
 * <li> nome;
 * <li> quantidade em stock;
 * <li> quantidade mínima;
 * <li> preço de compra;
 * <li> preço de venda ao público.
 * </ul>
 * Desenvolva uma classe {@code Produto} e os seguintes métodos de instância:
 * <ul>
 * <li> Alterar a quantidade de um produto, ou por saída ou por entrada de uma dada quantidade no
 * <em>stock</em>;
 * <li> Modificar o nome do produto;
 * <li> Modificar o preço de venda de um dado produto;
 * <li> Determinar o valor total da quantidade em <em>stock</em> em caso de venda;
 * <li> Determinar o lucro atual de tal <em>stock</em> em caso de venda total;
 * <li> Dada uma encomenda de X unidades do produto, determinar o preço total de tal encomenda;
 * <li> Verificar se um produto está já abaixo de uqnatidade mínimo de <em>stock</em>
 * </ul>
 *
 * @author code36u4r60
 */
public class Produto {

    ///////////////////////////////////////////
    // Variáveis de Instância
    ///////////////////////////////////////////
    private String codigo;
    private String nome;
    private int qtdStock;
    private int qtdMinima;
    private double precoCompra;
    private double pvp;

    ///////////////////////////////////////////
    // Construtores
    ///////////////////////////////////////////
    public Produto(String codigo, String nome, int qtdStock, int qtdMinima, double precoCompra, double pvp) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdStock = qtdStock;
        this.qtdMinima = qtdMinima;
        this.precoCompra = precoCompra;
        this.pvp = pvp;
    }

    public Produto(Produto p) {
        this.codigo = p.getCodigo();
        this.nome = p.getNome();
        this.qtdStock = p.getQtdStock();
        this.qtdMinima = p.getQtdMinima();
        this.precoCompra = p.getPrecoCompra();
        this.pvp = p.getPvp();
    }

    ///////////////////////////////////////////
    // Getters e Setters
    ///////////////////////////////////////////
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdStock() {
        return qtdStock;
    }

    public void setQtdStock(int qtdStock) {
        this.qtdStock = qtdStock < 0 ? 0 : qtdStock;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima < 0 ? 0 : qtdMinima;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    ///////////////////////////////////////////
    // Operações
    ///////////////////////////////////////////
    /**
     * Acrescenta mais artigos do produto ao stock já existente
     *
     * @param qtd quatidade de produto
     */
    public void addStock(int qtd) {
        setQtdStock(qtdStock + qtd);
    }

    /**
     * Remove uma data quantidade de artigos do stock caso seja possível.
     *
     * @param qtd quatidade de produto
     * @return {@code true} sucesso, {@code false} caso contrario
     */
    public boolean removeStock(int qtd) {
        if (qtdStock < qtd) {
            return false;
        }
        setQtdStock(qtdStock - qtd);
        return true;
    }

    /**
     * Altera o nome do produto
     *
     * @param nome novo nome
     */
    public void mudarNome(String nome) {
        setNome(nome);
    }

    /**
     * Valor monetário em stock
     *
     * @return valor monetário em stock
     */
    public double valorStock() {
        return qtdStock * pvp;
    }

    /**
     * Lucro obtido caso seja vendido todo o stock; Se o resultado for negativo é considerado
     * prejuizo.
     *
     * @return valor monetário
     */
    public double lucroStock() {
        return qtdStock * (pvp - precoCompra);
    }

    /**
     * Calcula o custo da encomenda
     *
     * @param n nº de artigos
     * @return o preço dos n artigos
     */
    public double precoEncomenda(int n) {
        return n * pvp;
    }

    /**
     * Verifica se o número de artigos em stock esta abaixo da margem minima.
     *
     * @return {
     * @caso true} esteja abaixo do valor mínimo, {@code false} caso contrario.
     */
    public boolean abaixoMin() {
        return qtdStock < qtdMinima;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", qtdStock=" + qtdStock + ", qtdMinima=" + qtdMinima + ", precoCompra=" + precoCompra + ", pvp=" + pvp + '}';
    }

    public String toStringFormat() {
        StringBuilder str = new StringBuilder("======== Produto ========\n");
        str.append("Codigo= ").append(codigo).append("\n");
        str.append("Nome= ").append(nome).append("\n");
        str.append("Quantidade em stock= ").append(qtdStock).append("\n");
        str.append("Quantidade minima= ").append(qtdMinima).append("\n");
        str.append("Preço de compra= ").append(precoCompra).append("€\n");
        str.append("Preço de venda= ").append(pvp).append("€\n");
        return str.toString();
    }

    public Produto cloneMe() {
        return new Produto(this);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p = new Produto("a001", "Arroz", 150, 20, 0.56, 0.90);
        System.out.println(p.toStringFormat());

        System.out.println(p.removeStock(300));

        System.out.println(p.lucroStock());

    }
}
