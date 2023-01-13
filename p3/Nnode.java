package sakhteman3;

public class Nnode <T>{
    T value;
    Nnode<T> last = null;

    public Nnode(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + '}';
    }
}
