package Test;

import Shapes.Circle;
import Shapes.Square;

public class ShapeDemo {

    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println("Area of circle =" + c.area());

        Square r = new Square(10);
        System.out.println("Area of Square=" + r.area());
    }

}
