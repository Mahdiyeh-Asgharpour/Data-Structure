package DataStructure;

import java.util.Arrays;

public class MyStack {
    private int[] items;
    private int count;

    public MyStack(int size) {
        this.items = new int[size];
    }

    public void push(int item) {
        if (isFull())
            throw new StackOverflowError();

        items[count++] = item;
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[--count];
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public void clear() {
        count = 0;
    }

    @Override
    public String toString() {
        int[] content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }
}
