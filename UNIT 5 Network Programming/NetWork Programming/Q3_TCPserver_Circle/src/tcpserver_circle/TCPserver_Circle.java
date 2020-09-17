/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpserver_circle;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TCPserver_Circle {

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
                String inputline = in.nextLine();
                int radius = Integer.valueOf(inputline);

                if (inputline.equalsIgnoreCase("exit")) {

                    break;
                }
                
                System.out.println("Ok..I will calculate the area of circle for "
                        + "radius =" + radius);
                
                double area = Math.PI * radius * radius;
                inputline = Double.toString(area);
                
                

                out.println(inputline);
            }
        }

        System.out.println("Server stopped.");
    }
    
}
