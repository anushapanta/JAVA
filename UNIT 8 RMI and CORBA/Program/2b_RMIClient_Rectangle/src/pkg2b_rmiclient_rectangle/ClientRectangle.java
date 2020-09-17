package pkg2b_rmiclient_rectangle;

import compute.*;
import java.rmi.*;
import java.util.Scanner;

public class ClientRectangle {
    public static void main(String[] args) {
        try {
            String url = "rmi://127.0.0.1:2222/server";
            compute server = (compute)Naming.lookup(url);
            Scanner s=new Scanner(System.in);
            System.out.println("Program to calculate area of rectangle !!!!");
            System.out.println("\nEnter the length :");
            double length=s.nextDouble();
            System.out.println("\nEnter the breadth");
            double breadth=s.nextDouble();
            
            double result = server.rectanglearea(length,breadth);
            System.out.println("Area of Rectangle = " + result);
        }
        catch(Exception e) {
            System.err.println("Remote exception: ");
            e.printStackTrace();
        }
    }
}

