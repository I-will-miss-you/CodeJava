package exerclpii;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author code36u4r60
 */
public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0.0, 0.0);
    }

    public Point(Point p) {
        this(p.getX(), p.getY());
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void incCoord(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void decCoord(double dx, double dy) {
        x -= dx;
        y -= dy;
    }

    public void somaPonto(Point p) {
        x += p.getX();
        y += p.getY();
    }

    public Point somaPonto(double x, double y) {
        return new Point(this.x + x, this.y + y);
    }

    public boolean simetrico() {
        return abs(x) == abs(y);
    }

    public double distanciaX(Point p) {
        return x - p.x;
    }

    public double distanciaY(Point p) {
        return y - p.y;
    }

    public double distanceXY(Point p) {
        return sqrt(pow(distanciaX(p), 2) + pow(distanciaY(p), 2));
    }

    public boolean equals(Point p) {
        return (p == null) ? false : x == p.getX() && y == p.getY();
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 3);

        System.out.println(p1.distanceXY(p2));

    }
}
