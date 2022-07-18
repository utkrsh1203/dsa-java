package Milestone_3.Stacks.StacksUsingLinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class StackUsingLinkedList {
    private Node head;
    private int size;
    // private Node<Integer> tail;

    public StackUsingLinkedList() {
        head = null;
        // tail = null;
        size = 0;
        // Implement the Constructor
    }

    /*----------------- Public Functions of Stack -----------------*/

    // Implement the getSize() function
    public int getSize() {
        return size;
    }

    // Implement the isEmpty() function
    public boolean isEmpty() {
        return size == 0;
    }

    // Implement the push(element) function
    public void push(int element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Implement the pop() function
    public int pop() {
        if (size == 0) {
            return -1;
        }
        int value = head.data;

        head = head.next;
        size--;

        return value;

    }

    // Implement the top() function
    public int top() {
        if (size == 0) {
            return -1;
        }
        return head.data;
    }
}
