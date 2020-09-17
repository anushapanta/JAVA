/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_clientside;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Q1_ClientSide {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        final String HOST = "127.0.0.1";
        final int PORT = 6789;

        System.out.println("Client started.");
        try (
                Socket socket = new Socket(HOST, PORT);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                Scanner in = new Scanner(socket.getInputStream());
                Scanner s = new Scanner(System.in);
        ) {
            while (true) {
                System.out.print("Hello ");
                String input = s.nextLine();
                out.println(input);
                if (input.equalsIgnoreCase("exit")) break;

                System.out.println("Reply from server: " + in.nextLine());
            }
        }
    }
    
}
