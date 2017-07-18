package cap3;

import static java.lang.System.arraycopy;

/**
 * <p>
 * Desenvolver uma classe {@code MaqVenda} que define a estrutura e o comportamento de uma máquina
 * de venda de produtos de um dado tipo (cf. bebidas, bolos, tabaco, etc.), sendo cada tipoProduto
 * representado por um <strong>nome</strong>, pelo seu <strong>preço</strong> e pela sua
 * <strong>quantidade na máquina</strong>. A máquina de venda estará em cada mometo num dos
 * seguintes <strong>ESTADOS</strong>: <strong>ligada</strong> ou <strong>desligada</strong>
 * (ESTADOS OK e OFF, respetivamente) ou <strong>avarida</strong> (estado AV). Apenas no estado OK
 * poderão os utilizadores comprar produtos, caso a máquina os tenha. Todas máquinas de venda
 * possuem um número máximo de 50 produtos distintos para venda, controlam o tatal de dinheiro que
 * contêm a cada momento e sabem o número efectivo de produtos distintos que têm à venda em cada
 * caso</p>
 * <p>
 * Qualquer máquina permite saber o seu estado atual, o preço de um dado tipoProduto, o total de
 * dinheiro que possui, o tipo de produtos vendidos, o total de produtos à venda e o número total de
 * compras feitas.</p>
 * <p>
 * Para além destas operações básicas, estas máquinas deverão permitir comprar um dado tipoProduto -
 * operação que deverá ser previamente validada -, inserir mais dinheiro na máquina inserir um novo
 * tipoProduto, devolver uma lista com os nomes dos produtos existentes (tenham ou não quantidade a
 * 0) e devolver ums listagem contendo por linha a informação completa sobre cada tipoProduto.
 * Codifique ainda o método {@code toString()}.</p>
 *
 * @author code36u4r60
 */
public class MaqVenda {

    ///////////////////////////////////////////
    // Variáveis da Classe
    ///////////////////////////////////////////
    private static final int MAX_PROD = 50;
    private static final String[] ESTADOS = {"OK", "OFF", "AV", "SD", "SP"};

    ///////////////////////////////////////////
    // Variáveis da Classe
    ///////////////////////////////////////////
    public static int getMAX_PROD() {
        return MAX_PROD;
    }

    public static String[] getEstados() {
        return ESTADOS;
    }

    ///////////////////////////////////////////
    // Variáveis de Instância
    ///////////////////////////////////////////
    private String tipoProduto; //tipo de tipoProduto da máquina
    private double totalDinheiro;
    private int numCompras; //toatl de compras efetuadas
    private String estado;
    private Produto2[] listProdutos;
    private int numProds; //número de produtos existentes

    ///////////////////////////////////////////
    // Construtores
    ///////////////////////////////////////////
    public MaqVenda(String tipoProduto, double totalDinheiro, Produto2[] listProdutos, int numprods) {
        this.tipoProduto = tipoProduto;
        this.totalDinheiro = totalDinheiro;
        this.numCompras = 0;
        this.estado = "OK";
        listProdutos = new Produto2[MAX_PROD];
        arraycopy(this.listProdutos, 0, listProdutos, 0, this.numProds);
        this.numProds = numprods;
    }

    public MaqVenda(String tipoProduto, double totalDinheiro) {
        this.tipoProduto = tipoProduto;
        this.totalDinheiro = totalDinheiro;
        this.numCompras = 0;
        this.estado = "OK";
        listProdutos = new Produto2[MAX_PROD];
        this.numProds = 0;
    }

    ///////////////////////////////////////////
    // Getters e Setters
    ///////////////////////////////////////////
    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public double getTotalDinheiro() {
        return totalDinheiro;
    }

    public void setTotalDinheiro(double totalDinheiro) {
        this.totalDinheiro = totalDinheiro;
    }

    public int getNumCompras() {
        return numCompras;
    }

    public void setNumCompras(int numCompras) {
        this.numCompras = numCompras;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = setEstadoOK(estado) ? estado : this.estado;
    }

    private boolean setEstadoOK(String estado) {
        for (String s : ESTADOS) {
            if (s.equalsIgnoreCase(estado)) {
                return true;
            }
        }
        return false;
    }

    public Produto2[] getListProdutos() {
        Produto2[] prods = new Produto2[numProds];
        arraycopy(listProdutos, 0, prods, 0, numProds);
        return prods;
    }

    public int getNumProds() {
        return numProds;
    }

    public void setNumprods(int numprods) {
        this.numProds = numprods;
    }

    ///////////////////////////////////////////
    // Outros Metedos
    ///////////////////////////////////////////
    /**
     * Determina o preço de um produto
     *
     * @param prod nome do produto
     * @return preço do produto
     */
    public double precoDe(String prod) {
        int ind = procuraProduto(prod);
        return (ind < 0) ? -1 : listProdutos[ind].getPreco();
    }

    /**
     * Procura um produto com um dado {@code nome}. Caso exista retire o seu índice.
     *
     * @param nome nome do produto
     * @return índice do produto
     */
    private int procuraProduto(String nome) {
        for (int i = 0; i < numProds; i++) {
            if (listProdutos[i].getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Realizar um compra
     *
     * @param produto nome do produto
     * @param quatidade quantidade a comprar
     * @return o custo total da compra
     */
    public double compra(String produto, int quatidade) {
        int idx = procuraProduto(produto);
        double preco = -1;
        if (precompra(produto, quatidade)) {
            listProdutos[idx].removeQtd(quatidade);
            preco = listProdutos[idx].getPreco() * quatidade;
        }
        return preco;
    }

    private boolean precompra(String produto, int quatidade) {
        int idx = procuraProduto(produto);
        return idx >= 0 && listProdutos[idx].getQtd() >= quatidade && estado.equals("OK");
    }

    /**
     * Carrega a máquina com mais dinheiro
     *
     * @param cash dinheiro
     */
    public void maisCash(double cash) {
        totalDinheiro += cash;
    }

    /**
     * Insere um novo produto na máquina
     *
     * @param produto nome de produto
     * @param preco preço do produto
     * @param quantidade quantidade de produtos
     * @return {@code true} caso seja adicionado um novo produto; {@code false} caso contrário.
     */
    public boolean addProduto(String produto, double preco, int quantidade) {
        if (procuraProduto(produto) >= 0) {
            return false;
        }
        if (getNumProds() >= 20) {
            return false;
        }
        listProdutos[getNumProds()] = new Produto2(produto, preco, quantidade);
        numProds++;
        return true;
    }

    public boolean addProduto(Produto2 p) {
        if (p == null) {
            return false;
        }
        return addProduto(p.getNome(), p.getPreco(), p.getQtd());
    }

    /**
     * Cria um array com os nomes de todos os produtos
     *
     * @return lista com os nomes
     */
    public String[] nomeProdutos() {
        String[] nomes = new String[numProds];
        for (int i = 0; i < numProds; i++) {
            nomes[i] = listProdutos[i].getNome();
        }
        return nomes;
    }

    /**
     * Total de produtos na máquina
     *
     * @return total de produtos em máquina
     */
    public int totalProds() {
        int total = 0;
        for (int i = 0; i < numProds; i++) {
            total += listProdutos[i].getQtd();
        }
        return total;
    }

    /**
     * Devolve sob a forma de uma String toda a informação atual sobre os produtos contidos na
     * máquina
     *
     * @return String toda a informação dos produtos
     */
    public String prodsMaqTxt() {
        StringBuilder s = new StringBuilder();
        s.append("==== Produtos na máquina ====\n");
        for (int i = 0; i < numProds; i++) {
            s.append(listProdutos[i].toString()).append("\n");
        }
        return s.toString();
    }

    /**
     * Devolve sob a forma de uma String toda a informação atual da máquina de venda.
     *
     * @return tring toda a informação da máquina de venda
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Máquina de: ").append(tipoProduto).append("\n");
        s.append("Dinheiro em caixa: ").append(totalDinheiro).append("\n");
        s.append("Estado: ").append(estado).append("\n");
        s.append("Volume de vendas: ").append(numCompras).append("\n");
        s.append(this.prodsMaqTxt());
        return s.toString();
    }

}
