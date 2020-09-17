package labassignment;

public class Operation_2Darray {

    public static void main(String[] args) {
        double[][] a = {{1, 2},
        {3, 4}};
        double[][] b = {{5, 6},
        {7, 8}};

        System.out.println("Matrix A ::");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matrix B ::");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        Sum(a, b);
        Difference(a, b);
        Product(a, b);
    }

    public static void Sum(double[][] a, double[][] b) {
        double sum[][] = new double[2][2];
        int i = 0, j = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println();
        System.out.println("Sum of the matrix A and matrix B ::");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void Difference(double[][] a, double[][] b) {
        double difference[][] = new double[2][2];
        int i = 0, j = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                difference[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println();
        System.out.println("Difference of the matrix A and matrix B ::");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                System.out.print(difference[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void Product(double[][] a, double[][] b) {
        double product[][] = new double[2][2];
        int i = 0, j = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                for (int k = 0; k < 2; k++) {
                    product[i][j] = product[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        System.out.println();
        System.out.println("Product of the matrix A and matrix B ::");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                System.out.print(product[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
