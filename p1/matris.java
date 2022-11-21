package sakhteman1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class matris {

    int n;
    int[][] matrix = new int[n][n];

    static void inter(int matrix[][], int n) {
        Scanner b = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = b.nextInt();

            }
        }
    }

    public static int det(int matrix[][], int n) {
        int sum = 0;
        int matrix2[][] = new int[n][n];
        if (n == 1) return matrix[0][0];
        else if (n == 2) {
            sum = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
            return sum;
        } else {
            for (int k = 0; k < n; k++) {
                int q = 0;
                int w = 0;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (j == k) continue;
                        matrix2[q][w] = matrix[i][j];
                        w++;
                        if (w == n - 1) {
                            q++;
                            w = 0;
                        }
                    }
                }
                sum += sum+ matrix[0][k] * pow(-1, k) * det(matrix2, n - 1);

            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("n:");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int[][] matrix = new int[n][n];
        inter(matrix, n);
        int det = det(matrix, n);
        System.out.println(det);


    }
}
