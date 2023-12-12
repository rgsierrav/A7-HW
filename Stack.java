public class Stack<T> {
    private java.util.LinkedList<T> list = new java.util.LinkedList<T>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(T element) {
        list.addFirst(element);
    }

    public T pop() {
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("Stack is empty");
        }
        return list.removeFirst();
    }

    public T top() {
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("Stack is empty");
        }
        return list.getFirst();
    }
}
