package sakhteman1;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Scanner;

import static java.util.Collections.swap;

public class string {
    int m=1;
    public static void  permvtation(String s, int m, int n){
        if (m==n){
            System.out.println(s+"\n");
        }else {
            for (int i=m;i<=n;i++)
            {
                s= swap(s,m,i);
                permvtation(s,m+1,n);
                s= swap(s,m,i);

            }
            System.out.println(s+"\n");
        }
    }
    public static String swap(String s, int m, int n)
    {
        char temp;
        char[] chars=s.toCharArray();

        temp =chars[m];
        chars[m]=chars[n];
        chars[n]=temp;
        return  String.valueOf(chars);

    }




}
