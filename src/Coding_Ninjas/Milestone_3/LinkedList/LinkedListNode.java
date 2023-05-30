package Coding_Ninjas.Milestone_3.LinkedList;

public class LinkedListNode<T> {
    public T data;
    public LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }

}

class UseLinkedList {

    public static LinkedListNode<Integer> createLinkedList() {
        LinkedListNode<Integer> n1 = new LinkedListNode<>(10);
        LinkedListNode<Integer> n2 = new LinkedListNode<>(20);
        LinkedListNode<Integer> n3 = new LinkedListNode<>(30);
        LinkedListNode<Integer> n4 = new LinkedListNode<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        return n1;
    }

    public static void printLinkedList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        // LinkedListNode<Integer> n1 = new LinkedListNode<>(10);
        // System.out.println(n1.data);
        // System.out.println(n1.next);

        LinkedListNode<Integer> head = createLinkedList();
        printLinkedList(head);
    }
}