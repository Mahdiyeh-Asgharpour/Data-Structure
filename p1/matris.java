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

    static void b(int matrix2[][], int matrix[][], int i, int n) {
        int q = 0, w = 0;
        for (int j = 1; j < n; j++) {
            for (int k = 1; k < n; k++) {
                if (k == i) {
                    continue;
                }
                matrix2[q][w] = matrix[j][k];
                w++;
                if (w == n - 1) {
                    q++;
                    w = 0;
                }
            }
        }
    }

     static  int det(int matrix[][], int n) {
        int temp = 0;
        int sum = 0;
        int[][] matrix2 = new int[n][n];
        if (n == 2) {
            sum = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
            return  sum;
        } else {
            for (int i = 0; i < n; i++) {
                b(matrix2, matrix, i, n);
                sum += matrix[0][1] * pow(-1,i) * det(matrix2, n - 1);

            }
        }
        return sum;


    }


    public static void main(String[] args) {
        System.out.println("n:");
        Scanner a=new Scanner(System.in);
        int n =a.nextInt();
        int[][] matrix = new int[n][n];
        inter(matrix,n);
        int det=det(matrix,n);
        System.out.println(det);



    }
}
