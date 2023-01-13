package DataStructure;

import java.util.Arrays;

public class MyQueue {
    private int[] items;
    private int rear;
    private int front;
    private int count;

    public MyQueue(int size) {
        items = new int[size];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public void enqueue(int item) {
        if (isFull())
            throw new IllegalStateException();

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        int item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;

        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
