package sakhteman3;


public class DoublyLinkedList {
    public Node head;
    public Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(Node newNode) {
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAtBegin(Node newNode) {
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        }
    }
    public void deleteAtBegin() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;

        }
    }

    public void deleteAtEnd() {
        if (isEmpty()) {
            System.out.println("Empty");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next.prev = null;
            tail.next = null;
        }
    }
    public boolean isEmpty() {
        return head == null;
    }


    public void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("Empty");
        }
    }

}