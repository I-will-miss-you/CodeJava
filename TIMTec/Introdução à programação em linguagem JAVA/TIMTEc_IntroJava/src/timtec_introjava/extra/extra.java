package timtec_introjava.extra;

import timtec_introjava.cap3.Circle;
import timtec_introjava.cap3.Square;
import timtec_introjava.cap3.Shape;

/**
 *
 * @author code36u4r60
 */
public class extra {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(2);
        shapes[0].setColor("Blue");

        shapes[1] = new Square(2);
        shapes[1].setColor("Red");

        for (Shape shape : shapes) {
            System.out.println("Cor: " + shape.getColor() + " Área: " + shape.getArea());
        }
    }

}
