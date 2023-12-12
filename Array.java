public class Array<T> {
    private T[] array;
    private int size;

    public Array(int size, T element) {
        this.array = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            this.array[i] = element;
        }
        this.size = size;
    }

    // Implement the other methods as described in your assignment
}
