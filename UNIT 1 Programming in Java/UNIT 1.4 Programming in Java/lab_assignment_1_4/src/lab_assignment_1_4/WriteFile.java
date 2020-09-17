
package lab_assignment_1_4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author student
 */
public class WriteFile {
    private static String name;
    public static void main(String[] args) throws IOException {
        PrintWriter out = null;
        try{
            out = new PrintWriter(new FileWriter("destinationwritefile.txt"));
            Scanner in =new Scanner(System.in);
           
            while(true){
                System.out.println("Enter the line :");
                String name = in.nextLine();
               
                if(name.equals("quit"))
                    break;
                out.println(name);
           
            }
        }
        finally{
            if(out!=null)
                out.close();
           
        }
    }
   
}