package sakhteman2;

import java.util.Scanner;



public class Spars {

    int[][] array;
    static int r1, c1, r2, c2;
    int[][] matrix1 = new int[r1][c1];
    int[][] matrix2 = new int[r2][c2];

    public Spars(int[][] array) {
        this.array = array;
    }

    public void input(int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                array[i][j] = 0;
    }

    public void data(int i, int j, int q) {
        array[i][j] = q;
    }

    public void trans(int n) {
        int[][] b = new int[n][n];
        Spars ans0 = new Spars(b);
        ans0.input(n);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (array[i][j] != 0)
                    b[j][i] = array[i][j];
        System.out.println(b.toString());
    }

    public static void protuct(int[][] matrix1, int[][] matrix2) {
        int[][] protuct = new int[r1][c2];
        if (r2 == c1) {
            for (int i = 0; i < r1; i++)
                for (int j = 0; j < c2; j++)
                    for (int k = 0; k < r2; k++) {
                        protuct[i][j] = matrix1[i][k] * matrix2[k][j];
                    }

        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.println(protuct[i][j]);
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("1.spurs,2.protuct");
        int answer = a.nextInt();
        if (answer == 1) {
            System.out.println("n matrix:");
            int n = a.nextInt();
            int[][] array = new int[n][n];
            Spars ans = new Spars(array);
            ans.input(n);
            System.out.println("number of value that isn't 0:");
            int not0 = a.nextInt();
            for (int o = 0; o < not0; o++) {
                System.out.println("row:");
                int row = a.nextInt();
                System.out.println("col:");
                int col = a.nextInt();
                System.out.println("value:");
                int value = a.nextInt();
                ans.data(row, col, value);
                ans.trans(n);

            }
        } else if (answer == 2) {
            System.out.println("matrix1:");
            System.out.println("row");
            int row1 = a.nextInt();
            System.out.println("col");
            int col1 = a.nextInt();
            int[][] matrix1 = new int[row1][];
            for (int i = 0; i < row1; i++)
                for (int j = 0; j < col1; j++) {
                    int input = a.nextInt();
                    matrix1[i][j] = input;
                }
            System.out.println("matrix2:");
            System.out.println("row");
            int row2 = a.nextInt();
            System.out.println("col");
            int col2 = a.nextInt();
            int[][] matrix2 = new int[row2][];

            for (int i = 0; i < row2; i++)
                for (int j = 0; j < col2; j++) {
                    int input = a.nextInt();
                    matrix2[i][j] = input;
                }
            protuct(matrix1, matrix2);


        } else
            System.out.println("error");
        // write your code here
    }
}