package collections.linkedlist;

public class LinkedList<T> implements List<T> {

    private Node<T> root;
    private int size;

    @Override
    public void insert(T data) {
        Node<T> node = new Node<>(data);
        node.setNextNode(root);
        root = node;
        size++;
    }

    @Override
    public void remove(T data) {
        if (root.getData().equals(data)) {
            root = root.getNextNode();
        } else {
            Node<T> previousNode = root;
            Node<T> currentNode = root.getNextNode();
            while (currentNode != null) {
                if (currentNode.getData().equals(data)) {
                    previousNode.setNextNode(currentNode.getNextNode());
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNextNode();
            }
        }
        size--;
    }

    @Override
    public void removeRecursively(T data) {
        if (root.getData().equals(data)) {
            root = root.getNextNode();
        } else {
            removeRecursively(data, root, root.getNextNode());
        }
        size--;
    }

    private void removeRecursively(T data, Node<T> previousNode, Node<T> currentNode) {
        if (currentNode == null) {
            return;
        }
        if (currentNode.getData().equals(data)) {
            previousNode.setNextNode(currentNode.getNextNode());
            return;
        }
        removeRecursively(data, currentNode, currentNode.getNextNode());
    }

    @Override
    public void traverse() {
        if (isEmpty()) {
            System.out.println("List is empty!");
        }
        Node<T> currentNode = root;
        while (currentNode != null) {
            System.out.print(currentNode);
            currentNode = currentNode.getNextNode();
        }
        System.out.println();
    }

    @Override
    public void traverseRecursively() {
        if (isEmpty()) {
            System.out.println("List is empty!");
        }
        traverse(root);
        System.out.println();
    }

    void traverse(Node<T> node) {
        if (node == null) {
            return;
        }
        System.out.print(node);
        traverse(node.getNextNode());
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}
