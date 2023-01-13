package sakhteman3;

public class Queue {
    private int front;
    private int rear;
    private String[] queue;

    public Queue(int size) {
        String[] a = new String[size];
        this.queue = a;
        this.front=-1;
        this.rear = -1;
    }

    public boolean isEmpty(){
        if (this.front == this.rear){
            System.out.println("its empty");
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if (this.rear == this.queue.length-1){
            System.out.println("its full");
            return true;
        }
        System.out.println("its not full");
        return false;
    }

    public boolean insertQueue(String data){
        if (this.rear== this.queue.length-1){
            System.out.println("its full");
            return false;
        }
        else {
            this.rear++;
            queue[rear] = data;
            return true;
        }
    }

    public String deleteQueue(){
        if (this.front == this.rear){
            System.out.println("its empty");
            return null;
        }
        else {
            this.front++;
            String x = this.queue[front];
            System.out.println(x);
            this.queue[front] = null;
            return x;
        }
    }
}
