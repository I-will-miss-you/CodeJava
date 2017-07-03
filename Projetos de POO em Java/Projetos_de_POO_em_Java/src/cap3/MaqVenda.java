package cap3;

import static java.lang.System.arraycopy;
import java.util.Arrays;

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
        arraycopy(this.listProdutos, 0, listProdutos, 0, this.numProds);
        this.numProds = numprods;
    }

    public MaqVenda(String prod, double cash) {
        tipoProduto = prod;
        totalDinheiro = cash;
        numProds = 0;
        listProdutos = new Produto2[MAX_PROD];
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

    public int getNumprods() {
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

}
