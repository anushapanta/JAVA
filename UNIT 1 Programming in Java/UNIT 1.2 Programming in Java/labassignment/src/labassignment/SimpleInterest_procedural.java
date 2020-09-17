package labassignment;

import java.util.Scanner;

public class SimpleInterest_procedural {

    private static double SimpleInterest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        return interest;
    }

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter Principal amount:");
        double principal = i.nextDouble();
        System.out.println("Enter Rate :");
        double rate = i.nextDouble();
        System.out.println("Enter Time:");
        double time = i.nextDouble();
        
        System.out.println("Interest =" + SimpleInterest(principal, rate, time));
    }
}
