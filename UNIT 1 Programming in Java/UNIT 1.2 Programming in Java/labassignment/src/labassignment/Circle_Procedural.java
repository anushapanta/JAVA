package labassignment;

import static java.lang.Math.PI;
import java.util.Scanner;

public class Circle_Procedural {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = c.nextDouble();
        double area = PI * radius * radius;
        System.out.println("Area of circle =" + area);      
    }
 
}
