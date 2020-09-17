package labassignment;

import java.util.*;

public class Square {

    private float l;

    public Square(float l) {
        this.l = l;

    }

    public float area() {
        return l * l;
    }

    public static void main(String[] args) {
        Square r = new Square(10);
        System.out.println("Area of Square=" + r.area());
    }

}
