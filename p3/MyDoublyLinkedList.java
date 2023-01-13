package DataStructure;

public class MyDoublyLinkedList {
    private class Node {
        public int data;
        public Node next;
        public Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    public void insert(Node preNode, int data) {
        Node newNode = new Node(data);
        if (preNode != null) {
            newNode.next = preNode.next;
            newNode.prev = preNode;
            if (preNode.next != null)
                preNode.next.prev = newNode;
            preNode.next = newNode;
        } else {

            newNode.prev = null;
        }
    }
}
