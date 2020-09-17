package pkg2a_rmiclient_circle;

import compute.*;
import java.rmi.*;
import java.util.Scanner;

public class CircleClient {
    public static void main(String[] args) {
        try {
            String url = "rmi://127.0.0.1:1111/server";
            compute server = (compute)Naming.lookup(url);
            Scanner s=new Scanner(System.in);
            System.out.println("Program to calculate area of circle !!!!");
            System.out.println("\nEnter the radius :");
            double radius=s.nextDouble();
            
            double result = server.circlearea(radius);
            System.out.println("Area of Circle = " + result);
        }
        catch(Exception e) {
            System.err.println("Remote exception: ");
            e.printStackTrace();
        }
    }
}
