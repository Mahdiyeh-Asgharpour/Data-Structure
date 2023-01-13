package sakhteman3;

public class stack<T> {
    private int size = 0;

    private Nnode<T> top = null;

    public void push(T value) {
        Nnode<T> a = new Nnode<>(value);
        if (this.top == null) this.top = a;
        else {
            a.last = top;

            top = a;
        }
        size++;

    }

    public Nnode<T> pop() throws MyStackEmptyException {
        if (top == null) throw new MyStackEmptyException();
        Nnode<T> w = this.top;
        this.top = top.last;
        size--;
        return w;

    }

    public Nnode<T> top() throws MyStackEmptyException {
        if (top == null) throw new MyStackEmptyException();
        return top;
    }
}
