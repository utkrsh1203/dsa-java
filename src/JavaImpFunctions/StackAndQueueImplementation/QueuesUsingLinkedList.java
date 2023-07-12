package JavaImpFunctions.StackAndQueueImplementation;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class QueuesUsingLinkedList {
    private Node front;
    private Node rear;
    private int size;

    public QueuesUsingLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public void add(int element) {
        Node newNode = new Node(element);

        if (size == 0) {
            front = newNode;
            rear = newNode;
            size = 1;
            return;
        }

        rear.next = newNode;
        rear = newNode;
        size++;
    }

    public int remove() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int n = front.data;
        front = front.next;
        size--;
        return n;
    }

    public int front() {
        return front.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int data[] = { 1, 2, 3, 4, 5 };

        QueuesUsingLinkedList q = new QueuesUsingLinkedList();

        for (int i = 0; i < data.length; i++) {
            q.add(data[i]);
        }

        q.printQueue();

        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // q.enqueue(6);
        // q.enqueue(7);
        // q.enqueue(8);
        // q.printQueue();

    }

}
