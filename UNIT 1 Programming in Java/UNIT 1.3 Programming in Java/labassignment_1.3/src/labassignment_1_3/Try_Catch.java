package labassignment_1_3;

import java.util.Scanner;

public class Try_Catch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = in.nextInt();
        System.out.println("Enter b:");
        int b = in.nextInt();
        try {
            float result = b/a;
            System.out.println("Result ="+result);
        }
        catch(Exception e){
            System.out.println("Undefined value");
        }
        finally{
            System.out.println("Program Completed....");
        }
    }
}
