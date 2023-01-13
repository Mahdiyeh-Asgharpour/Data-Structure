package sakhteman3;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();
        ll.insertAtEnd(new Node(2));
        ll.insertAtEnd(new Node(4));
        ll.insertAtBegin(new Node(9));
        ll.insertAtBegin(new Node(10));
        ll.print();
        //stack
        stack<Integer> myStack1 = new stack<>();
        myStack1.push(1);
        myStack1.push(2);
        myStack1.push(3);
        myStack1.push(4);
        System.out.println(myStack1.top());

        System.out.println(myStack1.pop());
        System.out.println(myStack1.pop());
        System.out.println(myStack1.pop());
        System.out.println(myStack1.pop());
        try {
            System.out.println(myStack1.pop());
        } catch (MyStackEmptyException e) {
            System.out.println(e.getMessage());
        }
        // queue
        Queue Queue = new Queue(5);
        Queue.isEmpty();
        Queue.isFull();

        Queue.insertQueue("hello");
        Queue.insertQueue("123");

        Queue.deleteQueue();
        Queue.deleteQueue();
        Queue.deleteQueue();
        // write your code here
    }
}
