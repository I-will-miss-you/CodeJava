/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timtec_introjava.cap3;

/**
 *
 * @author code36u4r60
 */
public class Circle extends Shape {

    double r;

    public Circle(double radius) {
        r = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

}
