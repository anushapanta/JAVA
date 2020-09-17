
package labassignment;

import java.util.Scanner;


public class Square_Procedural {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter length :");
        double length = s.nextInt();
        double area = length * length ;
        System.out.println("Area of square =" +area);
    }
    
}
