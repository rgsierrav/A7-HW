import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        this.list = new LinkedList<>();
    }

    public void push(T element) {
        list.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }

    public T top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
