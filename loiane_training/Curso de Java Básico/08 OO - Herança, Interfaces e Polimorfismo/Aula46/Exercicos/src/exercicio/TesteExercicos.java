package exercicio;

/**
 *
 * @author code36u4r60
 */
public class TesteExercicos {

    public static void main(String[] args) {
        Quadrado f1 = new Quadrado(2);
        f1.setNome("Quadrado");
        Circulo f2 = new Circulo(2);
        f2.setNome("Circulo");
        Triangulo f3 = new Triangulo(3, 2);
        f3.setNome("Triangulo");

        Cubo f4 = new Cubo(3);
        f4.setNome("Cubo");
        Cilindro f5 = new Cilindro(3, 2);
        f5.setNome("Cilindro");
        Piramide f6 = new Piramide(3, 2, 4, 4, f1);
        f6.setNome("Piramide");

        FiguraGeometrica[] figuras = {f1, f2, f3, f4, f5, f6};

        for (FiguraGeometrica figura : figuras) {
            System.out.println("---------------------------------");
            System.out.println(figura.getNome());
            if (figura instanceof Figura2D) {
                Figura2D f2d = (Figura2D) figura;
                System.out.println("Area = " + f2d.calcularArea());
            }
            if (figura instanceof Figura3D) {
                Figura3D f3d = (Figura3D) figura;
                System.out.println("Area = " + f3d.calcularArea());
                System.out.println("Volume = " + f3d.calcularVolume());
            }
        }

    }

}
