package collections.stack.array;

public class MainApp {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Initial state of the Stack. Top Item: " + stack.peek() + ", Size: " + stack.size());

        System.out.println("Popped " + stack.pop() + " from the Stack");

        System.out.println("Top of the Stack: " + stack.peek() + ", Size of the stack: " + stack.size());

    }

}
