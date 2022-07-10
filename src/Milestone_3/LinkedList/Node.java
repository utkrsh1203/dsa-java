package Milestone_3.LinkedList;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }

}

class UseLinkedList {

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return n1;
    }

    public static void printLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        // Node<Integer> n1 = new Node<>(10);
        // System.out.println(n1.data);
        // System.out.println(n1.next);

        Node<Integer> head = createLinkedList();
        printLinkedList(head);
    }
}