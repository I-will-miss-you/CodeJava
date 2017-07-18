package cap4;

import cap3.Ponto2D;
import java.util.ArrayList;
import java.util.Objects;

/**
 * <p>
 * Desenvolva um classe <code>Plano</code> que represente uma série de pontos2D de um plano
 * cartesiano num <code>&lt;ArrayListPonto&gt;</code> e (poderiamos usar um
 * <code>HashSet&lt;Ponto2D&gt;</code>).</p>
 *
 * <p>
 * Desenvolva, para além dos construtores e métodos usuais, métodos que implementem as seguintes
 * funcionalidades:
 * <ul>
 * <li> Determinar o número total de pontos de um plano;
 * <li> Adicionar um novo ponto ao plano e remover um ponto caso exista;
 * <li> Dado um <code>&lt;Ponto2D&gt;</code>, juntar tais pontos ao plano caso exista;
 * <li> Determinar todos os pontos com coordenada em XX igual a <b>cx</b>, dada como parâmetro, de
 * <b>dx</b> unidades, igualmente dadas como parâmetro (alterar os pontos, portanto);
 * <li> Dado um plano como parâmetro, determine quantos pontos são comuns aos dois planos;
 * <li> Criar a lista contendo os pontos comuns ao plano recetor e ao plano parâmetro;
 * <li> Criar uma lista contendo todos os pontos do plano com coordenada em XX inferior a um valor
 * dado como parâmetro (atenção, pretende-se obter cópias dos originais);
 * <li> Criar um novo plano que contenha os pontos comuns entre o plano recetror e um plano dado
 * como parâmetro;
 * <li> Não esquecer os métedos <code>equals()</code>, <code>toString()</code> e
 * <code>clone()</code>.
 * </ul>
 *
 * @author code36u4r60
 */
public class Plano {

    ///////////////////////////////////////////
    // Variáveis de Instância
    ///////////////////////////////////////////
    private ArrayList<Ponto2D> pontos;

    ///////////////////////////////////////////
    // Construtores
    ///////////////////////////////////////////
    public Plano() {
        pontos = new ArrayList<>();
    }

    public Plano(ArrayList<Ponto2D> pontos) {
        this.pontos = new ArrayList<>(pontos);
    }

    public Plano(Plano plano) {
        this.pontos = new ArrayList<>(plano.getPontos());
    }

    ///////////////////////////////////////////
    // Getters and Setters
    ///////////////////////////////////////////
    public ArrayList<Ponto2D> getPontos() {
        return pontos;
    }

    public void setPontos(ArrayList<Ponto2D> pontos) {
        this.pontos = new ArrayList<>(pontos);
    }

    ///////////////////////////////////////////
    // Outros Método
    ///////////////////////////////////////////
    /**
     * Devolve o número actual de pontos do plano
     *
     * @return número actual de pontos do plano
     */
    public int size() {
        return pontos.size();
    }

    /**
     * Verifica se um ponto existe no plano
     *
     * @param p Ponto2D
     * @return {@code true} se contiver; {@code false} caso contrário
     */
    public boolean contains(Ponto2D p) {
        return pontos.contains(p);
    }

    /**
     * Adiciona um novo ponto ao plano
     *
     * @param p Ponto2D
     */
    public void add(Ponto2D p) {
        pontos.add(p);
    }

    /**
     * Adiciona ao Plano todos os elementos da lista {@code pontos}, garantindo que não haja
     * duplicados.
     *
     * @param pontos Lista de Pontos2D
     */
    public void add(ArrayList<Ponto2D> pontos) {
        pontos.stream().filter((p) -> (!contains(p))).forEach((p) -> {
            add(p);
        });
    }

    /**
     * Remove um ponto do plano
     *
     * @param p Ponto2D
     */
    public void remove(Ponto2D p) {
        pontos.remove(p);
    }

    /**
     * Conta o números de Ponto2D's que estajam a direita ou a cima do Ponto2D {@code ponto}
     *
     * @param ponto Ponto2D
     * @return quantidade de pontos
     */
    public int countRightOrUp(Ponto2D ponto) {
        return (int) pontos.stream().filter((p) -> (p.getX() > ponto.getX() || p.getY() > p.getY())).count();
    }

    /**
     * Desloca todos os pontos de coordenada em X igual a cx de dx unidades
     *
     * @param cx posição atual
     * @param dx nova posição
     */
    public void movePointsX(double cx, double dx) {
        pontos.stream().filter((p) -> (p.getX() == cx)).forEach((p) -> p.setX(dx));
    }

    /**
     * Conta os pontos comuns entre dois planos
     *
     * @param plano plano com o qual se vai comparar os pontos
     * @return quantidade de pontos em comum
     */
    public int countCommonPoints(Plano plano) {
        return (int) pontos.stream().filter((pts) -> (plano.contains(pts))).count();
    }

    /**
     * Cria uma lista com os pontos em comum
     *
     * @param plano plano com o qual se vai comparar os pontos
     * @return ArrayList com os pontos em comum
     */
    public ArrayList<Ponto2D> commonPoints(Plano plano) {
        ArrayList<Ponto2D> p = new ArrayList<>();
        pontos.stream().filter((pts) -> (plano.contains(pts))).forEach((pts) -> p.add(pts));
        return p;
    }

    /**
     * Cria uma lista com os pontos é a sua posição no eixo do X's é dx
     *
     * @param dx posição no eixo do X's
     * @return ArrayList com os pontos em comum
     */
    public ArrayList<Ponto2D> commonPointsXX(double dx) {
        ArrayList<Ponto2D> p = new ArrayList<>();
        pontos.stream().filter((pts) -> (pts.getX() == dx)).forEach((pts) -> p.add(pts));
        return p;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Plano other = (Plano) obj;
        return Objects.equals(this.pontos, other.pontos);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.pontos);
        return hash;
    }

    public Plano cloneMe() {
        return new Plano(this);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("«««««   PLANO   »»»»»\n");

        pontos.forEach((p) -> {
            str.append(p);
            str.append("\n");
        });
        return str.toString();
    }

    /**
     * Teste da classe
     *
     * @param args argumentos
     */
    public static void main(String[] args) {
        ArrayList<Ponto2D> pontos = new ArrayList<>();
        pontos.add(new Ponto2D(1, 3));
        pontos.add(new Ponto2D(2, 6));
        pontos.add(new Ponto2D(3, 9));
        pontos.add(new Ponto2D(4, 12));

        Plano plano = new Plano(pontos);
        System.out.println("Todos os pontos:");
        plano.getPontos().forEach((ponto) -> System.out.println(ponto));

        //CONTAINS
        System.out.println("\nContains ponto(x = 2.0, y = 6.0) (true): " + plano.contains(new Ponto2D(2, 6)));
        System.out.println("Contains ponto(x = 2.0, y = 2.0) (false): " + plano.contains(new Ponto2D(2, 2)));

        //ADD
        Ponto2D ponto515 = new Ponto2D(5, 15);
        System.out.println("\nDeve conter um ponto(5 , 15)");
        plano.add(ponto515);
        plano.getPontos().forEach((ponto) -> System.out.println(ponto));

        //ADD
        ArrayList<Ponto2D> pontos2 = new ArrayList<>();
        pontos2.add(new Ponto2D(2, 6));
        pontos2.add(new Ponto2D(4, 12));
        pontos2.add(new Ponto2D(6, 18));
        pontos2.add(new Ponto2D(7, 21));
        plano.add(pontos2);
        System.out.println("\nDeve conter mais dois novos pontos. (6 , 18) e o (7 , 21)");
        plano.getPontos().forEach((ponto) -> System.out.println(ponto));

        //REMOVE
        System.out.println("\nNão deve conter um ponto(5 , 15)");
        plano.remove(ponto515);
        plano.getPontos().forEach((ponto) -> System.out.println(ponto));

        //COUNT RIGHT OR UP
        System.out.println("\nExiste 6 a direita ou acima de  pont(0 ,0): " + plano.countRightOrUp(new Ponto2D(0, 0)));
        System.out.println("Existe 0 a direita ou acima de  pont(20 ,20): " + plano.countRightOrUp(new Ponto2D(20, 20)));
        System.out.println("Existe 2 a direita ou acima de  pont(0 ,0): " + plano.countRightOrUp(new Ponto2D(5, 15)));

        //MOVE POINTS X
        plano.add(new Ponto2D(2, 5));
        System.out.println("\nMove todos os pontos em que sou posição seja x = 2 para uma nova posição x = 8");
        plano.movePointsX(2, 8);
        plano.getPontos().forEach((ponto) -> System.out.println(ponto));
        plano.remove(new Ponto2D(8, 5));

        //Number Of Common Points
        Plano plano2 = new Plano(plano);
        plano2.remove(new Ponto2D(6, 18));
        System.out.println("Contar Pontos Comuns");
        System.out.println("R: 5 -> " + plano.countCommonPoints(plano2));
        System.out.println("R: 6 -> " + plano.countCommonPoints(plano));

        //Common Points
        System.out.println("\nLista de Pontos em Comum");
        ArrayList<Ponto2D> plano3 = plano.commonPoints(plano2);
        plano3.forEach((ponto) -> System.out.println(ponto));

        //Common Points para X = ?
        plano.add(new Ponto2D(8, 23));
        System.out.println("\nLista de Pontos para x = 8");
        plano3 = plano.commonPointsXX(8);
        plano3.forEach((ponto) -> System.out.println(ponto));

        //Equals
        System.out.println("\nEQUALS");
        Plano plano4 = plano.cloneMe();
        System.out.println("Plano == Plano (true)  -> " + plano.equals(plano));
        System.out.println("Plano == Plano2 (false)  -> " + plano.equals(plano2));
        System.out.println("Plano == Plano4 (true)  -> " + plano.equals(plano4));

        //toString
        System.out.println("\ntoString");
        System.out.println(plano.toString());
    }
}
