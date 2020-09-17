
package lab_assignment_1_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class SimpleInterest {
  public static void main(String[] args)
          throws FileNotFoundException{
      Scanner in=new Scanner(new File("source.txt"));
      PrintWriter out =new PrintWriter(new File("destination.txt"));
      int recordCount=in.nextInt();
      System.out.println("no of records"+recordCount);
      for(int i=1;i<=recordCount;i++){
          String name=in.next();
          float principal=in.nextFloat();
          float rate=in.nextFloat();
          float time=in.nextFloat();
          float result = principal * rate * time;
          float interest=result/100;
          out.printf("%s %.2f %.2f %.2f %.2f %n",
                  name,principal,rate,time,interest);
      }
      in.close();
      out.close();
      System.out.println("Output is printed.......");
  }  
}

   