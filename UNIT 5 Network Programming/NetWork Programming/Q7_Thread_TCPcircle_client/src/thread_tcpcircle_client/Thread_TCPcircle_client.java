/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_tcpcircle_client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Thread_TCPcircle_client {

    public static void main(String[] args) throws IOException {
        final String HOST = "127.0.0.1";
        final int PORT = 1234;

        System.out.println("Client started..........");
        System.out.println("Calculate area of circle..........");

        try (
                Socket socket = new Socket(HOST, PORT);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                Scanner in = new Scanner(socket.getInputStream());
                Scanner s = new Scanner(System.in);) {
            while (true) {
                System.out.println("Enter Radius");
                String radius = s.nextLine();
                out.println(radius);
                if (radius.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.println("\n AREA of Circle is :" + in.nextLine());
            }
        }
    }
    
}
