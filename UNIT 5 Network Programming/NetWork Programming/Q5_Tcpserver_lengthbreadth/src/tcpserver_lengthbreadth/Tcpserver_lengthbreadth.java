/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpserver_lengthbreadth;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Tcpserver_lengthbreadth {

    public static void main(String[] args) throws IOException {
        final int PORT = 1234;
        System.out.println("Server started.");
        System.out.println("Listening to client..........");

        try (
                ServerSocket serverSocket = new ServerSocket(PORT);
                Socket clientSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                Scanner in = new Scanner(clientSocket.getInputStream());) {
            while (true) {
                String line1 = in.nextLine();
                int length = Integer.valueOf(line1);
                String line2 = in.nextLine();
                int breadth = Integer.valueOf(line2);
                
                

                if (line1.equalsIgnoreCase("exit")) {

                    break;
                }
                
                System.out.println("Ok..I will calculate the area of rectangle for "
                        + "length =" + length + "breadth="+breadth);
                
                double area = length*breadth;
                String inputline = Double.toString(area);
                
                

                out.println(inputline);
            }
        }

        System.out.println("Server stopped.");
    }
    
}
