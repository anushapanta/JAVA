package labassignment;

import java.util.Scanner;

public class Sum_Ofarray {

    private static int Sum(int[] data) {
        int i, sum = 0;
        for (i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] data = {1, 2, 3, 4, 5,6};
        System.out.println("Sum =" + Sum(data));

    }
}
