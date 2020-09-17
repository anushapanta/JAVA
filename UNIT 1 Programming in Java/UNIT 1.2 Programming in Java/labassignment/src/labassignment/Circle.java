package labassignment;

import static java.lang.Math.PI;

public class Circle {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return PI * r * r;
    }

    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println("Area of circle =" + c.area());
    }

}
