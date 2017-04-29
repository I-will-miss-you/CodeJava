package pacote;

/**
 *
 * @author code36u4r60
 */
public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product() {
        this("", 0, 0);
    }

    public Product(String name, double prics, int quantity) {
        this.name = name;
        this.price = prics;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    
}
