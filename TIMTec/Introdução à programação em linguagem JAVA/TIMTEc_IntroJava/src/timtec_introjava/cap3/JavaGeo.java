package timtec_introjava.cap3;

/**
 *
 * @author code36u4r60
 */
public class JavaGeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Shape s = new Shape(); //Classe abstrata não pode ser estendida
        //s.setColor("Blue");
        //System.out.println(s.getColor());
        //
        //Shape c = new Circle(2);
        //c.setColor("Blue");
        //System.out.println(c.getColor());
        //
        //Shape sq = new Square(2);
        //sq.setColor("Blue");
        //System.out.println(sq.getColor());
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
