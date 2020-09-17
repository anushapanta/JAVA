
package labassignment;

import java.util.Scanner;

public class Balanced_Array {

    private static int Check_Balanced_Array(int[] data) {
        int i = 0;
        int even_count = 0;
        int odd_count = 0;
        int array_length = data.length;
        for (i = 0; i < data.length; i += 2) {

            if (data[i] % 2 == 0) {
                even_count += 1;
            }
        }
        for (i = 1; i < data.length; i += 2) {

            if (data[i] % 2 == 1) {
                odd_count += 1;
            }

        }
//        System.out.println("even="+even_count+"odd="+odd_count+"array="+array_length);
        if (even_count + odd_count == array_length) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = {0, 1, 2, 3, 4, 5, 9};
        int result = Check_Balanced_Array(data);
        if (result == 1) {
            System.out.println(result + "\tThe given array is balanced.....");
        } else {
            System.out.println(result + "\tThe given array is not balanced.....");
        }
    }

}
