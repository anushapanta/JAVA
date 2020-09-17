
package lab_assignment_1_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author student
 */
public class ReadFile {
    public static void main(String[] args)
            throws FileNotFoundException, IOException {
        BufferedReader in=null;
        try{
            in = new BufferedReader(new FileReader("sourcefile.txt"));
            String line;
            while(true){
                line = in.readLine();
                if(line==null)
                    break;
                System.out.println(line);
            }
        }
        finally{
            if(in!=null)
                in.close();
        }
    }
   
}

