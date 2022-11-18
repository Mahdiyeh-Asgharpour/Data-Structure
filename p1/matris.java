package sakhteman1;

import java.util.Scanner;

public class matris {
    Scanner a=new Scanner(System.in);
    int n=a.nextInt();
    int[][]matris =new int[n][n];
    int[][]k =new int[n-1][n-1];
    int s=0,w=1;
    public void get(int n){
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                matris[i][j]=a.nextInt();
    }
    public void getk(int n){
        for (int i=0;i<n-1;i++)
            for (int j=0;j<n-1;j++)
                matris[i][j]=a.nextInt();
    }



    public double det(int[][] matris, int n){
        if (n==1)
            return matris[1][1];
        else
        {
            for (int j=0;j<n;j++){
                for (int ii=2;ii<=n;ii++){
                    for (int jj=0;jj<n;jj++){
                        if (jj<j) k[ii-1][jj]=matris[ii][jj];
                        if (jj>j){
                            k[ii-1][jj-1]=matris[ii][jj];

                        }

                    }
                    s=s+(matris[1][j]*w*det(k[n-1][n-1],n-1));
                    w=-1*w;
                    return s;
                }

            }
        }
        System.out.println(s);
    }

}
