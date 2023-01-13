package DataStructure;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Tree
        MyBinaryTree tree = new MyBinaryTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        tree.traversePreOrder();
        System.out.println();
        tree.traverseInOrder();
        System.out.println();
        tree.traverseLevelOrder();

        // Heap
        MyHeap heap = new MyHeap(10);
        heap.insert(10);
        heap.insert(5);
        heap.insert(17);
        heap.insert(4);
        heap.insert(22);
        heap.remove();
        System.out.println();

        // Sort
        int[] arr = {10, 8, 16, 52, 95, 51};
        MySort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
