package labassignment;

import static java.lang.Math.PI;
import java.util.Scanner;

public class Sphere_Procedural {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius :");
        double radius = s.nextDouble();
        double area = 4 * PI * radius * radius;
        System.out.println("Area of sphere =" + area);
    }
}
