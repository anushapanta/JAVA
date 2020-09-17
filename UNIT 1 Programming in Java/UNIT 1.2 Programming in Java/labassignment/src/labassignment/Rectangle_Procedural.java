
package labassignment;

import java.util.Scanner;


public class Rectangle_Procedural {
     public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter length :");
        double length = s.nextDouble();
        System.out.println("Enter breadth :");
        double breadth = s.nextDouble();
        double area = length * breadth ;
        System.out.println("Area of rectangle =" +area);
    }
}
