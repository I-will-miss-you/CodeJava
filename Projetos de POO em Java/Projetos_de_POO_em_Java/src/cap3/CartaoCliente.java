package cap3;

/**
 * <p>
 * Um <strong>cartão de cliente</strong> é um cartão que acumula pontos de bonificação à medida que
 * são registadas compras e que possui e que possui o valor total em dinheiro das compras
 * realizadas, um código alfanumérico e um nome de titular. Num dado estabelecimento, as regras são
 * as seguintes:
 * <ul>
 * <li> Por cada comprar efetuada em euros; o clienete recebe de bónus um número de pontos(inteiro)
 * que é o arredondamento para baixo de 10% do valor da compra;
 * <li> Sempre que é atingido um valor múltiplo de 50 pontos, o cliente acumula mais 5 pontos por
 * cada 50, que são acrescentados aos que já tinha no cartão;
 * </ul>
 * </p>
 * <p>
 * Escrever uma classe {@code CartaoCliente} cujas instâncias exibam este comportamentos e permitam
 * ainda:
 * <ul>
 * <li> Descontar P pontos ao cartão devido a levatamento de um prémio;
 * <li> Modificar o titular do cartão;
 * <li> Modificar a taxa de prémio, passando por exemplo de X% para Y%;
 * <li> Descarregar os pontos de um qualquer cartão para o nosso cartão;
 * <li> Inserir no cartão a informação de uma nova compra de certo valor e atualizar dados;
 * </ul>
 * </p>
 *
 * @author code36u4r60
 */
public class CartaoCliente {

    ///////////////////////////////////////////
    // Constantes
    ///////////////////////////////////////////
    private final static double TAXA = 10;

    ///////////////////////////////////////////
    // Variáveis de Instância
    ///////////////////////////////////////////
    private String codigo;
    private String titular;
    private double totalCompras;
    private int pontos;
    private double taxaPremio;

    ///////////////////////////////////////////
    // Construtores
    ///////////////////////////////////////////
    public CartaoCliente(String codigo, String titular, double totalCompras, int pontos, double taxaPremio) {
        this.codigo = codigo;
        this.titular = titular;
        this.totalCompras = totalCompras;
        this.pontos = pontos;
        this.taxaPremio = taxaPremio;
    }

    public CartaoCliente(String codigo, String titular) {
        this(codigo, titular, 0, 0, TAXA);
    }

    public CartaoCliente(CartaoCliente cartao) {
        this(cartao.getCodigo(), cartao.getTitular(), cartao.getTotalCompras(), cartao.getPontos(), cartao.getTaxaPremio());
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

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(double totalCompras) {
        this.totalCompras = totalCompras;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public double getTaxaPremio() {
        return taxaPremio;
    }

    public void setTaxaPremio(double taxaPremio) {
        this.taxaPremio = taxaPremio;
    }

    ///////////////////////////////////////////
    // Operações
    ///////////////////////////////////////////
    public void addPontos(int pontos) {
        setPontos(this.pontos + pontos);
    }

    public void descontaPontos(int pontos) {
        setPontos(this.pontos - pontos);
    }

    public int compra(double valor) {
        int mult50 = (int) totalCompras / 50;

        setTotalCompras(totalCompras + valor);
        int bonus = (int) (valor * TAXA / 100);
        setPontos(pontos + bonus);

        int extra = (int) totalCompras / 50 - mult50;
        setPontos(pontos + extra);

        return pontos;
    }

    public boolean transferPontos(CartaoCliente c, int p) {
        if (p > pontos) {
            return false;
        }
        c.addPontos(p);
        descontaPontos(p);
        return true;
    }

    public CartaoCliente cloneMe() {
        return new CartaoCliente(this);
    }

    @Override
    public String toString() {
        return "CartaoCliente{" + "codigo=" + codigo + ", titular=" + titular + ", totalCompras=" + totalCompras + ", pontos=" + pontos + ", taxaPremio=" + taxaPremio + '}';
    }

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CartaoCliente c1 = new CartaoCliente("AES000", "Maria da Luz");
        System.out.println(c1.getPontos());

        //Testar Compras
        c1.compra(49);
        System.out.println("Compra de 49€.\n" + c1.toString());
        c1.compra(1);
        System.out.println("Compra de 1€.\n" + c1.toString());
        c1.compra(49);
        System.out.println("Compra de 49€.\n" + c1.toString());
        c1.compra(50);
        System.out.println("Compra de 50€.\n" + c1.toString());
        c1.compra(1);
        System.out.println("Compra de 1€.\n" + c1.toString());
        c1.compra(100);
        System.out.println("Compra de 100€.\n" + c1.toString());
        c1.compra(5);
        System.out.println("Compra de 5€.\n" + c1.toString());

        System.out.println("\n\nTeste - Tranferencia de Pontos");
        //Tranferencia de Pontos
        CartaoCliente c2 = c1.cloneMe();
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println("Transferencia de 50 pontos de C1 para C2: ");
        c1.transferPontos(c2, 50);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println("Transferencia de 20 pontos de C1 para C2: ");
        c1.transferPontos(c2, 20);
        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }

}
