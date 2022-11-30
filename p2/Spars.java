package sakhteman2;

import java.util.Scanner;

public class Spars {
    int[][] array;
    int[][]data;
    int n;
    int [][]b;
    Spars bb=new Spars(b,n);
    Spars spars=new Spars(array,n);
    public Spars(int[][] array, int n) {
        this.array = array;
        this.n = n;
    }
    public void daata(int i,int j,int q,int nzero){
        for (int k=0;k<nzero;k++){
            data[k][0]=i;
            data[k][1]=j;
            data[k][2]=q;
            //array
        }


    }
    public int[][] trans(){
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
            {
                b[i][j]=0;
            }

        for (int i=1;i<b.length;i++)
        {
            bb.data[i][0]=spars.data[i][1];
            bb.data[i][1]=spars.data[i][0];
            bb.data[i][2]=spars.data[i][2];
        }
        return b;
    }
    public static void main(String[] args) {
        int nzero ;
        Scanner a = new Scanner(System.in);
        System.out.println("n matrix:");
        int n = a.nextInt();
        int[][] array=new int[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++){
                array[i][j]=0;

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
            while (i>n) {
                System.out.println("error,row:");
                i = a.nextInt();
            }
            System.out.println("column:");
            int j = a.nextInt();
            while (j>n) {
                System.out.println("error,column:");
                j = a.nextInt();
            }
            System.out.println("value");
            int q = a.nextInt();
            array[i][j] = q;


            spars.daata(i,j,q,nzero);

        }




        // write your code here
    }
}