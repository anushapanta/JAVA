
package lab_assignment_1_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author user
 */
public class Readsdatafromonefile_Writestoanother {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader in =null;
        PrintWriter out=null;
        try{
            in =new BufferedReader(new FileReader("sourcefile.txt"));
            out=new PrintWriter(new PrintWriter("destinationfile.txt"));
            String line;
            while(true){
                line=in.readLine();
                if(line==null)
                    break;
                out.println(line);
            }
        }
        finally{
            if(in!=null)
                in.close();
            if(out!=null)
                out.close();
        }
        
    }
}
