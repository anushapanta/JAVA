
package lab_assignment_1_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class DuplicateCharacter {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File inputFile =new File("srcfile.txt");
        File outputFile = new File("dstfile.txt");
        FileReader in = null;
        FileWriter out = null;
        int charData;
        try {
            in = new FileReader(inputFile);
            out = new FileWriter(outputFile);
            while(true){
                charData = in.read();
                if(charData==-1)
                    break;
                out.write(charData);
                out.write(charData);
            }
            System.out.println("Output is printed............");
        }
        finally{
            if(in!=null)
                in.close();
            if(out!=null)
                out.close();
        }
    }
    
}
