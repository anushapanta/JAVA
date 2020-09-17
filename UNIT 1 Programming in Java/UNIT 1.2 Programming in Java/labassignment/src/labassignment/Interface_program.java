package labassignment;

import static java.lang.Math.PI;

interface Shapes {
    double area();
}

class Squares implements Shapes {
    public double l;
    public Squares(double l) {
        this.l = l;
    }
    @Override
    public double area() {
        return l * l;
    }
}

class Circles implements Shapes {
    public double r;
    public Circles(double r) {
        this.r = r;
    }
    @Override
    public double area() {
        return PI * r * r;
    }
}

public class Interface_program {
    public static void main(String[] args) {
        Shapes[] shapes = new Shapes[]{
            new Squares(10),
            new Circles(1)
        };
        for (Shapes s : shapes) {
            System.out.println(s.area());
        }
    }
}
