package pkg2c_rmiclient_sphere;

import compute.*;
import java.rmi.*;
import java.util.Scanner;

public class SphereClient {
    public static void main(String[] args) {
        try {
            String url = "rmi://127.0.0.1:3333/server";
            compute server = (compute)Naming.lookup(url);
            Scanner s=new Scanner(System.in);
            System.out.println("Program to calculate area of sphere !!!!");
            System.out.println("\nEnter the radius :");
            double radius=s.nextDouble();
            
            
            double result = server.spherearea(radius);
            System.out.println("Area of Sphere = " + result);
        }
        catch(Exception e) {
            System.err.println("Remote exception: ");
            e.printStackTrace();
        }
    }
}

