package cap3;

/**
 * Classe para testar a class MaqVenda
 *
 * @author code36u4r60
 */
public class TesteMaqVenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MaqVenda mq = new MaqVenda("Bebidas", 250.0);
        mq.addProduto(new Produto2("Coca-Cola", 1, 20));
        mq.addProduto(new Produto2("Agua-Natural", 0.30, 25));
        mq.addProduto(new Produto2("Fanta-Laranja", 0.45, 15));
        mq.addProduto(new Produto2("Fanta-Ananas", 0.45, 15));
        mq.addProduto(new Produto2("Ice-Tea-Limao", 0.40, 15));
        mq.addProduto(new Produto2("Leite-Achoc.", 0.25, 10));
        mq.addProduto(new Produto2("Agua-Mineral", 0.35, 15));
        mq.addProduto(new Produto2("Ice-Tea-Pessego", 0.40, 15));

        System.out.println(mq.prodsMaqTxt());
        System.out.println("\n ======================================= \n");
        System.out.println(mq.toString());

        mq.compra("Fanta-Ananas", 10);
        System.out.println("\n ======================================= \n");
        System.out.println(mq.toString());
    }

}
