package sakhteman4;

import java.util.Arrays;

public class sort {
    public static int[] binary(int[] array){

        for (int i = 1;i<array.length;i++){
            int x = array[i];

            int j = Math.abs(Arrays.binarySearch(array,0,i,x)+1);
            for (int z=i;i>j;i--){
                array[i] = array[i-1];
            }
            array[j] = x;
        }

        for (int a : array){
            System.out.println(a);
        }
        return array;
    }
    public static int[] bubble(int[] array){
        int[] a = array;
        boolean swapped;
        int n=array.length,temp;
        for (int i =0;i<n-1;i++){
            swapped = false;
            for (int j =0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }

        for (int b : a){
            System.out.println(b);
        }
        return a;
    }
    public static void count(int[] array){
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for(int i =0;i<10;i++){
            count[i] = 0;
        }


        for (int i =0;i<n;i++){
            int x = array[i];
            count[x]+=1;
        }

        int cnt = -1;
        for (int i =0;i<10;i++){
            int x = count[i];

            for (int j = 0 ; j<x;j++){
                cnt++;
                output[cnt] = i;

            }
        }

        for (int a : output){
            System.out.println(a);
        }

    }
    public static int[] inserton(int[] array){
        int[] a = array;
        int n=array.length,temp,j;
        for (int i =0;i<n;i++){
            temp= a[i];
            j=i-1;
            while (j>=0 && a[j] > temp){
                a[j+1] = a[j];
                j-=1;
            }
            a[j+1] = temp;
        }

        for (int b : a){
            System.out.println(b);
        }
        return a;
    }
    //quick
    public static int[] quick(int[] array, int s, int e){
        if(s<e){
            int m = partition(array,s,e);
            quick(array,s,m-1);
            quick(array,m+1,e);
        }
        return array;
    }

    private static int partition(int[] array, int p, int r){
        int a = array[r] , i=p-1;
        for (int j=p;j<=r-1;j++){
            if(array[j] <= a){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[r];
        array[r] = temp;
        return i+1;
    }
    //selection
    public static int[] selectionSort(int[] array){
        int[] a = array;
        int m=0,n=array.length,temp;
        for (int i =0;i<n-1;i++){
            m = i;
            for (int j =i+1;j<n;j++){
                if (a[j] < a[m]){
                    m = j;
                }
            }

            temp = a[i];
            a[i] = a[m];
            a[m] = temp;
        }

        for (int b : array){
            System.out.println(b);
        }
        return a;
    }
}
