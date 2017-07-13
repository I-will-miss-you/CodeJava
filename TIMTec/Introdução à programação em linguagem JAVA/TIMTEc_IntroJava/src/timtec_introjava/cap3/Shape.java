package timtec_introjava.cap3;

/**
 *
 * @author code36u4r60
 */
public abstract class Shape {

    String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

}
