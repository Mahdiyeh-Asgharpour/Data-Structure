package sakhteman4;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        //binary
        int array[] = new int[]{36, 7, 0, 1, 24, 16, 13};
        sort.binary(array);
        System.out.println("-----------------------");
        //bubble

        int[] array1 = new int[]{16, 33, 245, 7, 9, 1, 3, 22};
        sort.bubble(array1);
        System.out.println("-----------------------");

        //count
        //range 0 to 9
        int[] array2 = new int[]{0, 8, 6, 3, 7, 8, 1, 2, 6, 5, 4, 4, 1};
        sort.count(array2);
        System.out.println("-----------------------");

        //insertion
        int[] array3 = new int[]{0, 32, 27, 20, 17, 5, 4, 9, 1};
        sort.inserton(array3);
        System.out.println("-----------------------");

        //quick
        int[] array4 = new int[]{1, 8, 16, 23, 99, 45, 2, 20, 81, 9};
        array4 = sort.quick(array4, 0, array4.length - 1);
        for (int a : array4) {
            System.out.println(a);
            System.out.println("-----------------------");

            //selection
            int[] array5 = new int[]{45, 6, 7, 13, 2, 1, 22, 16};
            sort.selectionSort(array5);


        }
        System.out.println("-----------------------");
    }
    //binarytree
    //addRecursive
    private binarytree createBinaryTree() {
        binarytree bt = new binarytree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }


}


