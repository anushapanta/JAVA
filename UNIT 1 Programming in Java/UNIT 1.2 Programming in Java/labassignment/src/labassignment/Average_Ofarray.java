
package labassignment;

import java.util.Scanner;


public class Average_Ofarray {

    private static float Average(float[] data) {
        float sum = 0;
        int i;
        float l = data.length;
        for (i = 0; i < l; i++) {
            sum = sum + data[i];
        }
        return sum / l;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Average =" + Average(data));

    }
}
