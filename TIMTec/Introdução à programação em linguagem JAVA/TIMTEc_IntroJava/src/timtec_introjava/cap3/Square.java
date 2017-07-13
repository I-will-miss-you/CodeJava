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
public class Square extends Shape {

    double l;

    public Square(double sideLength) {
        l = sideLength;
    }

    @Override
    public double getArea() {
        return Math.pow(l, 2);
    }
}
