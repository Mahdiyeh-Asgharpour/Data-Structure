package sakhteman2;

import java.util.Scanner;

public class Spars {
    int[][] array;
    int[][] data;
    int n;
    int[][] b;
    Spars bb = new Spars(b, n);
    Spars spars = new Spars(array, n);

    public Spars(int[][] array, int n) {
        this.array = array;
        this.n = n;
    }

    public void daata(int i, int j, int q, int nzero) {
        for (int k = 0; k < nzero; k++) {
            data[k][0] = i;
            data[k][1] = j;
            data[k][2] = q;
            //array
        }


    }

    public int[][] trans() {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                b[i][j] = 0;
            }

        for (int i = 1; i < b.length; i++) {
            bb.data[i][0] = spars.data[i][1];
            bb.data[i][1] = spars.data[i][0];
            bb.data[i][2] = spars.data[i][2];
        }
        return b;
    }
    public int[][] protuct(){
        int[][] protuct;
      if (row2==col1){
          protuct=new int[row1][col2];
          for (int i=0;i<row1;i++)
              for (int j=0;j<col2;j++)
                  for (int k=0;k<row2;k++){
                      protuct[i][j]=array1[i][k]*array2[k][j];
                  }

      }return protuct[row1][col2];
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("1.spurs");
        System.out.println("2.protuct");
        int answer = a.nextInt();
        if (answer == 1) {
            int nzero;
            System.out.println("n matrix:");
            int n = a.nextInt();
            int[][] array = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) {
                    array[i][j] = 0;

                }
            System.out.println("number of values that isn't 0:");
            nzero = a.nextInt();

            while (n <= nzero) {
                System.out.println("error please type number again:");
                nzero = a.nextInt();

            }

            for (int k = 1; k <= nzero; k++) {
                System.out.println("row:");
                int i = a.nextInt();
                while (i > n) {
                    System.out.println("error,row:");
                    i = a.nextInt();
                }
                System.out.println("column:");
                int j = a.nextInt();
                while (j > n) {
                    System.out.println("error,column:");
                    j = a.nextInt();
                }
                System.out.println("value");
                int q = a.nextInt();
                array[i][j] = q;


                spars.daata(i, j, q, nzero);

            }

        } else if (answer == 2) {int nzero1;
            System.out.println("row matrix1:");
            int row1 = a.nextInt();
            System.out.println("col matrix1:");
            int col1=a.nextInt();
            int[][] array1 = new int[row1][col1];
            for (int i = 0; i < row1; i++)
                for (int j = 0; j < col1; j++) {
                    array1[i][j] =0;

                }
            System.out.println("number of values that isn't 0:");
            nzero1 = a.nextInt();

            while (row1 <= nzero1 && col1<=nzero1) {
                System.out.println("error please type number again:");
                nzero1 = a.nextInt();

            }

            for (int k = 1; k <= nzero1; k++) {
                System.out.println("row:");
                int i = a.nextInt();
                while (i > row1) {
                    System.out.println("error,row:");
                    i = a.nextInt();
                }
                System.out.println("column:");
                int j = a.nextInt();
                while (j > col1) {
                    System.out.println("error,column:");
                    j = a.nextInt();
                }
                System.out.println("value");
                int q = a.nextInt();
                array1[i][j] = q;




            }
            int nzero2;
            System.out.println("row matrix2:");
            int row2 = a.nextInt();
            System.out.println("col matrix2:");
            int col2 = a.nextInt();

            int[][] array2 = new int[row2][col2];
            for (int i = 0; i < row2; i++)
                for (int j = 0; j < col2; j++) {
                    array2[i][j] = 0;

                }
            System.out.println("number of values that isn't 0:");
            nzero2 = a.nextInt();

            while (row2 <= nzero2 && col2<=nzero2) {
                System.out.println("error please type number again:");
                nzero2 = a.nextInt();

            }

            for (int k = 1; k <= nzero2; k++) {
                System.out.println("row:");
                int i = a.nextInt();
                while (i >row2) {
                    System.out.println("error,row:");
                    i = a.nextInt();
                }
                System.out.println("column:");
                int j = a.nextInt();
                while (j >col2) {
                    System.out.println("error,column:");
                    j = a.nextInt();
                }
                System.out.println("value");
                int q = a.nextInt();
                array2[i][j] = q;


            }


        } else System.out.println("error");

        // write your code here
    }
}