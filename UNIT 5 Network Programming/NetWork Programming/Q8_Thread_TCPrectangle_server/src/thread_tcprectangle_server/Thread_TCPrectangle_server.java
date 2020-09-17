/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_tcprectangle_server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Thread_TCPrectangle_server {

    public static void main(String[] args) throws IOException, NumberFormatException {
        final int PORT = 1234;
        ServerSocket serverSocket = new ServerSocket(PORT);

        System.out.println("Server started.");
        System.out.println("Listening to client..........");

        while (true) {
            Socket clientSocket = serverSocket.accept();
            Thread t = new Thread() {
                @Override
                public void run() {
                    try (
                            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                            Scanner in = new Scanner(clientSocket.getInputStream());) {
                        while (in.hasNextLine()) {
                            String line1 = in.nextLine();
                            int length = Integer.valueOf(line1);
                            String line2 = in.nextLine();
                            int breadth = Integer.valueOf(line2);

                            if (line1.equalsIgnoreCase("exit")) {

                                break;
                            }

                            System.out.println("\nOk..I will calculate the area of rectangle for "
                                    + "length =" + length + "breadth=" + breadth);

                            double area = length * breadth;
                            String inputline = Double.toString(area);

                            out.println(inputline);
                        }
                    } catch (IOException e) {
                    }
                }
            };
            t.start();
        }

    }

}
