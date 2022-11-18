package sakhteman1;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Scanner;

public class string {
    Scanner a=new Scanner(System.in);
    String s=a.next();
    int n=s.length();
    int m=1;
    public void  permvtation( String s ,int m,int n){
        if (m==n){
            System.out.println(s+"\n");
        }else {
            for (int i=m;i<=n;i++)
            {
                SWAP(s[m],s[i]);
                permvtation(s,m+1,n);
                SWAP(s[m],s[i]);
            }
        }
    }

}
