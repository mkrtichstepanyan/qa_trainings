package collections.stack.array;

public class Stack<T> {

    private T[] stack;
    private int size;

    public Stack() {
        stack = (T[]) new Object[1];
    }

    public void push(T data) {
        if (stack.length == size) {
            resize(2 * size);
        }
        stack[size++] = data;
    }

    public T pop() {
        T dataToPop = stack[--size];
        if (!isEmpty() && size <= stack.length / 4) {
            resize(stack.length / 2);
        }
        return dataToPop;
    }

    public T peek() {
        return stack[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize(int capacity) {
        System.arraycopy(stack, 0, stack = (T[]) new Object[capacity], 0, size);
    }

}