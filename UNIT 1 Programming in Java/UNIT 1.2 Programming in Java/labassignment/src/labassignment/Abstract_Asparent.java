package labassignment;

import static java.lang.Math.PI;

abstract class Shape {
    public abstract double area();
}

public class Abstract_Asparent extends Shape {
    private double r;

    public Abstract_Asparent(double r) {
        this.r = r;
    }
    
    @Override
    public double area() {
        return PI * r * r;
    }

    public static void main(String[] args) {
        Abstract_Asparent a = new Abstract_Asparent(1);
        System.out.println("Area of circle ="+ a.area());
    }
}