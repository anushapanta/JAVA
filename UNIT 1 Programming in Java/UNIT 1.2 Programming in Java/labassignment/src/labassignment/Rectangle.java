package labassignment;

import java.util.*;

public class Rectangle {

    private float l, b;

    public Rectangle(float l, float b) {
        this.l = l;
        this.b = b;
    }

    public float area() {
        return l * b;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Area of Rectangle=" + r.area());
    }

    

}
