package collections.queue.array;

import java.util.Arrays;

import static java.lang.reflect.Array.newInstance;


public class Queue<T> {

    private final T[] queue;
    private final int capacity;

    private int head;
    private int tail;
    private int size;

    public Queue(int capacity) {
        queue = (T[]) newInstance(Object.class, capacity);
        this.capacity = capacity;
        head = 0;
        size = 0;
        tail = -1;
    }

    public void enqueue(T data) {
        if (isFull()) {
            System.out.println("Queue is Full!");
            return;
        }
        tail = (tail + 1) % capacity;
        queue[tail] = data;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return null;
        }
        T dataToRemove = queue[head];
        head = (head + 1) % capacity;
        size--;
        return dataToRemove;
    }

    public T peek() {
        return queue[head];
    }

    public int getSize() {
        return size;
    }

    private boolean isFull() {
        return size == capacity;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
