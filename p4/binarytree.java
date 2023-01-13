package sakhteman4;

import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.Queue;

public class binarytree {
    nodetree root;
    private nodetree addRecursive(nodetree current, int value) {
        if (current == null) {
            return new nodetree(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }
    public void add(int value) {
        root = addRecursive(root, value);
    }
    //omgh
    public void traverseInOrder(nodetree node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
    public void traversePreOrder(nodetree node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traversePostOrder(nodetree node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }
    //sath
    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<nodetree> nodes = new LinkedList<>();
        nodes.add( root);

        while (!nodes.isEmpty()) {

            nodetree node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right!= null) {
                nodes.add(node.right);
            }
        }
    }
}
