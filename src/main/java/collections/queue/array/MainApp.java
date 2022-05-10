package collections.queue.array;

public class MainApp {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Initial state of the Queue. Head: " + queue.peek() + ", Size: " + queue.getSize() + ", Queue: " + queue);

        System.out.println("Dequeued " + queue.dequeue() + " from the Queue");

        System.out.println("New head of the Queue: " + queue.peek() + ", New Size: " + queue.getSize() + ", Queue: " + queue);

        System.out.println("Inserting 50 and 60 to the Queue");
        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("New head of the Queue: " + queue.peek() + ", New Size: " + queue.getSize() + ", Queue: " + queue);

    }

}
