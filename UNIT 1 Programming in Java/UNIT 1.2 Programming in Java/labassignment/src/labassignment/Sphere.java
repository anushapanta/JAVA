package labassignment;

import static java.lang.Math.PI;

public class Sphere {

    private double r;

    public Sphere(double r) {
        this.r = r;
    }

    public double area() {
        return 4 * PI * r * r;
    }

    public static void main(String[] args) {
        Sphere c = new Sphere(10);
        System.out.println("Area of Sphere =" + c.area());
    }

}
