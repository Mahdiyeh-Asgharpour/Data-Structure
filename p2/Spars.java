package test;

import java.util.Scanner;


public class Spars {

    int[][] matrix;

    public Spars(int n, int m) {
        this.matrix = new int[n][m];
    }

    public void input(int n, int m) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = 0;
    }

    public void data(int i, int j, int q) {
        matrix[i][j] = q;
    }

    public void trans() {
        Spars ans0 = new Spars(matrix.length, matrix[0].length);

        ans0.input(matrix.length, 3);
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if (matrix[i][j] != 0) {
                    ans0.data(j, i, matrix[i][j]);
                }
    }

    public static void product(int[][] matrix1, int[][] matrix2) {
        int[][] product = new int[matrix1.length][matrix2[0].length];
        if (matrix1[0].length == matrix2.length)
            for (int i = 0; i < matrix1.length; i++)
                for (int j = 0; j < matrix2[0].length; j++)
                    for (int k = 0; k < matrix1[0].length; k++)
                        product[i][j] = matrix1[i][k] * matrix2[k][j];

        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix2[0].length; j++)
                System.out.println(product[i][j]);
            System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("""
                1. Transpose of Spars
                2. product
                """);

        int answer = a.nextInt();
        if (answer == 1) {
            System.out.println("number of rows:");
            int n = a.nextInt();
            System.out.println("number of columns:");
            int m = a.nextInt();
            Spars ans = new Spars(n, m);
            ans.input(n, m);
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
            }
            ans.trans();
        } else if (answer == 2) {
            System.out.println("matrix1:");
            System.out.println("rows:");
            int row1 = a.nextInt();
            System.out.println("cols:");
            int col1 = a.nextInt();
            int[][] matrix1 = new int[row1][col1];
            for (int i = 0; i < row1; i++)
                for (int j = 0; j < col1; j++)
                    matrix1[i][j] = a.nextInt();
            System.out.println("matrix2:");
            System.out.println("rows");
            int row2 = a.nextInt();
            System.out.println("cols");
            int col2 = a.nextInt();
            int[][] matrix2 = new int[row2][col2];
            for (int i = 0; i < row2; i++)
                for (int j = 0; j < col2; j++)
                    matrix2[i][j] = a.nextInt();

            product(matrix1, matrix2);
        } else
            System.out.println("error");
        // write your code here
    }
}