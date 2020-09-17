package labassignment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class Rectangle_OO {

    private float l = 0, b = 0;

    public Rectangle_OO(float l, float b) {
        this.l = l;
        this.b = b;
    }

    public float area() {
        return l * b;
    }

    public float perimeter() {
        return 2 * l + 2 * b;
    }

    public static void main(String[] args) {
        Rectangle_OO r = new Rectangle_OO(80, 50);
        System.out.println("Area of Rectangle=" + r.area());
        System.out.println("Perimeter of Rectangle=" + r.perimeter());
    }
}
