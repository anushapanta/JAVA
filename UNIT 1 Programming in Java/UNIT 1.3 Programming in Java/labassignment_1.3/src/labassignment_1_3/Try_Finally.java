package labassignment_1_3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Try_Finally {

    private static String name;

    public static void main(String[] args) throws IOException {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("destination.txt"));
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the line :");
            String name = in.nextLine();

            out.println(name);

        } finally {
            if (out != null) {
                out.close();
            }

        }
    }
}
