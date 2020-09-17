package Shapes;

import static java.lang.Math.PI;

public class Circle {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return PI * r * r;
    }

}
