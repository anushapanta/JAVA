
package labassignment;

import java.util.Scanner;


public class AddTwonumbers {

    private static int addTwonumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1 = s.nextInt();
        
        System.out.println("Enter the second number :");
        int num2 = s.nextInt();
        
        System.out.println("The sum of " + num1 + "and" + num2 + "is " + addTwonumbers(num1, num2));
    }
}
